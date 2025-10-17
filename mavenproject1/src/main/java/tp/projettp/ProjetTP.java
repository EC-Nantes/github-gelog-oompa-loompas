/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tp.projettp;

/**
 *
 * @author nathan
 */
public class ProjetTP {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        World map = new World();
        map.creerMondeAlea();
        Joueur player1=new Joueur(map);
        map.partie(player1);
    }
}
