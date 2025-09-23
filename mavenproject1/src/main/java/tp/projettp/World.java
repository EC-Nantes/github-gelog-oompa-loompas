/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;
import java.utlis.random;

/**
 *
 * @author nathan
 */
public class World {
    private Archer robin;
    private Paysan peon;
    private Lapin bug;
    
    public World(){
        this.robin= new Archer();
        this.peon= new Paysan();
        this.bug=new Lapin();
    }
    
    public void creerMondeAlea(){
        Random generateur=new Random();
        int x=generateur.nextInt();
        int y=generateur.nextInt();
        
    }
    
}
