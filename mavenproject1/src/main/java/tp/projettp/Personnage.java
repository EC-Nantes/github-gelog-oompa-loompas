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

    /**
     *
     * @return
     */
    public int getPtVie() {
        return ptVie;
    }

    /**
     *
     * @param ptVie
     */
    public void setPtVie(int ptVie) {
        this.ptVie = ptVie;
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
     * @param ptPar
     */
    public void setPtPar(int ptPar) {
        this.ptPar = ptPar;
    }

    /**
     *
     * @return
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
     * @param pagePar
     */
    public void setPagePar(int pagePar) {
        this.pagePar = pagePar;
    }

    /**
     *
     * @return distance d'attaque maximale
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

    /**
     *
     * @return
     */
    public Point2D getPos() {
        return pos;
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
     * @param pos
     */
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
    
    /**
     *
     * @param nom
     * @param ptVie= point de vie du personnage
     * @param ptPar
     * @param pageAtt
     * @param pagePar
     * @param distAttMax
     * @param pos= position (x,y) sous la forme d'un objet de la classe Point2D
     */
    public Personnage(String nom, int ptVie, int ptPar,int pageAtt, int pagePar, int distAttMax, Point2D pos){
        this.nom=nom;
        this.ptVie=ptVie;
        this.ptPar=ptPar;
        this.pageAtt=pageAtt;
        this.pagePar=pagePar;
        this.distAttMax=distAttMax;
        this.pos=pos;
    }
    
    /**
     *
     * @param perso
     */
    public Personnage(Personnage perso){
        this.nom=perso.nom;
        this.ptVie=perso.ptVie;
        this.ptPar=perso.ptPar;
        this.pageAtt=perso.pageAtt;
        this.pagePar=perso.pagePar;
        this.distAttMax=perso.distAttMax;
        this.pos=new Point2D(perso.pos);
    }

    /**
     *
     */
    public Personnage(){
        this.nom="Lui";
        this.ptVie=1;
        this.ptPar=1;
        this.pageAtt=1;
        this.pagePar=1;
        this.distAttMax=1;
        this.pos=null;}
    
    /**
     *
     * @return renvoie le nom du personnage
     */
    public String getNom(){
        if (this!=null){
        return this.nom;}
        else{return "NULL";}
    }
    
    /**
     *
     * @param n nouveau nom du personnage
     * @return Renvoie si le nom a bien été modifié ou non
     */
    public boolean setNom(String n){
        if (this!=null){
        this.nom = n;
        return true;}
        else{return false;}
    }
    
    /**
     *déplacement aléatoire sur une case adjacente (en incluant les diagonales)
     */
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
    
    /**
     *affichage de la position du personnage
     */
    public void affiche(){
        System.out.println(this.getNom()+"a pour coordonnees ["+this.getX()+";"+this.getY()+"]");
    }
    
}
