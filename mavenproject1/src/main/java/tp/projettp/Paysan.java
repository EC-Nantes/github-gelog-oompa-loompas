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

    /**
     *
     * @param nom nom perso
     * @param pV point de vie
     * @param degA distance d'Attaque
     * @param pPar point parade attaque
     * @param paAtt pourcentage d'attaque
     * @param paPar pourcentage de parade
     * @param dAtt distance d'attaque du paysan
     * @param p position du personnage (Point2D)
     */
    public Paysan(String nom, int pV, int pPar, int degA, int paAtt, int paPar, int dAtt, Point2D p) {
        super(nom, pV, degA,pPar, paAtt, paPar, dAtt, p);
    }

    /**
     *
     * @param p
     */
    public Paysan(Personnage p) {
        super(p.getNom(),p.getPtVie(),p.getPagePar(),p.getDegAtt(),p.getPageAtt(),p.getPagePar(),p.getDistAttMax(), new Point2D(p.getPos()));
    }

    /**
     * crée un paysan basique
     */
    public Paysan() {
        super();
    }
    
}
