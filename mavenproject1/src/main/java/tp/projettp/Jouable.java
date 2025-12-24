/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tp.projettp;
import java.util.ArrayList;

/**
 *
 * @author nathan
 */
public interface Jouable extends Deplacable{

    /**
     * déplace le joueur sur une case adjacente aléatoire
     */
    @Override
    public void deplacer();

    /**
     * Déplacement dans la direction désirée par le joueur
     * @param c
     */
    public void deplacer(char c);

    /**
     * Combat sans objet
     * @param crea
     */
    public void combattre(Creature crea);

    /**
     * Combat avec les objets de l'inventaire
     * @param crea créature attaquée
     * @param inventaire inventaire du joueur
     */
    public void combattre(Creature crea,ArrayList<Objet> inventaire);
}
