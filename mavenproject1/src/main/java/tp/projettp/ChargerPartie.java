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
import java.util.List;
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
        List liste;
        List<List> grandeListe;
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
        List<ElementDeJeu> listeDeElements = new ArrayList<>();
        for (List elementComplet : grandeListe){
        listeDeElements.add(creerElementJeu(elementComplet));}
        monde=new World(largeur, hauteur, listeDeElements);
        } catch (IOException ex) {
            System.getLogger(ChargerPartie.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        finally{return monde;}
    }
    
    /**
     * une fonction qui renvoie un element de jeu à partir de sa description en chaine de caractere
     * 
     * @param elementComplet une liste de chaine de caractere qui contient en premier le nom de la classe suivie des attributs de la classe
     * @return 
     */
    public ElementDeJeu creerElementJeu(List<String> elementComplet){
            String nomClasse = (String) elementComplet.get(0);
            ElementDeJeu element = null;
            switch ((nomClasse)){
                case("Guerrier"):
                    switch(elementComplet.size()){
                        case (10):
//ici on enregistrera toujours de la même manière, donc il y aura peu de cas à définir
                            int test=Integer.parseInt( elementComplet.get(2));
                            Point2D pos = new Point2D(Integer.parseInt( elementComplet.get(8)),Integer.parseInt( elementComplet.get(9)));
                            element =new Guerrier((String) elementComplet.get(1),Integer.parseInt(elementComplet.get(2)),Integer.parseInt(elementComplet.get(3)),Integer.parseInt(elementComplet.get(4)),Integer.parseInt(elementComplet.get(5)), pos,Integer.parseInt(elementComplet.get(7)));
                        break;
                        default:
                            element= new Guerrier();
                        break;
                        }
//il aurait fallu le faire pour chaque classe mais on a pas eu le temps et ce serait long et sans grand intérêt 
                    default :
                    System.out.println("il manque une classe");
                            //on devrait throw une erreur mais on a manqué de temps pour tout bien définir;
                    
                    break;
                    
            }
        return element;
    }
        
    
}
