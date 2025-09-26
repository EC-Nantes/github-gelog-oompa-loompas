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
    public Personnage(string nom,int pV,int pPar, int dA,int paAtt,int paPar,int dAtt, Point2D p){
        super(pV,dA,paAtt,paPar,p);
        this.distAttMax=dAtt;
        this.ptPar=pPar;
    }
    public Personnage(Personnage m){
        super(m.getPtVie(),m.getDegAtt(),m.getPageAtt(),m.getPagePar(),new Point2D(m.getPos()));
    }
}
