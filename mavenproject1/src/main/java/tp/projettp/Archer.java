/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author nathan
 */
public class Archer extends Personnage implements Combattant, Jouable{
    private int distAttMax;
    private int nbFleches;

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
    public Archer(String nom, int ptVie, int pagePar, int parade, Point2D pos,int degA,int paAtt,int dAttMax, int nbFleches){
        this.nom=nom;
        this.ptVie=ptVie;
        this.pagePar=pagePar;
        this.ptPar=parade;
        this.pos=pos;
        
        this.nbFleches=nbFleches;
        this.distAttMax=dAttMax;
        this.pageAtt=paAtt;
        this.degAtt=degA;
        this.pvMax=ptVie;
    }

    /**
     *crée un archer basique avec 15 flèches
     */
    public Archer(){
        Random tirage=new Random();
        int rand;
        this.nom="Archer basique";
        this.ptVie=30;
        rand=tirage.nextInt(5)+1;
        this.pagePar=10+rand;
        rand=tirage.nextInt(5)+1;
        this.ptPar=10+rand;
        this.pos=new Point2D();
        
        this.distAttMax=3;
        rand=tirage.nextInt(5)+1;
        this.pageAtt=80+rand;
        rand=tirage.nextInt(3);
        this.degAtt=8+rand;
        rand=tirage.nextInt(10)+1;
        nbFleches=15+rand;
        this.pvMax=ptVie;
    }
    
    /**
     *
     * @param  a archer à copier
     */
    public Archer( Archer a){
        this.nom=a.getNom();
        this.ptVie=a.getPtVie();
        this.pagePar=a.getPagePar();
        this.ptPar=a.getPtPar();
        this.pos=a.getPos();
        this.distAttMax=a.getDistAttMax();
        this.degAtt=a.getDegAtt();
        this.pageAtt=a.getPageAtt();
        this.nbFleches=a.getNbFleches();
        this.pvMax=ptVie;
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
    
    /**
     *
     * @param c créature attaquée par l'archer
     */
    @Override
    public void combattre(Creature c){
        System.out.println("Attaque de "+this.getNom()+" sur "+c.getNom());
        if ((this.getDistAttMax()>=this.pos.distance(c.pos)) && (this.nbFleches > 0)){
            this.setNbFleches(this.nbFleches-1);
            Random tirage=new Random();
            int Rand=tirage.nextInt(100)+1;
            if(Rand<=this.getPageAtt()){
                int Rand2=tirage.nextInt(100)+1;
                int degats=this.getDegAtt();
                if(Rand2<=c.getPagePar()){
                    degats=degats-c.getPtPar();
                    System.out.println("Attaque paree");
                }
                c.loosePV(degats);
                System.out.println("Degats infliges : "+degats+"\nIl reste "+c.getPtVie()+"pv a "+c.getNom());
            }
            else{
                System.out.println("Attaque Ratee");
            }
        }
        else{
            System.out.println("Attaque hors de portee");
        }
    }

    /**
     *
     * @param c
     * @param inventaire
     */
    public void combattre(Creature c,ArrayList<Objet> inventaire){
        System.out.println("Attaque de "+this.getNom()+" sur "+c.getNom());
        if (this.getDistAttMax()>=this.pos.distance(c.pos)){
            this.setNbFleches(this.nbFleches-1);
            Random tirage=new Random();
            int Rand=tirage.nextInt(100)+1;
            if(Rand<=this.getPageAtt()){
                int Rand2=tirage.nextInt(100)+1;
                int degats=this.getDegAtt();
                if(Rand2<=c.getPagePar()){
                    degats=degats-c.getPtPar();
                    System.out.println("Attaque paree");
                }
                degats=Math.max(degats, 0);
                c.loosePV(degats);
                System.out.println("Degats infliges : "+degats+"\nIl reste "+c.getPtVie()+"pv a "+c.getNom());
            }
            else{
                System.out.println("Attaque Ratee");
            }
        }
        else{
            System.out.println("Attaque hors de portee");
        }
    }
}
