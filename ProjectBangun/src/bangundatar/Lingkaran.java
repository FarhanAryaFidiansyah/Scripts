/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author jadin
 */
public class Lingkaran extends BangunDatar{
    // atribut jari-jari
    public double r = 7, phi = 3.14, Luas, Keliling;
     
    // method untuk hitung luas lingkaran
    public double hitungLuas(){
        Luas = this.phi * this.r * this.r;
	return Luas;
    }
    
    // method untuk hitung keliling
    public double hitungKeliling(){
 	Keliling = 2 * this.phi * this.r;
	return Keliling;
    }
}
