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
        System.out.println("Robin fait 2 déplacements, voici ses 3 positions");
        map.robin.affiche();
        map.robin.deplace();
        map.robin.affiche();
        map.robin.deplace();
        map.robin.affiche();
        
    }
}
