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
        System.out.println("bugs fait 2 deplacements, voici ses 3 positions");
        map.bugs.affiche();
        map.bugs.deplace();
        map.bugs.affiche();
        map.bugs.deplace();
        map.bugs.affiche();
        
    }
}
