/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;

import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangundatar.PersegiPanjang;
import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Tabung;

/**
 *
 * @author jadin
 */
public class ProjectBangun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabung a = new Tabung();
        Bola b = new Bola();
        Balok c = new Balok();
        Persegi d = new Persegi();
        PersegiPanjang e = new PersegiPanjang();
        Lingkaran f = new Lingkaran();
        
        System.out.println("Keliling Persegi adalah " + d.hitungKeliling());
        System.out.println("Luas Persegi adalah " + d.hitungLuas());
        System.out.println("Keliling Persegi Panjang adalah " + e.hitungKeliling());
        System.out.println("Luas Persegi Panjang adalah " + e.hitungLuas());
        System.out.println("Keliling Lingkaran adalah " + f.hitungKeliling());
        System.out.println("Luas Lingkaran adalah " + f.hitungLuas());
        System.out.println("Luas Tabung adalah " + a.Luas());
        System.out.println("Volume Tabung adalah " + a.Volume());
        System.out.println("Luas Bola adalah " + b.Luas());
        System.out.println("Volume Bola adalah " + b.Volume());
        System.out.println("Luas Balok adalah " + c.Luas());
        System.out.println("Volume Balok adalah " + c.Volume());
    }
    
}
