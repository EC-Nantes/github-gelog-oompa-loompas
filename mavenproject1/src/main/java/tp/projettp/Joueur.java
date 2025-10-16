/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author julda
 */
public final class Joueur{
    private Personnage perso;
    private World monde;
    private ArrayList<Objet> inventaire;

    private ArrayList<Utilisable> effets;

    public Joueur(World world){
        System.out.println("entrez l'initiale de la classe choisie");
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
    public void tourDeJeu(){
        System.out.println("entrez le numero qui correspond a l'action a faire : "
                + "\n1: se deplacer");
        Creature creaproche=perso.creatureProche();
        if (perso.getPos().distance(creaproche.getPos())<=perso.getDistAMax()){
            System.out.println("2: combattre "+creaproche.getNom()+" située en "+"["+creaproche.getX()+","+creaproche.getY()+"]");
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
            case Guerrier guerrier -> guerrier.combattre(perso.creatureProche());
            default -> {
            }
        }
    }
}}
