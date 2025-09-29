/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

/**
 *
 * @author julda
 */
public class Guerrier extends Personnage{

    public Guerrier(String nom, int pV, int pPar, int dA, int paAtt, int paPar, int dAtt, Point2D p) {
        super(nom, pV, pPar, dA, paAtt, paPar, dAtt, p);
    }

    public Guerrier(Guerrier g) {
        super(g.getNom(),g.getPtVie(),g.getPagePar(),g.getDegAtt(),g.getPageAtt(),g.getPagePar(),g.getDistAttMax(), new Point2D(g.getPos()));
    }

    public Guerrier() {
        super();
    }
    public void combattre(Creature c){
        c.loosePV(this.getDegAtt());
    }
}
