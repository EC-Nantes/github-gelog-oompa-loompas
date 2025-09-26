/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

/**
 *
 * @author nathan
 */
public class Archer extends Personnage {

    public int getNbFleches() {
        return nbFleches;
    }

    public void setNbFleches(int nbFleches) {
        this.nbFleches = nbFleches;
    }
    private int nbFleches;
    public Archer(String nom, int ptVie, int degAtt,int ptPar,int pageAtt, int pagePar, int distAttMax, Point2D pos, int nbFleches){
        super( nom,  ptVie,  ptPar, pageAtt,  pagePar,  distAttMax,  pos);
        this.nbFleches=nbFleches;
    }
    public Archer(){
        super();
        nbFleches=100;
    }
    
    public Archer( Archer a){
        super(a.getNom(), a.getPtVie(), a.getPtPar(),a.getPageAtt(), a.getPagePar(), a.getDistAttMax(), new Point2D(a.getPos()));
        this.nbFleches=a.getNbFleches();
    }
    
}
