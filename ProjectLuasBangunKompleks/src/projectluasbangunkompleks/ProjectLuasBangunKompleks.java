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
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // hitung luas setiap ruang
        
        Persegi A = new Persegi();
        A.sisi1 = 42;
        A.sisi2 = 42;
        
        Lingkaran B = new Lingkaran();
        B.r = 21;
        
        // hitung luas total
        double hasilProject1 = A.hitungLuasPersegi() + 2 * B.hitungLuasLingkaran();
        System.out.println("Total luas Bangun Datar pada Project 1 adalah : " + hasilProject1);
        
        Lingkaran C = new Lingkaran();
        C.r = 14;
        
        Lingkaran D = new Lingkaran();
        D.r = 7;
        double hasilProject2 = (C.hitungLuasLingkaran() / 2)  - (D.hitungLuasLingkaran());
        System.out.println("Total luas Bangun Datar pada Project 2 adalah : " + hasilProject2);
    }
}
