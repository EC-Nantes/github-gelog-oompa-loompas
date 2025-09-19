/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

/**
 *
 * @author julda
 */
public class Point2D{
    private int x;
    private int y;
    public Point2D(){
        x=0;
        y=0;
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
}
