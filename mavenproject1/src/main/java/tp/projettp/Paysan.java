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

    public Paysan(String nom, int pV, int pPar, int degA, int paAtt, int paPar, int dAtt, Point2D p) {
        super(nom, pV, pPar, degA, paAtt, paPar, dAtt, p);
    }

    public Paysan(Personnage p) {
        super(p.getNom(),p.getPtVie(),p.getPagePar(),p.getDegAtt(),p.getPageAtt(),p.getPagePar(),p.getDistAttMax(), new Point2D(p.getPos()));
    }

    public Paysan() {
    }
    
}
