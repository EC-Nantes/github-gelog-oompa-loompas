/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;
import java.util.Random;
/**
 *
 * @author julda
 */
public class Guerrier extends Personnage{

    /**
     *
     * @param nom nom de la créature
     * @param pV points de vie de la créature
     * @param parade point de parade d'attaque
     * @param paAtt pourcentage attaque
     * @param paPar pourcentage parade
     * @param p position (Point 2D)
     */
    public Guerrier(String nom, int pV, int parade, int paAtt, int paPar, Point2D p, int degAtt) {
        this.nom=nom;
        this.ptVie=pV;
        this.ptPar=parade;
        this.pageAtt=paAtt;
        this.pagePar=paPar;
        this.pos=p;
        this.degAtt=degAtt;
    }

    /**
     *
     * @param g copie guerrier
     */
    public Guerrier(Guerrier g) {
        this.nom=g.getNom();
        this.ptVie=g.getPtVie();
        this.pagePar=g.getPagePar();
        this.ptPar=g.getPtPar();
        this.pos=g.getPos();
        this.distAMax=g.getDistAMax();
        this.degAtt=g.getDegAtt();
        this.pageAtt=g.getPageAtt();
    }

    /**
     *création d'un guerrier 60pV, combat de mêlée
     */
    public Guerrier() {
        this.nom="Guerrier aguerri";
        this.ptVie=12;
        this.pagePar=10;
        this.ptPar=40;
        this.pos=new Point2D();
        
        this.pageAtt=80;
        this.degAtt=20;
    }
    /**
     *
     * @param c combat au corps à corps d'un guerrier
     */
    public void combattre(Creature c){
        if (this.getDistAMax()==1){
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