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
public class Tabung extends BangunRuang {
    int tinggi = 15, r = 21;
    double phi = 3.14, luas, volume;
    
    public double Luas(){
        this.luas = 2 * this.phi * this.r * this.r;
        return this.luas;
    }
    
    public double Volume(){
        this.volume = this.phi * this.r * r * tinggi;
        return volume;
    }  
              
}
