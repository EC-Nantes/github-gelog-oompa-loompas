/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;


/**
 *
 * @author julda
 */
public class Lapin extends Monstre {
    Lapin(int pV,int dA,int paAtt,int paPar,Point2D p){
        super(pV,dA,paAtt,paPar,p);
    }
    Lapin(Lapin l){
        super(l.getPtVie(),l.getDegAtt(),l.getPageAtt(),l.getPagePar(),new Point2D(l.getPos()));
    }
    Lapin(){
        super(10,10,5,5,new Point2D());
    }
}
