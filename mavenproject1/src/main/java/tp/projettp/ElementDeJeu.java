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
    protected Point2D pos;
    private boolean estSolide;
    protected String nom;
    
    
    public ElementDeJeu(){
        pos=new Point2D();
        estSolide=true;
        nom = "Sans nom 1";
    }
    
    public Point2D getPos() {
        return this.pos;
    }

    public boolean isSolide() {
        return estSolide;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setPos(Point2D pos) {
        this.pos = pos;
    }

    public void setSolide(boolean estSolide) {
        this.estSolide = estSolide;
    }
    public void affiche(){
        System.out.println("position de "+this.getNom()+" : ["+this.pos.getX()+","+this.pos.getY()+"]");
    }
}
