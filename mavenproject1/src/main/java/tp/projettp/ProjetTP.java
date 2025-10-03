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
        Point2D pos=new Point2D();
        Point2D pos2= new Point2D(4,3);
        System.out.printf("Valeur formatée : %.2f", pos.distance(pos2));
          
    }
}
