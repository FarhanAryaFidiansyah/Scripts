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
public class Balok extends BangunRuang{
    int p = 5, l = 10, t = 15, luas, volume;
    
    public double Luas(){
        this.luas = 2 * (this.p * this.l + this.p * this.t + this.l * this.t);
        return this.luas;
    }
    
    public double Volume(){
        this.volume = this.p * this.l * this.t;
        return this.volume;
    }
    
}
