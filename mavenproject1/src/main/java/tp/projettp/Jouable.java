/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tp.projettp;

/**
 *
 * @author nathan
 */
public interface Jouable extends Deplacable{
    @Override
    public void deplacer();
    public void deplacer(char c);
    public void combattre(Creature crea);
}
