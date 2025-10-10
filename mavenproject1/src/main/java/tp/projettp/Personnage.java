/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

/**
 *
 * @author nathan
 */
public abstract class Personnage extends Creature{
    public void parler(String discours){
        System.out.println(this.getNom()+" : '"+discours+"'");
    }
}
