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
     * @param pPar point parade attaque
     * @param paPar pourcentage de parade
     * @param p position du personnage (Point2D)
     */
    public Paysan(String nom, int pV, int pPar,int paPar,Point2D p){
        super.ptVie=pV;
        super.degAtt=0;
        super.pageAtt=0;
        super.pagePar=paPar;
        super.pos=p;
        super.ptPar=pPar;       
        super.distAMax=0;
    }

    /**
     *
     * @param p
     */
    public Paysan(Personnage p) {
        super.nom=p.getNom();
        super.ptVie=p.getPtVie();
        super.degAtt=0;
        super.pageAtt=0;
        super.pagePar=p.getPagePar();
        super.pos=new Point2D(p.getPos());
        super.ptPar=p.getPagePar();       
        super.distAMax=0;
    }

    /**
     * crée un paysan basique
     */
    public Paysan() {
        super();
    }
    
}
