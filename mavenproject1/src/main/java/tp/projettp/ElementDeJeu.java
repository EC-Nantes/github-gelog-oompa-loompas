/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

/**
 * Superclasse de tous les éléments du jeu.
 * @author julda
 */
public abstract class ElementDeJeu {

    /**
     *position de l'élément sur le plateau
     */
    protected Point2D pos;
    private boolean estSolide;

    /**
     * nom de l'élément
     */
    protected String nom;
    
    /**
     * Constructeur originel utilisé pour les sous-classes
     */
    public ElementDeJeu(){
        pos=new Point2D();
        estSolide=true;
        nom = "Sans nom 1";
    }
    
    /**
     *
     * @return
     */
    public Point2D getPos() {
        return this.pos;
    }

    /**
     *
     * @return peut-on se déplacer sur l'élément ?
     */
    public boolean isSolide() {
        return estSolide;
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
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     *
     * @param pos
     */
    public void setPos(Point2D pos) {
        this.pos = pos;
    }

    /**
     *
     * @param estSolide
     */
    public void setSolide(boolean estSolide) {
        this.estSolide = estSolide;
    }

    /**
     * affiche la position et le nom de l'élément dans le terminal
     */
    public void affiche(){
        System.out.println("position de "+this.getNom()+" : ["+this.pos.getX()+","+this.pos.getY()+"]");
    }
}
