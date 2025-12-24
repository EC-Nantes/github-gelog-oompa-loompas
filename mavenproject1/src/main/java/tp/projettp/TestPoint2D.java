/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tp.projettp;

/**
 *
 * @author julda
 */
public class TestPoint2D {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Point2D pointeur1= new Point2D();
        System.out.println("creation avec 0 parametre. Resultat attendu : [0 ; 0], Resultat reel :");
        pointeur1.affiche();
        Point2D pointeur2= new Point2D(3,7);
        Point2D pointeur3= new Point2D(pointeur2);
        pointeur3.setPosition(5, 5);
        pointeur2.translate(-1, 2);
        System.out.println("Creation avec coordonnees x et y puis translation. Resultat attendu : [2 ; 9], Resultat reel :");
        pointeur2.affiche();
        System.out.println("Creation a partir d'un autre pointeur (copie) puis modification. Resultat attendu : [5 ; 5], Resultat reel :");
        pointeur3.affiche();
    }
}
