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
    public Personnage(int pV,int dA,int paAtt,int paPar,Point2D p){
        super(pV,dA,paAtt,paPar,p);
    }
    public Personnage(Personnage m){
        super(m.getPtVie(),m.getDegAtt(),m.getPageAtt(),m.getPagePar(),new Point2D(m.getPos()));
    }
}
