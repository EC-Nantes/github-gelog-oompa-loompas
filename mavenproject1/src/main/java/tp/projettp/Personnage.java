/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;
import java.util.Random;

/**
 *
 * @author nathan
 */
public class Personnage {
    private String nom;

    public int getPtVie() {
        return ptVie;
    }

    public void setPtVie(int ptVie) {
        this.ptVie = ptVie;
    }

    public int getPtPar() {
        return ptPar;
    }

    public void setPtPar(int ptPar) {
        this.ptPar = ptPar;
    }

    public int getDegAtt() {
        return degAtt;
    }

    public void setDegAtt(int degAtt) {
        this.degAtt = degAtt;
    }

    public int getPageAtt() {
        return pageAtt;
    }

    public void setPageAtt(int pageAtt) {
        this.pageAtt = pageAtt;
    }

    public int getPagePar() {
        return pagePar;
    }

    public void setPagePar(int pagePar) {
        this.pagePar = pagePar;
    }

    public int getDistAttMax() {
        return distAttMax;
    }

    public void setDistAttMax(int distAttMax) {
        this.distAttMax = distAttMax;
    }

    public Point2D getPos() {
        return pos;
    }
    
    public int getX() {
        return pos.getX();
    }
    public int getY() {
        return pos.getY();
    }

    public void setPos(Point2D pos) {
        this.pos = pos;
    }
    private int ptVie;
    private int ptPar;
    private int degAtt;
    private int pageAtt;
    private int pagePar;
    private int distAttMax;
    private Point2D pos;
    
    public Personnage(String nom, int ptVie, int ptPar,int pageAtt, int pagePar, int distAttMax, Point2D pos){
        this.nom=nom;
        this.ptVie=ptVie;
        this.ptPar=ptPar;
        this.pageAtt=pageAtt;
        this.pagePar=pagePar;
        this.distAttMax=distAttMax;
        this.pos=pos;
    }
    
    public Personnage(Personnage perso){
        this.nom=perso.nom;
        this.ptVie=perso.ptVie;
        this.ptPar=perso.ptPar;
        this.pageAtt=perso.pageAtt;
        this.pagePar=perso.pagePar;
        this.distAttMax=perso.distAttMax;
        this.pos=new Point2D(perso.pos);
    }
    public Personnage(){
        this.nom="Lui";
        this.ptVie=1;
        this.ptPar=1;
        this.pageAtt=1;
        this.pagePar=1;
        this.distAttMax=1;
        this.pos=null;}
    
    public String getNom(){
        if (this!=null){
        return this.nom;}
        else{return "NULL";}
    }
    
    public boolean setNom(String n){
        if (this!=null){
        this.nom = n;
        return true;}
        else{return false;}
    }
    
    public void deplace(){
        Random alea= new Random();
        int randomx=0;
        int randomy=0;
        while(randomx==0&&randomy==0){
            randomx=alea.nextInt(2);
            randomy=alea.nextInt(2);
        }
        this.pos.setPosition(this.pos.getX()+randomx,this.pos.getY()+randomy);
    }
    
    public void affiche(){
        System.out.println("["+this.getX()+";"+this.getY()+"]");
    }
    
}
