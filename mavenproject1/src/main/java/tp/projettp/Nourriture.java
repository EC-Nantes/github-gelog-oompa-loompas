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
    private int duree;
    private String nom;
    private int effet;
    private boolean bonus;
    private int valeur;
    private int residu;

    public int getDuree() {
        return duree;
    }

    public String getNom() {
        return nom;
    }

    public int getEffet() {
        return effet;
    }

    public boolean isBonus() {
        return bonus;
    }

    public int getValeur() {
        return valeur;
    }

    public int getResidu() {
        return residu;
    }
    
    public Nourriture(String nom,int effet,boolean estBonus,int valeurEffet, int duration){
        this.duree=duration;
        this.nom=nom;
        this.effet=effet;
        this.bonus=estBonus;
        this.valeur=valeurEffet;
        this.residu=0;
    }
    private int minmax(int actuel){
        int retour;
        if(bonus){
            retour=Math.min(actuel+valeur,100);
        }
        else{
            retour=Math.max(actuel+valeur,0);
        }
        if(retour!=actuel+valeur){
                residu=actuel+valeur-retour;
        }
        return retour;
    }
    public void utilisation(Personnage p){
        //1 = distance att,pageAtt,pagePar,degatt,ptpar,
        int nouveauSet;
        if(!bonus){
            valeur=-valeur;
        }
        if (effet==1){
            if (p instanceof Archer){
                nouveauSet=Math.max(valeur,0);
                p.setDistAMax(nouveauSet);
            }
        }
        if (effet==2){
            nouveauSet=minmax(p.getPagePar());
            p.setPagePar(nouveauSet);
        }
        if (effet==3){
            nouveauSet=minmax(p.getPageAtt());
            p.setPageAtt(nouveauSet);
        }
        if (effet==4){
            nouveauSet=Math.max(p.getDegAtt()+valeur,0);
            p.setDegAtt(nouveauSet);
        }
        if (effet==5){
            nouveauSet=Math.max(p.getPtPar()+valeur,0);
            p.setPtPar(nouveauSet);
        }
        if(!bonus){
            valeur=-valeur;
        }
    }
}
