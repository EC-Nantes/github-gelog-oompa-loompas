/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.projettp;

import org.centrale.objet.WoE.Monstre;
import org.centrale.objet.WoE.Point2D;

/**
 *
 * @author julda
 */
public class Lapin extends Monstre {
    Lapin(int pV,int dA,int paAtt,int paPar,Point2D p){
        this.ptVie=pV;
        this.degAtt=dA;
        this.pageAtt=paAtt;
        this.PagePar=paPar;
        this.pos=p;
    }
    Lapin(Lapin l){
        this.ptVie=l.ptVie;
        this.degAtt=l.degAtt;
        this.pageAtt=l.pageAtt;
        this.PagePar=l.PagePar;
        this.pos=l.pos;
    }
    Lapin(){
        this.ptVie=10;
        this.degAtt=10;
        this.pageAtt=5;
        this.PagePar=5;
        this.pos=new Point2D();
    }
}
