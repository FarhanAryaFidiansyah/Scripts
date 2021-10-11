/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author jadin
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperasiBangunDatar X = new OperasiBangunDatar();
        System.out.println("Persegi Panjang");
        System.out.println("Hasil : " + X.persegiPanjang(10, 5));
        System.out.println("Hasil : " + X.persegiPanjang(3.6, 8));
        System.out.println("Hasil : " + X.persegiPanjang(6, 8.3));
        System.out.println("Hasil : " + X.persegiPanjang(5.6, 8.8));
        System.out.println("Persegi");
        System.out.println("Hasil : " + X.persegi(4.5));
        System.out.println("Hasil : " + X.persegi(7));
        System.out.println("Lingkaran");
        System.out.println("Hasil : " + X.Lingkaran(5));
        System.out.println("Hasil : " + X.Lingkaran(7.4));
        System.out.println("Segitiga");
        System.out.println("Hasil : " + X.Segitiga(8, 10));
        System.out.println("Hasil : " + X.Segitiga(8, 11.5));
        System.out.println("Hasil : " + X.Segitiga(12.2, 9));
        System.out.println("Hasil : " + X.Segitiga(13.9, 20.7));
    }
    
}
