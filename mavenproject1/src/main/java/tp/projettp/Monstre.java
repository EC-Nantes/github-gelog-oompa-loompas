/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;
import java.util.Random;

/**
 *
 * @author julda
 */
public class Monstre extends Creature{

    /**
     *
     * @param pV nombre de points de vie
     * @param dA dégâts d'attaque du monstre
     * @param paAtt
     * @param paPar
     * @param p position (x,y) initiale du monstre (classe Point2D)
     */

    public Monstre(int pV,int dA,int paAtt,int paPar,Point2D p){
        super(pV,dA,paAtt,paPar,p);
    }
    public Monstre(Monstre m){
        super(m.getPtVie(),m.getDegAtt(),m.getPageAtt(),m.getPagePar(),new Point2D(m.getPos()));
    }
    public Monstre(){
        super();
    }
}
