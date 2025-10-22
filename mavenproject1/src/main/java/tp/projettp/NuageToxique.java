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
public class NuageToxique extends Objet implements Deplacable, Combattant {
    int degats;
    
    /**
     * Constructeur de Nuage toxique avec une position et des dégâts
     * @param position position du nuage
     * @param intensite dégâts du nuage
     */
    public NuageToxique(Point2D position, int intensite){
        this.setPos(position);
        this.degats=intensite;
        this.setSolide(false);
    }
    /**
     * Constructeur d'initialisation d'un nuage toxique
     */
    public NuageToxique(){
        super();
        this.setNom("Nuage Toxique");
        this.pos=new Point2D();
        this.degats=2;
        this.setSolide(false);
    }

    /**
     * Déplace aléatoirement le nuage sur une case adjacente
     */
    public void deplacer(){
        Random alea= new Random();
        int randomx=alea.nextInt(3)-1;
        int randomy=alea.nextInt(3)-1;
        this.setPos(new Point2D(this.pos.getX()+randomx,this.pos.getY()+randomy));
    }

    /**
     * méthode combattre adaptée au nuage toxique
     * @param c créature attaquée par le nuage toxique
     */
    public void combattre(Creature c){
        if (this.pos.distance(c.getPos())==0){
            c.loosePV(degats);
        }
        else{
            System.out.println("Erreur : Nuage hors de portée");
        }
    }
}
