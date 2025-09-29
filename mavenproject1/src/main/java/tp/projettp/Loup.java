/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

/**
 *
 * @author julda
 */
public class Loup extends Monstre{

    public Loup(String nom, int pV, int dA, int paAtt, int paPar, Point2D p) {
        super(nom, pV, dA, paAtt, paPar, p);
    }

    public Loup(Loup l) {
        super(l.getNom(),l.getPtVie(),l.getDegAtt(),l.getPagePar(),l.getPagePar(),new Point2D(l.getPos()));
    }
    public Loup() {
        super("Loup terrifiant",55,12,20,25,new Point2D());
    }
    
    
}
