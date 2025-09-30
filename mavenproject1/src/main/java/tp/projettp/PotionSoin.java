/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

/**
 *
 * @author nathan
 */
public class PotionSoin extends Objet {
    private int soin;

    /**
     *
     * @param soin soins apportés par la potion de soin
     */
    public PotionSoin(int soin){
        this.soin=soin;
    }

    /**
     *
     * @param qqn personnage à soigner
     */
    public void soigner(Personnage qqn){
        qqn.setPtVie(qqn.getPtVie()+soin);
    }
        
}