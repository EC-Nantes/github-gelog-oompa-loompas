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
        Personnage p = new Personnage();
        Point2D pos2=new Point2D(6,6);
        p.setPos(pos);
        Personnage p2 = new Personnage(p);
        p.setPos(pos2);
        System.out.println(p.getPos());
        System.out.println(p2.getPos());
    }
}
