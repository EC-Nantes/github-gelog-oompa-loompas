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
        Point2D pos=new Point2D(5,5);
        Monstre lapin=new Monstre(10,15,20,20,pos);
        System.out.println(lapin.getPtVie());
    }
}
