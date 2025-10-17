/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

/**
 * équipement augmentant les dégâts infligés par quiconque le possède
 * @author nathan
 */
public class Epee extends Objet implements Utilisable{
    private int degat;
    private int resiste;
    
    /**
     * @param nom
     * @param resistance nombre de tours pouvant être utilisé
     * @param degatsupp dégâts supplémentaires avec l'épée
     */
    public Epee(String nom,int degatsupp,int resistance){
        this.degat=degatsupp;
        this.setSolide(false);
        this.setNom(nom);
        this.setPos(new Point2D());
        this.getPos().randomPos();
        this.resiste=resistance;
    }

    public int getDegat() {
        return degat;
    }

    public void setDegat(int degat) {
        this.degat = degat;
    }
    public boolean utilisation(){
        resiste--;
        return resiste>0;
    }
}
