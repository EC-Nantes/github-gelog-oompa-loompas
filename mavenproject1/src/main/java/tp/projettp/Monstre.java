/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

/**
 * Sur-Classe des méchants présents sur la map
 * @author julda
 */
public abstract class Monstre extends Creature{
    
    protected int distAMax;
    protected int degAtt;
    protected int pAtt;
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
    super.nom=nom;
    super.ptVie=pV;
    this.distAMax=distA;
    this.degAtt=degA;
    this.pAtt=paAtt;
    super.pagePar=ptPar;
    super.pos= p;
    }
    
    /**
     * copie d'un monstre, avec positions indépendantes
     * @param m monstre à copier
     */
    public Monstre(Monstre m){
    super.nom=m.getNom();
    super.ptVie=m.getPtVie();
    this.distAMax=m.getDistAMax();
    this.degAtt=m.getDegAtt();
    this.pAtt=m.getPAtt();
    super.pagePar=m.getPagePar();
    super.pos= m.getPos();
    }

    /**
     * création d'un monstre de X PV et X dégâts d'attaque, de portée 1
     */
    public Monstre(){
        super();
    }

    public int getDistAMax() {
        return distAMax;
    }

    public int getDegAtt() {
        return degAtt;
    }

    public int getPAtt() {
        return pAtt;
    }
}
