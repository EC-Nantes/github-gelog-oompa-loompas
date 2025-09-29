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
    protected Point2D pos;
    public Creature(String nom, int pV,int ptP, int dA,int paAtt,int paPar,Point2D p){
        this.ptVie=pV;
        this.degAtt=dA;
        this.pageAtt=paAtt;
        this.pagePar=paPar;
        this.pos=p;
        this.ptPar=ptP;
    }
    public Creature(Creature c){
        this.ptVie=c.ptVie;
        this.degAtt=c.degAtt;
        this.pageAtt=c.pageAtt;
        this.pagePar=c.pagePar;
        this.pos=c.pos;
    }
    public Creature(){
        Point2D p=new Point2D();
        this.ptVie=50;
        this.degAtt=50;
        this.pageAtt=50;
        this.pagePar=10;
        this.pos=p;
    }
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
     * @param degAtt
     */
    public void setDegAtt(int degAtt) {
        this.degAtt = degAtt;
    }

    /**
     *
     * @return
     */
    public int getPageAtt() {
        return pageAtt;
    }

    /**
     *
     * @param pageAtt
     */
    public void setPageAtt(int pageAtt) {
        this.pageAtt = pageAtt;
    }

    /**
     *
     * @return
     */
    public int getPagePar() {
        return pagePar;
    }

    /**
     *
     * @param PagePar
     */
    public void setPagePar(int pagePar) {
        this.pagePar = pagePar;
    }

    public void setPtPar(int ptPar) {
        this.ptPar = ptPar;
    }

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
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     *
     * @return
     */
    public int getX() {
        return pos.getX();
    }

    /**
     *
     * @return
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
    public void loosePV(int degats){
        if (degats<0){
            System.out.println("Aucun dégât reçu");
        }
        else{
            this.setPtVie(this.getPtVie()-degats);
        }
    }
    
}
