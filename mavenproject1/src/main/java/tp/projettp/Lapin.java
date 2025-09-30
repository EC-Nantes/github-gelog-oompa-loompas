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

    /**
     *
     * @param nom nom de la créature
     * @param pointV points de vie de la créature
     * @param dAtt dist max attaque
     * @param ptPar point de parade d'attaque
     * @param degA force d'attaque
     * @param paAtt pourcentage attaque
     * @param paPar pourcentage parade
     * @param p position (Point 2D)
     */
    public Lapin(String nom, int pointV,int dAtt, int ptPar, int degA, int paAtt, int paPar, Point2D p){
        super(nom, pointV,dAtt, ptPar, degA, paAtt, paPar,p);
    }

    /**
     *
     * @param l lapin a copier
     */
    public Lapin(Lapin l) {
        super(l.getNom(),l.getPtVie(),l.getDistAttMax(),l.getDegAtt(),l.getPageAtt(),l.getPagePar(),l.getPtPar(),new Point2D(l.getPos()));
    }

    /**
     *
     */
    public Lapin() {
        super("Lapin mignon",20,1,0,10,1,2000,new Point2D());
    }
}
