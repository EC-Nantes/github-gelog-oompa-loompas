/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


/**
 *
 * @author nathan
 */
public final class ChargerPartie {
    String source; 
    int largeur;
    int hauteur;
    
    public ChargerPartie(String nomFichier) {
        source=nomFichier;
    }
    public World creerWorld(){
        ArrayList liste;
        ArrayList grandeListe;
        String ligne;
        World monde = null;
        int i=0;
        int j=0;
        String mot;
        BufferedReader fichier;
        String delimiteurs=" ,.;";
        try {
            fichier = new BufferedReader(new FileReader(this.source));
            ligne=fichier.readLine();
            StringTokenizer tokenizer=new StringTokenizer(ligne, delimiteurs);
            grandeListe=new ArrayList();
        while (ligne!=null){
            if (i==0){
                while (tokenizer.hasMoreTokens()){
                    mot=tokenizer.nextToken();
                    if(j==1){
                        this.largeur=Integer.parseInt(mot);
                    }
                    j++;
                }
                i++;
            }
            else if (i==1){
                j=0;
                while (tokenizer.hasMoreTokens()){
                    mot=tokenizer.nextToken();
                    if(j==1){
                        this.hauteur=Integer.parseInt(mot);
                    }
                    j++;
                }
                i++;
            }
            else{
                liste =new ArrayList<String>();
                while (tokenizer.hasMoreTokens()){
                    liste.add(tokenizer.nextToken());
                }
            grandeListe.add(liste);
            ligne=fichier.readLine();}
        }
        fichier.close();
        monde=new World(largeur, hauteur, grandeListe);
        } catch (IOException ex) {
            System.getLogger(ChargerPartie.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        finally{return monde;}
    }
    
    
}
