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
    private int distAttMax;
    private int degAtt;
    private int nbFleches;
    private int pageAtt;

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

    /**
     *
     * @param nom nom du personnage
     * @param ptVie pV du personnage
     * @param degA Dégâts Max d'une attaque
     * @param pagePar Pourcentage d'attaques parées
     * @param parade Force de parade
     * @param pos position de l'archer (sous la forme Point2D)
     * @param dAttMax distance d'attaque de l'archer
     * @param paAtt pourcentage d'attaque réussies
     * @param nbFleches nombre de flèches de l'archer
     */
    public Archer(String nom, int ptVie, int pagePar, int parade, Point2D pos,int dAttMax,int degA,int paAtt, int nbFleches){
        this.nom=nom;
        this.ptVie=ptVie;
        this.pagePar=pagePar;
        this.ptPar=parade;
        this.pos=pos;
        
        this.nbFleches=nbFleches;
        this.distAttMax=dAttMax;
        this.pageAtt=paAtt;
        this.degAtt=degA;
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
        Archer(a.getNom(), a.getPtVie(), a.getPagePar(), a.getPtPar(),a.getPos(),a.getDistAttMax(), a.getDegAtt(),a.getPageAtt(),a.getNbFleches());
    }

    public int getDistAttMax() {
        return distAttMax;
    }

    public int getPageAtt() {
        return pageAtt;
    }

    public void setDistAttMax(int distAttMax) {
        this.distAttMax = distAttMax;
    }

    public void setPageAtt(int pageAtt) {
        this.pageAtt = pageAtt;
    }

    public int getDegAtt() {
        return degAtt;
    }

    public void setDegAtt(int degAtt) {
        this.degAtt = degAtt;
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
