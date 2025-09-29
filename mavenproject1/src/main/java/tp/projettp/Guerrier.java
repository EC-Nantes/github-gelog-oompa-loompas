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

    public Guerrier(String nom, int pV, int pPar, int dA, int paAtt, int paPar, Point2D p) {
        super(nom, pV, pPar, dA, paAtt, paPar, 1, p);
    }

    public Guerrier(Guerrier g) {
        super(g.getNom(),g.getPtVie(),g.getPagePar(),g.getDegAtt(),g.getPageAtt(),g.getPagePar(),g.getDistAttMax(), new Point2D(g.getPos()));
    }

    public Guerrier() {
        super("Guerrier aguerri",60,10,20,80,20,1,new Point2D());
    }
    public void combattre(Creature c){
        if (this.getDistAttMax()==1){
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