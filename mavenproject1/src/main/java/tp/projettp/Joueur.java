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

    public Joueur(){
        Scanner choix = new Scanner(System.in);
        String choixClasse=choix.toString();
        this.choisirClasse(choixClasse);
        choix =new Scanner(System.in);
        String nouveauNom=choix.toString();
        this.choisirNom(nouveauNom);
        monde=new World();
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
    Scanner choix = new Scanner(System.in);
    String action=choix.toString();
    if("1".equals(action)){
    this.perso.deplacer();
    if ("2".equals(action)){
        switch (perso) {
            case Archer archer -> archer.combattre();
            case Guerrier guerrier -> guerrier.combattre();
            default -> {
            }
        }
    
}}
}
    
}
