/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;
import java.util.ArrayList;


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
        this.choisirClasse(' ');
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
    
    public void choisirClasse(char classe){
        perso = switch (classe) {
            case 'A' -> new Archer();
            case 'G' -> new Guerrier();
            default -> new Guerrier();
        };
}
    public void choisirNom(String nom){
        this.perso.setNom(nom);
    }

}
