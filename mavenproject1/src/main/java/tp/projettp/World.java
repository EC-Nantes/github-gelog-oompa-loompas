/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;
import java.util.LinkedList;
import java.util.List;

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
    
        for (int i =0; i<50;i++){
            elements.add(new Archer());
        }
        for (int i =0; i<40;i++){
            elements.add(new Lapin());
        }
        for (int i =0; i<10;i++){
            elements.add(new Loup());
        }
        for (int i =0; i<20;i++){
            elements.add(new Paysan());
        }
        for (int i =0; i<100;i++){
            elements.add(new Guerrier());
        }
        elements.add(new NuageToxique());
        elements.add(new Epee("épée en argent",20,3));
        elements.add(new Epee("épée en argent",20,3));
        elements.add(new Epee("Epee anti-titan",2000,1));
        elements.add(new Epee("épée en bois",2,2));
        elements.add(new Epee("épée en bois",2,2));
        elements.add(new Epee("épée en bois",2,2));
        elements.add(new Epee("épée en bois",2,2));
        elements.add(new Epee("épée en bois",2,2));
        elements.add(new Epee("Epee en diamant",25,10));
        elements.add(new PotionSoin(10));
        elements.add(new PotionSoin(2000));
        elements.add(new PotionSoin(50));
        elements.add(new PotionSoin(50));
        elements.add(new PotionSoin(10));
        elements.add(new PotionSoin(10));
        elements.add(new PotionSoin(10));
        elements.add(new PotionSoin(10));
        elements.add(new PotionSoin(10));
        elements.add(new PotionSoin(10));
        elements.add(new PotionSoin(10));
        elements.add(new PotionSoin(10));
        elements.add(new PotionSoin(10));
        elements.add(new PotionSoin(10));
        elements.add(new PotionSoin(10));
        elements.add(new PotionSoin(10));
        elements.add(new PotionSoin(10));
        elements.add(new PotionSoin(10));
        elements.add(new PotionSoin(10));
        elements.add(new PotionSoin(1));
        for(int i=0;i<150;i++){
            elements.add(new Nourriture("Poison",6,2200,false));
        }
    }
    /**
     * 
     * 
     * @param longueur
     * @param hauteur
     * @param liste // liste de liste qui contiennent chacunes la classe et les attibuts de la classe de chaque entité du monde
     */
    
    public World(int longueur, int hauteur, List liste){ 
        World.hauteur=hauteur;
        World.longueur=longueur;
        // il faut finir de creer les entités avec la liste 
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
     * @param j Joueur du monde dans lequel il évolue
     */
    public void TourDeJeu(Joueur j){
        LinkedList<ElementDeJeu> utilise= new LinkedList();
        for (ElementDeJeu elem :elements){
            System.out.println(" ");
            elem.affiche();
            if (elem instanceof Creature creature && elem instanceof Combattant attakant){
                if (j.getPerso().getPos().distance(creature.getPos())<=creature.getDistAMax()){
                    attakant.combattre(j.getPerso());
                }
                else{
                    Creature attakade=creature.creatureProche();
                    if(creature.getPos().distance(attakade.getPos())<=creature.getDistAMax()){
                        attakant.combattre(attakade);
                    }
                    else{
                        creature.deplacer();
                        System.out.println(creature.getNom()+" se deplace, et est desormais :");
                        elem.affiche();
                        for (ElementDeJeu elem2 :elements){
                            if(elem2 instanceof Nourriture denree){
                                if (denree.getPos().equals(creature.getPos()) && denree.isCreaturisable()){
                                    denree.utilisation(creature);
                                    utilise.add(denree);
                                    break;
                                }
                            }
                        }
                    } 
                }
            }
            else{
                if(elem instanceof Deplacable deplac){
                    deplac.deplacer();
                    System.out.println(elem.getNom()+" se deplace, et est desormais :");
                    elem.affiche();
                    if(elem instanceof Creature c){
                        for (ElementDeJeu elem2 :elements){
                            if(elem2 instanceof Nourriture denree){
                                if (denree.getPos().equals(c.getPos()) && denree.isCreaturisable()){
                                    denree.utilisation(c);
                                    elements.remove(elem2);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (elem instanceof NuageToxique nuage){
                if(j.getPerso().getPos().distance(nuage.getPos())==0){
                    nuage.combattre(j.getPerso());
                    System.out.println("Attaque de "+nuage.getNom()+" sur "+j.getPerso().getNom()+" avec "+nuage.degats+" de dégâts");
                }
            }
        }
    for 
    }

    /**
     * affiche la position de toutes les créatures présentes
     */
    public void afficheWorld(){
        for (ElementDeJeu crea : World.elements){
            crea.affiche();
        }
    }
    public void deces(){
        LinkedList<ElementDeJeu> morts = new LinkedList();
        for (ElementDeJeu elem :elements){
            if(elem instanceof Creature crea){
                if(crea.getPtVie()<=0){
                    System.out.println(crea.getNom()+" est mort");
                    morts.add(elem);
                }
            }
        }
        for(ElementDeJeu rip :morts){
            elements.remove(rip);
        }
    }
    public void partie(Joueur lui){
        boolean mort=false;
        
        while(!mort){
            
            this.TourDeJeu(lui);
            this.deces();
            if(lui.getPerso().getPtVie()<=0){
                System.out.println("GAME OVER");
                mort=true;
            }
            else{
                lui.tourDeJeu();
                
            }
            
        }
    }
}
