/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

/**
 * Potions avec pouvoir de régénération de pV
 * @author nathan
 */
public class PotionSoin extends Objet implements Utilisable{
    private int soin;

    /**
     * création d'une potion de soin à partir de son efficacité
     * @param soin soins apportés par la potion de soin
     */
    public PotionSoin(int soin){
        super();
        this.soin=soin;
        this.setNom("Potion de soin de "+soin+"pv");
    }

    /**
     * restaure les pV au personnage
     * @param qqn personnage à soigner
     */
    public void soigner(Personnage qqn){
        qqn.setPtVie(Math.min(qqn.getPtVie()+soin,qqn.getPvMax()));
    }
        
}