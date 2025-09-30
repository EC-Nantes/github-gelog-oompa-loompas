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
public class Point2D{
    private int x;
    private int y;
    
    /**
     *
     * @param pos2 position à comparer
     * @return booléen les positions x et y des 2 positions sont égales
     */
    public boolean equals(Point2D pos2){
        return (this.x==pos2.getX() && this.y==pos2.getY());
    }
    
    /**
     *
     */
    public Point2D(){
        x=0;
        y=0;
    }

    /**
     *
     */
    public void randomPos(){
        Random generateur=new Random();
        this.x=generateur.nextInt(100);
        this.y=generateur.nextInt(100);
    }

    /**
     *
     * @param pointeur pointeur à copier
     */
    public Point2D(Point2D pointeur){
        x=pointeur.getX();
        y=pointeur.getY();
    }

    /**
     *
     * @param xcord coordonnée x du vecteur
     * @param ycord coordonnée y du vecteur
     */
    public Point2D(int xcord, int ycord){
        x=xcord;
        y=ycord;
    }

    /**
     *
     * @return coordonnée x du vecteur
     */
    public int getX(){
        return x;
    }

    /**
     *
     * @return coordonnée y du vecteur
     */
    public int getY(){
        return y;
    }
    private void setX(int xcord){
        x=xcord;
    }
    private void setY(int ycord){
        y=ycord;
    }

    /**
     *
     * @param x coordonnée x de la position
     * @param y coordonnée x de la position
     */
    public void setPosition(int x, int y){
        setX(x);
        setY(y);
    }

    /**
     *
     * @param dx déplacement sur x
     * @param dy déplacement sur y
     */
    public void translate(int dx, int dy){
        setPosition(getX()+dx,getY()+dy);
    }

    /**
     *
     */
    public void affiche(){
        System.out.println("["+getX()+" ; "+getY()+"]");
    }

    /**
     *
     * @param autre deuxième position
     * @return distance entre les 2 positions
     */
    public double distance(Point2D autre){
        return Math.sqrt(Math.pow((x-autre.getX()),2)+Math.pow((y-autre.getY()),2));
    }
}
