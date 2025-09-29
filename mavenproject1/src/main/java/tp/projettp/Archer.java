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
    public Archer(String nom, int ptVie, int degAtt,int ptPar,int pageAtt, int pagePar, int distAttMax, Point2D pos, int nbFleches){
        super(nom,  ptVie,  degAtt, ptPar, pageAtt,  pagePar,  distAttMax,  pos);
        this.nbFleches=nbFleches;
    }
    public Archer(){
        super();
        nbFleches=15;
    }
    
    public Archer( Archer a){
        super(a.getNom(), a.getPtVie(), a.getDegAtt(), a.getPtPar(),a.getPageAtt(), a.getPagePar(), a.getDistAttMax(), new Point2D(a.getPos()));
        this.nbFleches=a.getNbFleches();
    }
    public void combattre(Creature c){
        if (this.getDistAttMax()==1){
            Random tirage=new Random();
            int Rand=tirage.nextInt(100)+1;
            if(Rand<=this.getPageAtt()){
                int Rand2=tirage.nextInt(100)+1;
                if(Rand2>c.getPagePar()){
                    c.loosePV(this.getDegAtt());
                }
                else{
                    c.loosePV(this.getDegAtt()-c.getPtPar());
                }
                
            }
            else{
                System.out.println("Attaque Ratée");
            }
        }
        else if (this.getDistAttMax()==1){//A faire
            Random tirage=new Random();
            int Rand=tirage.nextInt(100)+1;
            if(Rand<=this.getPageAtt()){
                int Rand2=tirage.nextInt(100)+1;
                if(Rand2>c.getPagePar()){
                    c.loosePV(this.getDegAtt());
                }
                else{
                    c.loosePV(this.getDegAtt()-c.getPtPar());
                }
                
            }
            else{
                System.out.println("Attaque Ratée");
            }
        }
    }
}
