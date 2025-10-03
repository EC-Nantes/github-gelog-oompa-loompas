/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

/**
 * Sur-Classe des méchants présents sur la map
 * @author julda
 */
public class Monstre extends Creature{

    /**
     * création d'un monstre avec les paramètres indiqués
     * @param nom nom du Monstre
     * @param pV nombre de points de vie
     * @param degA dégâts d'attaque du monstre
     * @param distA distance d'attaque max du monstre
     * @param paAtt pourcentage d'attaques réussies
     * @param paPar pourcentage d'attaques parées
     * @param ptPar dégâts esquivés
     * @param p position (x,y) initiale du monstre (classe Point2D)
     */

    public Monstre(String nom,int pV,int distA,int degA,int paAtt,int paPar, int ptPar,Point2D p){
        super(nom,pV,distA,degA,paAtt,paPar,ptPar,p);
    }
    
    /**
     * copie d'un monstre, avec positions indépendantes
     * @param m monstre à copier
     */
    public Monstre(Monstre m){
        super(m.getNom(),m.getPtVie(),m.getDistAttMax(),m.getDegAtt(),m.getPageAtt(),m.getPagePar(),m.getPtPar(),m.getPos());
    }

    /**
     * création d'un monstre de X PV et X dégâts d'attaque, de portée 1
     */
    public Monstre(){
        super();
    }
}
