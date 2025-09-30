/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;
import java.util.Arrays;

/**
 *
 * @author nathan
 */
public class World {
    private int n;
    /**
     *
     */
    public Archer robin;

    /**
     *
     */
    public Paysan peon;

    /**
     *
     */
    public Lapin bugs;

    /**
     *
     */
    public Lapin bugs2;

    /**
     *
     */
    public Guerrier grosBill;

    /**
     *
     */
    public Loup wolfie;
    /**
     * 
     */
    public Archer guillaumeT;
    Creature[] vivant;
    
    
    /**
     *constructeur
     */
    public World(){
        n=7;
        Creature[] vivant = new Creature[n];
        this.robin= new Archer();
        this.peon= new Paysan();
        this.bugs=new Lapin();
        this.bugs2=new Lapin();
        this.grosBill=new Guerrier();
        this.wolfie=new Loup();
        this.guillaumeT=new Archer();
        vivant[0]=robin;
        vivant[1]=guillaumeT;
        vivant[2]=grosBill;
        vivant[3]=peon;
        vivant[4]=wolfie;
        vivant[5]=bugs;
        vivant[6]=bugs2;
    }
    
    /* on refera plus tard
    public boolean verifierCase(pos){
        return 
    }*/

    /**
     * Génère des entités à des emplacement aléatoires dans le monde
     */

    
    public void creerMondeAlea(){
        Point2D[] position= new Point2D[n];
        for (int i=0;i<n;i++){
            position[i]=new Point2D();
            position[i].randomPos();
            for (int j=0;j<i;j++){
                if (position[i]==position[j]){
                    position[i].randomPos();
                    j=-1;
                }
        }
            vivant[i].setPos(position[i]);
        }
    }

    /**
     *déplacement de chaque créature
     */
    public void TourDeJeu(){
        for (int i=0;i<n;i++){
            vivant[i].deplace();
        }
    }

    /**
     * affiche la position de toutes les créatures présentes
     */
    public void afficheWorld(){
        for (int i=0;i<n;i++){
            vivant[i].affiche();
        }
    }
}
