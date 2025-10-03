/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

import java.util.Random;

/**
 * Monstre offensif mêlée faisant des dégâts considérables mais avec un nombre limité de PV
 * @author julda
 */
public class Loup extends Monstre{

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
    public Loup(String nom, int pV, int distA, int dA, int paAtt, int paPar, int ptPar, Point2D p) {
        super(nom, pV,distA, dA, paAtt, paPar, ptPar, p);
    }

    /**
     * copie d'un loup
     * @param l loup à copier
     */
    public Loup(Loup l) {
        super(l.getNom(),l.getPtVie(),l.getDistAttMax(),l.getDegAtt(),l.getPageAtt(),l.getPagePar(),l.getPtPar(),new Point2D(l.getPos()));
    }

    /**
     * Loup à 50pV, 18 pt d'attaque, combat de mêlée
     */
    public Loup() {
        super("Loup terrifiant",50,1,18,20,25,10,new Point2D());
    }

    /**
     * Attaque d'une autre créature en ayant la possibilité de lui infliger des dégâts
     * @param c créature attaqué par un combat au corps à corps du loup
     */
    public void combattre(Creature c){
        if (this.pos.distance(c.pos)==1){
            Random tirage=new Random();
            int Rand=tirage.nextInt(100)+1;
            if(Rand<=this.getPageAtt()){
                int Rand2=tirage.nextInt(100)+1;
                int degats=this.getDegAtt();
                if(Rand2>c.getPagePar()){
                    c.loosePV(degats);
                }
                else{
                    degats=this.getDegAtt()-c.getPtPar();
                    c.loosePV(degats);
                }
                
            }
            else{
                System.out.println("Attaque Ratée");
            }
        }
    }   
}
