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

    /**
     *
     * @return nombre de flèches restantes dans l'inventaire
     */
    public int getNbFleches() {
        return nbFleches;
    }

    /**
     *
     * @param nbFleches nouveau nombre de flèches restantes
     */
    public void setNbFleches(int nbFleches) {
        this.nbFleches = nbFleches;
    }
    private int nbFleches;

    /**
     *
     * @param nom nom du personnage
     * @param ptVie pV du personnage
     * @param distAttMax distance d'attaque de l'archer
     * @param degAtt Dégâts Max d'une attaque
     * @param pageAtt Pourcentage d'attaques réussies
     * @param pagePar Pourcentage d'attaques parées
     * @param parade Force de parade
     * @param pos position de l'archer (sous la forme Point2D)
     * @param nbFleches nombre de flèches de l'archer
     */
    public Archer(String nom, int ptVie,int distAttMax,int degAtt,int pageAtt, int pagePar, int parade, Point2D pos, int nbFleches){
        super(nom,  ptVie, distAttMax, degAtt, pageAtt,  pagePar, parade,  pos);
        this.nbFleches=nbFleches;
    }

    /**
     *crée un archer basique avec 15 flèches
     */
    public Archer(){
        super();
        nbFleches=15;
    }
    
    /**
     *
     * @param  a archer à copier
     */
    public Archer( Archer a){
        super(a.getNom(), a.getPtVie(),a.getDistAttMax(), a.getDegAtt(), a.getPtPar(),a.getPageAtt(), a.getPagePar(),a.getPos());
        this.nbFleches=a.getNbFleches();
    }

    /**
     *
     * @param c créature attaquée par l'archer
     */
    public void combattre(Creature c){
        this.setNbFleches(this.nbFleches-1);
        if (this.getDistAttMax()<this.pos.distance(c.pos)){
            Random tirage=new Random();
            int Rand=tirage.nextInt(100)+1;
            if(Rand<=this.getPageAtt()){
                int degats=this.getDegAtt();
                c.loosePV(degats);
                System.out.println("Dégâts infligés : "+degats);
            }
            else{
                System.out.println("Attaque Ratée");
            }
        }
        else{
            System.out.println("Attaque hors de portée");
        }
    }
}
