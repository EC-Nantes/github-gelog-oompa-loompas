/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

/**
 *
 * @author julda
 */
public class Nourriture extends Objet implements Utilisable{
    private int duree;
    private String nom;
    private int effet;
    private boolean bonus;
    private int valeur;
    private int residu;
    private boolean creaturisable;

    /**
     * création nourriture consaommable uniquement par les joueurs
     * @param nom
     * @param effet
     * @param valeurEffet
     * @param estBonus
     * @param duration
     */
    //1 = distance att,2 = pageAtt,3 = pagePar,4 = degatt,5 = ptpar,6 = pv
    public Nourriture(String nom,int effet,int valeurEffet,boolean estBonus, int duration){
        this.duree=duration;
        this.nom=nom;
        this.effet=effet;
        this.bonus=estBonus;
        this.valeur=valeurEffet;
        this.residu=0;
        this.creaturisable=false;
        this.setPos(new Point2D());
        this.getPos().randomPos();
        this.setSolide(false);
    }

    /**
     * création d'une nourriture applicable à tous
     * @param nom
     * @param effet
     * @param valeurEffet
     * @param estBonus
     */
    public Nourriture(String nom,int effet,int valeurEffet,boolean estBonus){
        this.duree=1000;
        this.nom=nom;
        this.effet=effet;
        this.bonus=estBonus;
        this.valeur=valeurEffet;
        this.residu=0;
        this.creaturisable=true;
    }
    
    /**
     *
     * @param duree
     */
    public void setDuree(int duree) {
        this.duree = duree;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @param effet
     */
    public void setEffet(int effet) {
        this.effet = effet;
    }

    /**
     *
     * @param bonus
     */
    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }

    /**
     *
     * @param valeur
     */
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    /**
     *
     * @param residu
     */
    public void setResidu(int residu) {
        this.residu = residu;
    }

    /**
     *
     * @param creaturalisable
     */
    public void setCreaturisable(boolean creaturalisable) {
        this.creaturisable = creaturalisable;
    }

    /**
     *
     * @return
     */
    public boolean isCreaturisable() {
        return creaturisable;
    }

    /**
     *
     * @return
     */
    public int getDuree() {
        return duree;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @return
     */
    public int getEffet() {
        return effet;
    }

    /**
     *
     * @return
     */
    public boolean isBonus() {
        return bonus;
    }

    /**
     *
     * @return
     */
    public int getValeur() {
        return valeur;
    }

    /**
     *
     * @return
     */
    public int getResidu() {
        return residu;
    }
    private int minmax(int actuel){
        int retour;
        if(bonus){
            retour=Math.min(actuel+valeur,100);
        }
        else{
            retour=Math.max(actuel+valeur,0);
        }
        if(retour!=actuel+valeur){
                residu=actuel+valeur-retour;
        }
        return retour;
    }

    /**
     *
     * @param c
     */
    public void utilisation(Creature c){
        //1 = distance att,pageAtt,pagePar,degatt,ptpar,
        if (creaturisable){
            int nouveauSet;
            if(!bonus){
                valeur=-valeur;
            }
            if (effet==1){
                if (c instanceof Archer){
                    nouveauSet=Math.max(valeur,0);
                    c.setDistAMax(nouveauSet);
                }
            }
            if (effet==2){
                nouveauSet=minmax(c.getPagePar());
                c.setPagePar(nouveauSet);
            }
            if (effet==3){
                nouveauSet=minmax(c.getPageAtt());
                c.setPageAtt(nouveauSet);
            }
            if (effet==4){
                nouveauSet=Math.max(c.getDegAtt()+valeur,0);
                c.setDegAtt(nouveauSet);
            }
            if (effet==5){
                nouveauSet=Math.max(c.getPtPar()+valeur,0);
                c.setPtPar(nouveauSet);
            }
            if (effet==6){
                nouveauSet=Math.max(c.getPtVie()+valeur,0);
                c.setPtVie(nouveauSet);
            }
            if(!bonus){
                valeur=-valeur;
            }
        }
    }
    public void utilisation(Joueur j){
        //1 = distance att,pageAtt,pagePar,degatt,ptpar,
        int nouveauSet;
        if(!bonus){
            valeur=-valeur;
        }
        if (effet==1){
            if (j.getPerso() instanceof Archer){
                nouveauSet=Math.max(valeur,0);
                j.getPerso().setDistAMax(nouveauSet);
            }
        }
        if (effet==2){
            nouveauSet=minmax(j.getPerso().getPagePar());
            j.getPerso().setPagePar(nouveauSet);
        }
        if (effet==3){
            nouveauSet=minmax(j.getPerso().getPageAtt());
            j.getPerso().setPageAtt(nouveauSet);
        }
        if (effet==4){
            nouveauSet=Math.max(j.getPerso().getDegAtt()+valeur,0);
            j.getPerso().setDegAtt(nouveauSet);
        }
        if (effet==5){
            nouveauSet=Math.max(j.getPerso().getPtPar()+valeur,0);
            j.getPerso().setPtPar(nouveauSet);
        }
        if (effet==6){
            nouveauSet=Math.max(j.getPerso().getPtVie()+valeur,0);
            j.getPerso().setPtVie(nouveauSet);
        }
        if(!bonus){
            valeur=-valeur;
        }
    }
    public void finUtilisation(Joueur j){
        //1 = distance att,pageAtt,pagePar,degatt,ptpar,
        int nouveauSet;
        if(bonus){
            valeur=-valeur;
        }
        if (effet==3){
            if (j.getPerso() instanceof Archer){
                nouveauSet=j.getPerso().getPageAtt()+valeur+residu;
                j.getPerso().setPageAtt(nouveauSet);
            }
        }
        if (effet==1){
            nouveauSet=j.getPerso().getDistAMax()+valeur+residu;
            j.getPerso().setDistAMax(nouveauSet);
        }
        if (effet==2){
            nouveauSet=j.getPerso().getPagePar()+valeur+residu;
            j.getPerso().setPagePar(nouveauSet);
        }
        if (effet==4){
            nouveauSet=j.getPerso().getDegAtt()+valeur+residu;
            j.getPerso().setDegAtt(nouveauSet);
        }
        if (effet==5){
            nouveauSet=j.getPerso().getPtPar()+valeur+residu;
            j.getPerso().setPtPar(nouveauSet);
        }
        if (effet==6){
            nouveauSet=j.getPerso().getPtVie()+valeur+residu;
            j.getPerso().setPtVie(nouveauSet);
        }
        if(bonus){
            valeur=-valeur;
        }
    }
}
