/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;
import java.util.ArrayList;
import java.util.Scanner;
import static tp.projettp.World.elements;


/**
 *
 * @author julda
 */
public final class Joueur{
    private Personnage perso;
    private World monde;
    private ArrayList<Objet> inventaire;

    private ArrayList<Nourriture> effets;
    private int pvMax;
    
    public Joueur(World world){
        System.out.println("entrez l'initiale de la classe choisie (G pour guerrier, A pour Archer)");
        Scanner choix = new Scanner(System.in);
        String choixClasse=choix.next();
        this.choisirClasse(choixClasse);
        System.out.println("entrez le nom que vous voulez avoir");
        choix =new Scanner(System.in);
        String nouveauNom=choix.next();
        this.choisirNom(nouveauNom);
        monde=world;
        inventaire=new ArrayList();
    
    }

    public Personnage getPerso() {
        return perso;
    }

    public World getMonde() {
        return monde;
    }

    public ArrayList<Objet> getInventaire() {
        return inventaire;
    }

    public void setPerso(Personnage perso) {
        this.perso = perso;
    }

    public void setMonde(World monde) {
        this.monde = monde;
    }

    public void setInventaire(ArrayList<Objet> inventaire) {
        this.inventaire = inventaire;
    }
    
    public void ajoutInventaire(Objet equipement){
        this.inventaire.add(equipement);
    }
    
    public void choisirClasse(String classe){
        perso = switch (classe) {
            case "A" -> new Archer();
            case "G" -> new Guerrier();
            default -> new Guerrier();
        };
}
    public void choisirNom(String nom){
        this.perso.setNom(nom);
    }
    public void ramasser(){
        for(ElementDeJeu elem:elements){
                if (elem instanceof Utilisable && elem instanceof Objet o && this.perso.getPos().distance(o.getPos())<1){
                    inventaire.add(o);
                    System.out.println(o.getNom()+" recuperee");
                    elements.remove(o);
                    break;//On ne peut récupérer qu'un objet à la fois dans l'inventaire
                }
            }
    }
    public void tourDeJeu(){
        this.ramasser();
        this.perso.affiche();
        System.out.println("entrez le numero qui correspond a l'action a faire : "
                + "\n1: se deplacer");
        Creature creaproche=perso.creatureProche();
        if (perso.getPos().distance(creaproche.getPos())<=perso.getDistAMax()){
            System.out.println("2: combattre "+creaproche.getNom()+" située en "+"["+creaproche.getX()+","+creaproche.getY()+"]");
        }
        int i=0;
        for(Objet objet:inventaire){
            if (objet instanceof PotionSoin || objet instanceof Nourriture){
                i++;
                System.out.println((2+i)+": utiliser "+objet.getNom());
            }
        }
        if (perso instanceof Archer arc){
            System.out.println("Il vous reste "+arc.getNbFleches()+" flèches");
        }
        String touche;
        Scanner choix = new Scanner(System.in);
        String action=choix.next();
        if("1".equals(action)){
            System.out.println("entrez la lettre qui correspond a la direction dans laquelle vous voulez aller (en zqsd)");
            choix = new Scanner(System.in);
            touche = choix.next();
            char character = touche.charAt(0);
            this.perso.deplacer(character);
            
        }
        if ("2".equals(action)){
            switch (perso) {
                case Archer archer -> archer.combattre(perso.creatureProche());
                case Guerrier guerrier -> guerrier.combattre(perso.creatureProche(),inventaire);
                default -> {
                }
            }
        }
        for (int j=1;j<i;j++){
            int a=2+j;
            if(a==Integer.parseInt(action)){
                int k=0;
                for(Objet objet:inventaire){
                    if (objet instanceof PotionSoin potion){
                        k++;
                        if (k==j){
                            potion.soigner(perso);
                            inventaire.remove(potion);
                            break;
                        }
                    }
                    if(objet instanceof Nourriture denree){
                        k++;
                        if (k==j){
                            if(!denree.utilisation(perso)){
                                denree.utilisation(this);
                                effets.add(denree);
                                break;
                            }
                            inventaire.remove(denree);
                        }
                    }
                }
            }
        }
        if (!(effets==null)){
            for(Nourriture denree:effets){
                denree.passe();
                if(denree.getDuree()==0){
                    denree.finUtilisation(this);
                    effets.remove(denree);
                }
            }
        }
        this.perso.affiche();
    }
}
