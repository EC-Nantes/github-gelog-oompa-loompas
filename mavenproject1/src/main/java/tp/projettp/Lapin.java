/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;


/**
 * monstre innoffensif ayant très peu de PV
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
    public Lapin(String nom, int pointV, int ptPar, int degA, int paAtt, int paPar, Point2D p){
        this.nom=nom;
        this.ptVie=pointV;
        this.pagePar=paPar;
        this.ptPar=ptPar;
        this.pos=p;
    }

    /**
     * copie d'un lapin
     * @param l lapin à copier
     */
    public Lapin(Lapin l) {
        this.nom=l.getNom();
        this.ptVie=l.getPtVie();
        this.pagePar=l.getPagePar();
        this.ptPar=l.getPtPar();
        this.pos=new Point2D(l.getPos());
    }

    /**
     * lapin de 20pV qui fait 0 dégâts
     */
    public Lapin() {
        this.nom="Lapin mignon esquivateur";
        this.ptVie=20;
        this.pagePar=85;
        this.ptPar=40;
        this.pos=new Point2D();
    }
}
