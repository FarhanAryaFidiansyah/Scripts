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
public class MobilProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sedan a = new Sedan();
        SUV b = new SUV();
        MPV c = new MPV();
        
        System.out.println("========================================================================================================");
        System.out.println("Nama Mobil\tJenis\tPerjalanan\tKecepatan Rata-rata\tBahan Bakar Minimal\tWaktu Perjalanan");
        System.out.println("========================================================================================================");
        System.out.print("A\t\tSedan\tSolo-Kudus\t60 km/jam\t\t" + a.MinimalBahanBakar(170) + " Liter\t\t");
        a.MenghitungWaktuTempuh(60, 170);
        System.out.print("B\t\tSedan\tSolo-Jakarta\t65 km/jam\t\t" + a.MinimalBahanBakar(538) + " Liter\t\t");
        a.MenghitungWaktuTempuh(65, 538);
        System.out.print("C\t\tSUV\tSolo-Banten\t57 km/jam\t\t" + b.MinimalBahanBakar(662) + " Liter\t\t");
        b.MenghitungWaktuTempuh(57, 662);
        System.out.print("D\t\tSUV\tSolo-Bandung\t62 km/jam\t\t" + b.MinimalBahanBakar(534) + " Liter\t\t");
        b.MenghitungWaktuTempuh(62, 534);
        System.out.print("E\t\tMPV\tSolo-Banyuwangi\t64 km/jam\t\t" + c.MinimalBahanBakar(541) + " Liter\t\t");
        c.MenghitungWaktuTempuh(64, 541);
        System.out.print("F\t\tMPV\tSolo-Jember\t53 km/jam\t\t" + c.MinimalBahanBakar(433) + " Liter\t\t");
        c.MenghitungWaktuTempuh(53, 433);
        System.out.println("========================================================================================================");
    }   
}
