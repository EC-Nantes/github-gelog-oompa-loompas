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

    public Lapin(String nom, int pV, int dA, int paAtt, int paPar, Point2D p) {
        super(nom, pV, dA, paAtt, paPar, p);
    }

    public Lapin(Lapin l) {
        super(l.getNom(),l.getPtVie(),l.getDegAtt(),l.getPagePar(),l.getPagePar(),new Point2D(l.getPos()));
    }

    public Lapin() {
        super("Lapin mignon",20,1,5,5,new Point2D());
    }
}
