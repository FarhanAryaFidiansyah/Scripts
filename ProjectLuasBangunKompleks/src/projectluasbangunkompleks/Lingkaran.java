/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author jadin
 */
public class Lingkaran {
    // atribut
    double phi = 3.14;
    int r;
    
    // method
    double hitungLuasLingkaran(){
        double luas = this.phi * this.r * this.r;
        return luas;
    }

}
