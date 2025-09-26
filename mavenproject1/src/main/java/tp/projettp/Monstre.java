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
public class Monstre extends Creature{

    /**
     *
     * @param pV nombre de points de vie
     * @param dA dégâts d'attaque du monstre
     * @param paAtt
     * @param paPar
     * @param p position (x,y) initiale du monstre (classe Point2D)
     */

    public Monstre(int pV,int dA,int paAtt,int paPar,Point2D p){
        super(pV,dA,paAtt,paPar,p);
    }
    public Monstre(Monstre m){
        super(m.getPtVie(),m.getDegAtt(),m.getPageAtt(),m.getPagePar(),new Point2D(m.getPos()));
    }
    public Monstre(){
        super();
    }
    /**
     *
     * @param m monstre que l'on souhaite copier
     */

    
    
     
    /**
     *par défaut, 50pV, degAtt=50, pageAtt=50,PagePar=10 et la position est (0,0)
     */

    

    /**
     *
     * @return point de vie du monstre
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
        return PagePar;
    }

    /**
     *
     * @param PagePar
     */
    public void setPagePar(int PagePar) {
        this.PagePar = PagePar;
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
        System.out.println("position du monstre : ["+this.pos.getX()+","+this.pos.getY()+"]");
    }
}
