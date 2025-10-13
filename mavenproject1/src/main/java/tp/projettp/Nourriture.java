/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

/**
 *
 * @author julda
 */
public class Nourriture extends Objet implements Utilisable{
    int duree;
    String nom;
    int effet;
    boolean bonus;
    int valeur;
    public Nourriture(String nom,int effet,boolean estBonus,int valeurEffet, int duration){
        this.duree=duration;
        this.nom=nom;
        this.effet=effet;
        this.bonus=estBonus;
        this.valeur=valeurEffet;
    }
    public void utilisation(Personnage p){
        //1 = distance att,pageAtt,pagePar,degatt,ptpar,
        //case et default
    }
}
