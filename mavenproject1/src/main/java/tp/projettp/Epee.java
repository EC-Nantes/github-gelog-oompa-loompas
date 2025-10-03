/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

/**
 * équipement augmentant les dégâts infligés par quiconque le possède
 * @author nathan
 */
public class Epee extends Objet {
    private int degat;
    
    /**
     *
     * @param degatsupp dégâts supplémentaires avec l'épée
     */
    public Epee(int degatsupp){
        this.degat=degatsupp;
    }
}
