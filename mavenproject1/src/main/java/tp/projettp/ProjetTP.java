/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tp.projettp;

/**
 *
 * @author nathan
 */
public class ProjetTP {

    public static void main(String[] args) {
        World map = new World();
        map.creerMondeAlea();
        map.guillaumeT= new Archer(map.robin);
        map.robin.deplace();
        map.robin.affiche();
        map.guillaumeT.affiche();
        
    }
}
