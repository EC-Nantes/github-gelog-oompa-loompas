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
    public static LinkedList<ElementDeJeu> elements = new LinkedList();

    /**
     * taille y du monde
     */
    public static int hauteur;

    /**
     * taille x du monde
     */
    public static int longueur;
    

    /**
     *constructeur
     */
    public World(){ 
        hauteur=50;
        longueur=50;        
    
        for (int i =0; i<2;i++){
    elements.add(new Archer());
}
        for (int i =0; i<2;i++){
    elements.add(new Lapin());
}
        for (int i =0; i<2;i++){
    elements.add(new Loup());
}
        for (int i =0; i<2;i++){
    elements.add(new Paysan());
}
        for (int i =0; i<2;i++){
    elements.add(new Guerrier());
}
    }
    

    /**
     * Génère des entités à des emplacement aléatoires dans le monde
     */

    
    public void creerMondeAlea(){
        Point2D[] position= new Point2D[elements.size()];
        for (int i=0;i<elements.size();i++){
            position[i]=new Point2D();
            position[i].randomPos();
            for (int j=0;j<i;j++){
                if (position[i]==position[j]){
                    position[i].randomPos();
                    j=-1;
                }
        }
            elements.get(i).setPos(position[i]);
        }
    }

    /**
     *déplacement de chaque créature
     */
    public void TourDeJeu(){
        for (ElementDeJeu elem :elements){
            if (elem instanceof Creature creature){
            creature.deplacer();
        }
    }}

    /**
     * affiche la position de toutes les créatures présentes
     */
    public void afficheWorld(){
        for (ElementDeJeu crea : World.elements){
            if (crea instanceof Creature creature){
                creature.affiche();}
        }
    }
}
