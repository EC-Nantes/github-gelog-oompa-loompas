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

    public Point2D getPos() {
        return pos;
    }

    public boolean isSolide() {
        return estSolide;
    }

    public void setPos(Point2D pos) {
        this.pos = pos;
    }

    public void setSolide(boolean estSolide) {
        this.estSolide = estSolide;
    }
    
}
