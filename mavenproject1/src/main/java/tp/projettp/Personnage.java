/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

/**
 *
 * @author nathan
 */
public class Personnage extends Creature{
    int distAttMax;
    int ptPar;
    
    /**
     *
     * @param nom nom perso
     * @param pV
     * @param dA
     * @param paAtt pourcentage d'attaque
     * @param paPar pourcentage de parade
     * @param pointPar point parade attaque
     * @param p
     */
    public Personnage(String nom,int pV, int distA, int degAtt,int paAtt,int paPar, int pointPar,Point2D p){
        super(nom,pV,distA, degAtt,paAtt,paPar,pointPar,p);
        this.ptPar=pointPar;
    }

    /**
     *
     * @param m
     */
    public Personnage(Personnage m){
        super(m.getNom(),m.getPtVie(), m.getDistAttMax(),m.getDegAtt(),m.getPageAtt(),m.getPagePar(),m.getPtPar(),new Point2D(m.getPos()));
        this.ptPar=m.getPtPar();
    }

    /**
     *
     */
    public Personnage(){
        super();
        distAttMax=2;
        ptPar=5;
    }
    
}
