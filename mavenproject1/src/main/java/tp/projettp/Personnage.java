/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

/**
 *
 * @author nathan
 */
public class Personnage extends Creature{
    int distAttMax;
    int ptPar;
    public Personnage(String nom,int pV,int pPar, int dA,int paAtt,int paPar,int dAtt, int pointPar,Point2D p){
        super(nom,pV,dA,paAtt,paPar,pointPar,p);
        this.distAttMax=dAtt;
        this.ptPar=pPar;
    }
    public Personnage(Personnage m){
        super(m.getNom(),m.getPtVie(),m.getDegAtt(),m.getPageAtt(),m.getPagePar(),m.getPtPar(),new Point2D(m.getPos()));
        this.distAttMax=m.getDistAttMax();
        this.ptPar=m.getPtPar();
    }
    public Personnage(){
        super();
        distAttMax=2;
        ptPar=5;
    }

    public int getDistAttMax() {
        return distAttMax;
    }

    public int getPtPar() {
        return ptPar;
    }

    public void setDistAttMax(int distAttMax) {
        this.distAttMax = distAttMax;
    }

    public void setPtPar(int ptPar) {
        this.ptPar = ptPar;
    }
    
}
