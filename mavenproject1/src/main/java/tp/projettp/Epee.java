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
    private int resiste;//, prouve que tu existes !
    
    /**
     * @param nom nom de l'épée
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
        this.pos=new Point2D();
    }

    /**
     *
     * @return
     */
    public int getDegat() {
        return degat;
    }

    /**
     *
     * @param degat
     */
    public void setDegat(int degat) {
        this.degat = degat;
    }

    /**
     * A chaque utilisation de l'objet, son état se détériore
     * @return l'objet est il encore utilisable ?
     */
    public boolean utilisation(){
        resiste--;
        return resiste>0;
    }
}
