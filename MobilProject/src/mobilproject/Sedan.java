/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilproject;

/**
 *
 * @author jadin
 */
public class Sedan extends Mobil {
    //Atributt
    double waktu;
    int konsumsiBahanBakar, kecRata2, jarak, ubahWaktu;
    int totalJam, totalMenit, totalDetik, modWaktu;

    Sedan(){
        this.konsumsiBahanBakar = 10;
    }
    
    public void MenghitungWaktuTempuh(int kecRata2, int jarak){
        jarak = jarak * 1000;
        kecRata2   = kecRata2 * 1000;

        // Hitung waktu yang dibutuhkan
        waktu       = jarak / ((double) kecRata2 / 3600);
        ubahWaktu  = (int) waktu; // jadikan int

        modWaktu    = ubahWaktu % 3600; // cari sisa bagi
        totalJam    = (ubahWaktu - modWaktu) / 3600; // hitung untuk jam
        totalMenit  = (modWaktu - modWaktu % 60) / 60; // hitung untuk menit

        // Tampilkan hasil perhitungan
        
        System.out.printf("%d jam %d menit%n", totalJam, totalMenit);
    }
    
    int MinimalBahanBakar(int jarak){
        int bahanBakarMinimal = jarak / this.konsumsiBahanBakar;
        return bahanBakarMinimal;
    }
    
}
