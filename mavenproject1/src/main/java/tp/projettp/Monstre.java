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
    protected int ptVie;
    protected int degAtt;
    protected int pageAtt;
    protected int PagePar;
    protected Point2D pos;
    
    public Monstre(int pV,int dA,int paAtt,int paPar,Point2D p){
        this.ptVie=pV;
        this.degAtt=dA;
        this.pageAtt=paAtt;
        this.PagePar=paPar;
        this.pos=p;
    }
    public Monstre(Monstre m){
        this.ptVie=m.ptVie;
        this.degAtt=m.degAtt;
        this.pageAtt=m.pageAtt;
        this.PagePar=m.PagePar;
        this.pos=m.pos;
    }
    public Monstre(){
        Point2D p=new Point2D();
        this.ptVie=50;
        this.degAtt=50;
        this.pageAtt=50;
        this.PagePar=10;
        this.pos=p;
    }
    public int getPtVie(){
        return this.ptVie;
    }
    public void setPtVie(int pv){
        this.ptVie=pv;
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
        return PagePar;
    }

    public void setPagePar(int PagePar) {
        this.PagePar = PagePar;
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
        System.out.println("position du monstre :"+this.pos.getX()+","+this.pos.getX());
    }
}
