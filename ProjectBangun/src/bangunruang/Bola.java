/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author jadin
 */
public class Bola extends BangunRuang {
    int r = 14;
    double phi = 3.14, luas, volume;
    
    public double Luas(){
        this.luas = 4 * this.phi * this.r * this.r;
        return this.luas;
    }
    
    public double Volume(){
        this.volume = 4 / 3 * this.phi * this.r * this.r * this.r;
        return this.volume;
    } 
     
}
