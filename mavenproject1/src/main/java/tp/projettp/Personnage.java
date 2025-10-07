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
     * création d'un personnage avec les attributs souhaités
     * @param nom nom perso
     * @param pV point de vie
     * @param dA distance d'Attaque
     * @param pointPar point parade attaque
     * @param degAtt force d'attaque
     * @param paAtt pourcentage d'attaque
     * @param paPar pourcentage de parade
     * @param p position du personnage (Point2D)
     */
    public Personnage(String nom,int pV, int dA, int degAtt,int paAtt,int paPar, int pointPar,Point2D p){
        super(nom,pV,dA,pointPar, degAtt,paAtt,paPar,p);
    }

    /**
     * copie un personnage
     * @param p personnage à copier
     */
    public Personnage(Personnage p){
        super(p.getNom(),p.getPtVie(), p.getDistAttMax(),p.getDegAtt(),p.getPageAtt(),p.getPagePar(),p.getPtPar(),p.getPos());
        this.ptPar=p.getPtPar();
    }

    /**
     * crée un personnage attaque à distance et peu de parade d'attaque
     */
    public Personnage(){
        super();
        distAttMax=2;
        ptPar=5;
    }
    
}
