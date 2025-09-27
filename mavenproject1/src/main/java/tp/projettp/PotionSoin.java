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
    public PotionSoin(int soin){
        this.soin=soin;
    }
    public void soigner(Personnage qqn){
        qqn.setPV(qqn.getPV()+soin);
    }
        
}
