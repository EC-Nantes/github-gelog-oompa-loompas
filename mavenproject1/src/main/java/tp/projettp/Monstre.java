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
public class Monstre {

    /**
     *
     */
    protected int ptVie;

    /**
     *
     */
    protected int degAtt;

    /**
     *
     */
    protected int pageAtt;

    /**
     *
     */
    protected int PagePar;

    /**
     *
     */
    protected Point2D pos;
    
    /*@param  nombre de point de vie, points d'attaque, pageAtt, page Par, position sous la forme d'un Point2D du monstre que l'on souhaite créer x*/

    /**
     *
     * @param pV nombre de points de vie
     * @param dA dégâts d'attaque du monstre
     * @param paAtt
     * @param paPar
     * @param p position (x,y) initiale du monstre (classe Point2D)
     */

    public Monstre(int pV,int dA,int paAtt,int paPar,Point2D p){
        this.ptVie=pV;
        this.degAtt=dA;
        this.pageAtt=paAtt;
        this.PagePar=paPar;
        this.pos=p;
    }
    
    /**
     *
     * @param m monstre que l'on souhaite copier
     */

    public Monstre(Monstre m){
        this.ptVie=m.ptVie;
        this.degAtt=m.degAtt;
        this.pageAtt=m.pageAtt;
        this.PagePar=m.PagePar;
        this.pos=m.pos;
    }
     
    /**
     *par défaut, 50pV, degAtt=50, pageAtt=50,PagePar=10 et la position est (0,0)
     */

    public Monstre(){
        Point2D p=new Point2D();
        this.ptVie=50;
        this.degAtt=50;
        this.pageAtt=50;
        this.PagePar=10;
        this.pos=p;
    }

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
