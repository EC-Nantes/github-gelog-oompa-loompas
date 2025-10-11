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
    protected int degAtt;
    protected int pageAtt;
    protected int distAMax;

    public int getDegAtt() {
        return degAtt;
    }

    public int getPageAtt() {
        return pageAtt;
    }

    public int getDistAMax() {
        return distAMax;
    }

    public void setDegAtt(int degAtt) {
        this.degAtt = degAtt;
    }

    public void setPageAtt(int pageAtt) {
        this.pageAtt = pageAtt;
    }

    public void setDistAMax(int distAMax) {
        this.distAMax = distAMax;
    }
    
    public void parler(String discours){
        System.out.println(this.getNom()+" : '"+discours+"'");
    }
}
