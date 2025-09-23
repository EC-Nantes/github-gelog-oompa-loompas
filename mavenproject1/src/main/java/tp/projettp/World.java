/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;
import java.utli.Random;

/**
 *
 * @author nathan
 */
public class World {
    public Archer robin;
    public Paysan peon;
    public Lapin bug;
    
    public World(){
        this.robin= new Archer();
        this.peon= new Paysan();
        this.bug=new Lapin();
    }
    
    /* on refera plus tard
    public boolean verifierCase(pos){
        return 
    }*/
    
    public void creerMondeAlea(){
        Point2D pos=new Point2D();
        Point2D pos2=new Point2D();
        Point2D pos3=new Point2D();
        
        pos.randomPos();
        pos2.randomPos();
        pos3.randomPos();
        while (pos==pos2){
            pos2.randomPos();
        }
        while (pos==pos3 || pos2==pos3){
            pos3.randomPos();
        }
        robin.setPos(pos);
        peon.setPos(pos2);
        bug.setPos(pos3);        
    }
}
