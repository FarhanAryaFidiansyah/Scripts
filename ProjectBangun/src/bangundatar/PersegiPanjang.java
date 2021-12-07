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
public class PersegiPanjang extends BangunDatar{
    // atribut jari-jari
    public double Luas;
    public int p = 5, l = 3, Keliling;
     
    // method untuk hitung luas lingkaran
    public double hitungLuas(){
        Luas = this.p * this.l;
	return Luas;
    }
    
    // method untuk hitung keliling
    public double hitungKeliling(){
 	Keliling = 2 * (this.p + this.l);
	return Keliling;
    }

}
