/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

import java.util.Random;

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
    public Archer(String nom, int ptVie,int distAttMax,int degAtt,int pageAtt, int pagePar, int parade, Point2D pos, int nbFleches){
        super(nom,  ptVie, distAttMax, degAtt, pageAtt,  pagePar, parade,  pos);
        this.nbFleches=nbFleches;
    }
    public Archer(){
        super();
        nbFleches=15;
    }
    
    public Archer( Archer a){
        super(a.getNom(), a.getPtVie(),a.getDistAttMax(), a.getDegAtt(), a.getPtPar(),a.getPageAtt(), a.getPagePar(),a.getPos());
        this.nbFleches=a.getNbFleches();
    }
    public void combattre(Creature c){
        this.setNbFleches(this.nbFleches-1);
        if (this.getDistAttMax()<this.pos.distance(c.pos)){
            Random tirage=new Random();
            int Rand=tirage.nextInt(100)+1;
            if(Rand<=this.getPageAtt()){
                c.loosePV(this.getDegAtt()); 
            }
            else{
                System.out.println("Attaque Ratée");
            }
        }
    }
}
