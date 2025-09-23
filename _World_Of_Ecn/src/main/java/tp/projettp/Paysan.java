/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

/**
 *
 * @author nathan
 */
public class Paysan extends Personnage {
    public Paysan(String nom, int ptVie, int degAtt,int ptPar,int pageAtt, int pagePar, int distAttMax, Point2D pos){
        super( nom,  ptVie,  ptPar, pageAtt,  pagePar,  distAttMax,  pos);
    }
    public Paysan(){
        super();
    }
    
    public Paysan( Paysan p){
        super(p.getNom(), p.getPtVie(), p.getPtPar(),p.getPageAtt(), p.getPagePar(), p.getDistAttMax(), p.getPos());
    }
}
