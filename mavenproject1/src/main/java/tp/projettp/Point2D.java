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
    
    public boolean equals(Point2D pos2){
        return (this.x==pos2.getX() && this.y==pos2.getY());
    }
    
    
    public Point2D(){
        x=0;
        y=0;
    }
    public void randomPos(){
        Random generateur=new Random();
        this.x=generateur.nextInt(100);
        this.y=generateur.nextInt(100);
    }
    public Point2D(Point2D pointeur){
        x=pointeur.getX();
        y=pointeur.getY();
    }
    public Point2D(int xcord, int ycord){
        x=xcord;
        y=ycord;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    private void setX(int xcord){
        x=xcord;
    }
    private void setY(int ycord){
        y=ycord;
    }
    public void setPosition(int x, int y){
        setX(x);
        setY(y);
    }
    public void translate(int dx, int dy){
        setPosition(getX()+dx,getY()+dy);
    }
    public void affiche(){
        System.out.println("["+getX()+" ; "+getY()+"]");
    }
    public double distance(Point2D autre){
        return Math.sqrt(Math.pow((x-autre.getX()),2)+Math.pow((y-autre.getY()),2));
    }
}
