/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author julda
 */
public class Guerrier extends Personnage implements Combattant, Jouable{

    /**
     *
     * @param nom nom de la créature
     * @param pV points de vie de la créature
     * @param parade point de parade d'attaque
     * @param paAtt pourcentage attaque
     * @param paPar pourcentage parade
     * @param p position (Point 2D)
     * @param degAtt dégâts d'attaque
     */
    public Guerrier(String nom, int pV, int parade, int paAtt, int paPar, Point2D p, int degAtt) {
        this.nom=nom;
        this.ptVie=pV;
        this.ptPar=parade;
        this.pageAtt=paAtt;
        this.pagePar=paPar;
        this.pos=p;
        this.degAtt=degAtt;
        this.distAMax=1;
        this.pvMax=ptVie;
    }
    
    @Override
    public void setDistAMax(int dA){//redéfinition pour ne pas pouvoir la modifier
        this.distAMax=1;
    }
    /**
     * création d'une copie guerrier à partir d'un autre guerrier
     * @param g copie guerrier
     */
    public Guerrier(Guerrier g) {
        this.nom=g.getNom();
        this.ptVie=g.getPtVie();
        this.pagePar=g.getPagePar();
        this.ptPar=g.getPtPar();
        this.pos=g.getPos();
        this.distAMax=1;
        this.degAtt=g.getDegAtt();
        this.pageAtt=g.getPageAtt();
        this.pvMax=ptVie;
    }

    /**
     *création d'un guerrier 60pV, combat de mêlée
     */
    public Guerrier() {
        Random tirage=new Random();
        int rand;
        this.setNom("Guerrier aguerri");
        this.ptVie=60;
        rand=tirage.nextInt(5)+1;
        this.pagePar=10+rand;
        rand=tirage.nextInt(5)+1;
        this.ptPar=40+rand;
        rand=tirage.nextInt(5)+1;
        this.pos=new Point2D();
        this.distAMax=1;
        this.pageAtt=80+rand;
        rand=tirage.nextInt(3);
        this.degAtt=15+rand;
        this.pvMax=ptVie;
    }
    /**
     *
     * @param c combat au corps à corps d'un guerrier
     */
    @Override
    public void combattre(Creature c){
        System.out.println("Attaque de "+this.getNom()+" sur "+c.getNom());
        if (this.getPos().distance(c.getPos())<=1){
            Random tirage=new Random();
            int Rand=tirage.nextInt(100)+1;
            if(Rand<=this.getPageAtt()){
                int Rand2=tirage.nextInt(100)+1;
                int degats=this.getDegAtt();
                if(Rand2<=c.getPagePar()){
                    degats=this.getDegAtt()-c.getPtPar();
                    System.out.println("Attaque parée");
                }
                degats=Math.max(degats, 0);
                c.loosePV(degats);
                System.out.println("Degats infliges : "+degats+"\nIl reste "+c.getPtVie()+"pv a "+c.getNom());
                
            }
            else{
                System.out.println("Attaque Ratée");
            }
        }
        else{
            System.out.println("Attaque hors de portée");
        }
    }
    public void combattre(Creature c,ArrayList<Objet> inventaire){
        System.out.println("Attaque de "+this.getNom()+" sur "+c.getNom());
        if (this.getPos().distance(c.getPos())<=1){
            int degatsupp=0;
            int indice=-1;
            for(int i=0;i<inventaire.size();i++) {
                if(inventaire.get(i) instanceof Epee e){
                    if(e.getDegat()>degatsupp){
                        degatsupp=e.getDegat();
                        indice=i;
                    }
                }
            }
            if (indice>-1){
                System.out.println("Utilisation de "+inventaire.get(indice).getNom());
                if (inventaire.get(indice) instanceof Epee e && !(e.utilisation())){
                    inventaire.remove(e);
                    System.out.println("Epee trop usée, elle n'est plus dans votre inventaire");
                }
            }
            Random tirage=new Random();
            int Rand=tirage.nextInt(100)+1;
            if(Rand<=this.getPageAtt()){
                int Rand2=tirage.nextInt(100)+1;
                int degats=this.getDegAtt()+degatsupp;
                if(Rand2<=c.getPagePar()){
                    degats=degats-c.getPtPar();
                    System.out.println("Attaque parée");
                }
                degats=Math.max(degats, 0);
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