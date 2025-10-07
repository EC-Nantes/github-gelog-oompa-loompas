/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;
import java.util.LinkedList;

/**
 *
 * @author nathan
 */
public class World {
    /**
     * liste des créatures pouvant effectuer actions en jeu
     * 
     */
    public static LinkedList<Creature> creature = new LinkedList();
    public static int hauteur;
    public static int longueur;
    

    /**
     *constructeur
     */
    public World(){ 
        hauteur=50;
        longueur=50;        
    
        for (int i =0; i<2;i++){
    creature.add(new Archer());
}
        for (int i =0; i<2;i++){
    creature.add(new Lapin());
}
        for (int i =0; i<2;i++){
    creature.add(new Loup());
}
        for (int i =0; i<2;i++){
    creature.add(new Paysan());
}
        for (int i =0; i<2;i++){
    creature.add(new Guerrier());
}
    }
    

    /**
     * Génère des entités à des emplacement aléatoires dans le monde
     */

    
    public void creerMondeAlea(){
        Point2D[] position= new Point2D[creature.size()];
        for (int i=0;i<creature.size();i++){
            position[i]=new Point2D();
            position[i].randomPos();
            for (int j=0;j<i;j++){
                if (position[i]==position[j]){
                    position[i].randomPos();
                    j=-1;
                }
        }
            creature.get(i).setPos(position[i]);
        }
    }

    /**
     *déplacement de chaque créature
     */
    public void TourDeJeu(){
        for (int i=0;i<creature.size();i++){
            creature.get(i).deplace();
        }
    }

    /**
     * affiche la position de toutes les créatures présentes
     */
    public void afficheWorld(){
        for (Creature crea : this.creature){
            crea.affiche();
        }
    }
}
