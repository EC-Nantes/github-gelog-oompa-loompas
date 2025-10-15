/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

import java.util.Random;
import static tp.projettp.World.elements;

/**
 *
 * @author julda
 */

public abstract class Creature extends ElementDeJeu implements Deplacable{
    protected String nom;
    protected int ptVie;
    protected int ptPar;
    protected int pagePar;
    protected int degAtt;
    protected int pageAtt;
    protected int distAMax;

    public int getDegAtt() {
        return degAtt;
    }

    public int getPageAtt() {
        return pageAtt;
    }

    public int getDistAMax() {
        return distAMax;
    }

    public void setDegAtt(int degAtt) {
        this.degAtt = degAtt;
    }

    public void setPageAtt(int pageAtt) {
        this.pageAtt = pageAtt;
    }

    public void setDistAMax(int distAMax) {
        this.distAMax = distAMax;
    }
    
    public void parler(String discours){
        System.out.println(this.getNom()+" : '"+discours+"'");
    }

    /**
     *position 2D de la créature
     */
    protected Point2D pos;
    
    public int getPtVie(){
        return this.ptVie;
    }

    /**
     *
     * @param pv pv du monstre
     */
    public void setPtVie(int pv){
        this.ptVie=pv;
    }

    /**
     *
     * @return pourcentage d'attaques réussies
     */

    /**
     *
     * @return pourcentage d'attaques parées
     */
    public int getPagePar() {
        return pagePar;
    }

    /**
     *
     * @param pagePar évolution du pourcentage d'attaque
     */
    public void setPagePar(int pagePar) {
        this.pagePar = pagePar;
    }

    /**
     *
     * @param ptPar nouvelle valeur de parade d'attaque
     */
    public void setPtPar(int ptPar) {
        this.ptPar = ptPar;
    }

    /**
     *
     * @return
     */
    public int getPtPar() {
        return ptPar;
    }

    /**
     *
     * @return objet Point2D du monstre (Attention : ne renvoie pas la position (x,y) du monstre)
     */
    @Override
    public Point2D getPos() {
        return pos;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     *
     * @return coordonnée X de la créature
     */
    public int getX() {
        return pos.getX();
    }

    /**
     *
     * @return coordonnée Y de la créature
     */
    public int getY() {
        return pos.getY();
    }

    /**
     *
     * @param pos position en classe Point2D
     */
    @Override
    public void setPos(Point2D pos) {
        this.pos = pos;
    }

    /**
     *déplace de pmanière aléatoire le monstre sur une case adjacente (de manière aléatoire)
     */
    @Override
    public void deplacer(){
        Random alea= new Random();
        boolean bloque=true;
        int i=-1;
        int j=-1;
        Point2D newPos;
        //vérifier si la créature n'est pas bloquée par les autres
        while (i<1 && bloque){
            while (j<1 && bloque){
                newPos = new Point2D(this.pos.getX()+i,this.pos.getY()+j);
                if (!newPos.verifierCase(elements)){
                    bloque=false;
                }
            }
        }
        do{
        //génération d'une nouvelle coordonée pour la créature
        int randomx=0;/*@param  déplacement du monstre selon x*/
        int randomy=0;/*@param  déplacement du monstre selon y*/
        while(randomx==0&&randomy==0){
            randomx=alea.nextInt(3)-1;
            randomy=alea.nextInt(3)-1;
        }
        newPos=new Point2D(this.pos.getX()+randomx,this.pos.getY()+randomy);
        }while(newPos.verifierCase(elements));
        this.pos=newPos;
    }
    public void deplacer(char c){
    int i=0;
    int j=0;
        switch (c) {
            case 'z' -> i++;
            case 'q' -> j--;
            case 's' -> i--;
            case 'd' -> j++;
            default -> {
            }
        }
        Point2D newPos = new Point2D(this.pos.getX()+j,this.pos.getY()+i);
                if (!newPos.verifierCase(elements)){
                    this.setPos(newPos);
                }}

    /**
     *affiche la position actuelle du monstre
     */
    public void affiche(){
        System.out.println("position de "+this.getNom()+" : ["+this.pos.getX()+","+this.pos.getY()+"]");
    }

    /**
     *
     * @param degats
     */
    public void loosePV(int degats){
        if (degats<0){
            System.out.println("Aucun dégât reçu");
        }
        else{
            this.setPtVie(this.getPtVie()-degats);
        }
    }
    public Creature creatureProche(){
        Creature cible=this;
        double distance = Double.MAX_VALUE;
        for (ElementDeJeu elem: elements){
            if (elem instanceof Creature crea){
                if(distance > this.pos.distance(crea.getPos()) && crea.getPos()!=this.pos){
                    cible=crea;
                    distance=this.pos.distance(crea.getPos());
                }
            }
        }
        return cible;
    }
}
