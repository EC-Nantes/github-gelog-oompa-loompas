/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

import java.util.Random;

/**
 *
 * @author julda
 */

public class Creature {
    private String nom;
    private int ptVie;
    private int ptPar;
    private int degAtt;
    private int pageAtt;
    private int pagePar;

    /**
     *position 2D de la créature
     */
    protected Point2D pos;
    private int distAttMax;
    
    /**
     *
     * @param nom nom de la créature
     * @param pV points de vie de la créature
     * @param dAMax dist max attaque
     * @param ptP point de parade d'attaque
     * @param dA distance d'attaque
     * @param paAtt pourcentage attaque
     * @param paPar pourcentage parade
     * @param p position (Point 2D)
     */
    public Creature(String nom, int pV, int dAMax, int ptP, int dA,int paAtt,int paPar,Point2D p){
        this.ptVie=pV;
        this.degAtt=dA;
        this.pageAtt=paAtt;
        this.pagePar=paPar;
        this.pos=p;
        this.ptPar=ptP;
        this.distAttMax=dAMax;
    }

    /**
     *
     * @param c créature à copier
     */
    public Creature(Creature c){
        this.ptVie=c.ptVie;
        this.degAtt=c.degAtt;
        this.pageAtt=c.pageAtt;
        this.pagePar=c.pagePar;
        this.pos=new Point2D(c.getPos());
        this.ptPar=c.ptPar;
        this.distAttMax=c.distAttMax;
    }

    /**
     *
     */
    public Creature(){
        this.ptVie=50;
        this.degAtt=50;
        this.pageAtt=50;
        this.pagePar=10;
        this.pos=new Point2D();
        this.ptPar=5;
        this.distAttMax=1;
    }

    /**
     *
     * @return points de vie restants du monstre
     */
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
     * @return dégâts d'attaque
     */
    public int getDegAtt() {
        return degAtt;
    }

    /**
     *
     * @param degAtt nouvelle force d'attaque du monstre
     */
    public void setDegAtt(int degAtt) {
        this.degAtt = degAtt;
    }

    /**
     *
     * @return pourcentage d'attaques réussies
     */
    public int getPageAtt() {
        return pageAtt;
    }

    /**
     *
     * @param pageAtt nouvelle valeur du pourcentage d'attaques réussies
     */
    public void setPageAtt(int pageAtt) {
        this.pageAtt = pageAtt;
    }

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
    public void setPos(Point2D pos) {
        this.pos = pos;
    }

    /**
     *déplace de pmanière aléatoire le monstre sur une case adjacente (de manière aléatoire)
     */
    public void deplace(){
        Random alea= new Random();
        int randomx=0;/*@param  déplacement du monstre selon x*/
        int randomy=0;/*@param  déplacement du monstre selon y*/
        while(randomx==0&&randomy==0){
            randomx=alea.nextInt(3)-1;
            randomy=alea.nextInt(3)-1;
        }
        this.pos.setPosition(this.pos.getX()+randomx,this.pos.getY()+randomy);
    }

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

    /**
     *
     * @return
     */
    public int getDistAttMax() {
        return distAttMax;
    }

    /**
     *
     * @param distAttMax
     */
    public void setDistAttMax(int distAttMax) {
        this.distAttMax = distAttMax;
    }

    
}
