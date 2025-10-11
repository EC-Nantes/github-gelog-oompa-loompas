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
    private int pageAtt;
    private int degAtt;
    /**
     *
     * @param nom nom de la créature
     * @param pV
     * @param distA
     * @param dA
     * @param ptPar point de parade d'attaque
     * @param paAtt pourcentage attaque
     * @param paPar pourcentage parade
     * @param p position (Point 2D)
     */
    public Loup(String nom, int pV, int distA, int dA, int paAtt, int paPar, int ptPar, Point2D p) {
        super(nom, pV,distA, dA, paAtt, paPar, ptPar, p);
        this.nom=nom;
        this.ptVie=pV;
        this.pagePar=paPar;
        this.ptPar=ptPar;
        this.pos=p;
        
        this.pageAtt=paAtt;
        this.degAtt=dA;
    }

    /**
     * copie d'un loup
     * @param l loup à copier
     */
    public Loup(Loup l) {
        this.nom=l.getNom();
        this.ptVie=l.getPtVie();
        this.pagePar=l.getPagePar();
        this.ptPar=l.getPtPar();
        this.pos=new Point2D(l.getPos());
        
        this.pageAtt=l.getPageAtt();
        this.degAtt=l.getDegAtt();
    }

    /**
     * Loup à 50pV, 10 pt d'attaque, combat de mêlée
     */
    public Loup() {
        this.nom="Loup sauvage";
        this.ptVie=50;
        this.pagePar=10;
        this.ptPar=40;
        this.pos=new Point2D();
        
        this.pageAtt=90;
        this.degAtt=10;
    }

    public int getPageAtt() {
        return pageAtt;
    }

    public int getDegAtt() {
        return degAtt;
    }

    public void setPageAtt(int pageAtt) {
        this.pageAtt = pageAtt;
    }

    public void setDegAtt(int degAtt) {
        this.degAtt = degAtt;
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
