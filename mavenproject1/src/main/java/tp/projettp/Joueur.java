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
public class Joueur {
    private Personnage perso;
    private World monde;
    private ArrayList<Objet> inventaire;
    public Joueur(){
        perso=new Guerrier();
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
    
}
