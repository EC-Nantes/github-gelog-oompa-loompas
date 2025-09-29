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
public class Loup extends Monstre{

    public Loup(String nom, int pV, int dA, int paAtt, int paPar, Point2D p) {
        super(nom, pV, dA, paAtt, paPar, p);
    }

    public Loup(Loup l) {
        super(l.getNom(),l.getPtVie(),l.getDegAtt(),l.getPagePar(),l.getPagePar(),new Point2D(l.getPos()));
    }
    public Loup() {
        super("Loup terrifiant",55,12,20,25,new Point2D());
    }

    public void combattre(Creature c){
        if (this.pos.distance(c.pos)==1){
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
