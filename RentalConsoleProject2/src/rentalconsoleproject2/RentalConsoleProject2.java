/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsoleproject2;
import java.util.Scanner;
/**
 *
 * @author jadin
 */
public class RentalConsoleProject2 extends RentalConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SilverMembership a = new SilverMembership();
        GoldMembership b = new GoldMembership();
        PlatinumMembership c = new PlatinumMembership();

        MemberRental();
           
        String idMember;
        int hariPinjam, bulanPinjam, tahunPinjam, hariKembali, bulanKembali, tahunKembali;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan ID Member               : ");
        idMember = input.nextLine();
        
        System.out.print("Masukkan Tanggal Pinjam (1 - 31) : ");
        hariPinjam = input.nextInt();
        
        System.out.print("Masukkan Bulan Pinjam (1 - 12)   : ");
        bulanPinjam = input.nextInt();
        
        System.out.print("Masukkan Tahun Pinjam            : ");
        tahunPinjam = input.nextInt();
        
        System.out.print("\nMasukkan Tanggal Kembali (1 - 31): ");
        hariKembali = input.nextInt();
        
        System.out.print("Masukkan Bulan Kembali (1 - 12)  : ");
        bulanKembali = input.nextInt();
        
        System.out.print("Masukkan Tahun Kembali           : ");
        tahunKembali = input.nextInt();
        
        cariMember(idMember);
                
        System.out.println("\nTanggal Pinjam                   : " + hariPinjam + " - " + bulanPinjam + " - " + tahunPinjam);
        System.out.println("Tanggal Kembali                  : " + hariKembali + " - " + bulanKembali + " - " + tahunKembali);
        
        
        int totalHari = totalHari(hariPinjam, bulanPinjam, tahunPinjam, hariKembali, bulanKembali, tahunKembali);
        System.out.println("Lama Sewa                        : " + totalHari + " hari");
        
        
        String jenisMember = JenisMember(idMember);
        if("Silver".equals(jenisMember)) {
            System.out.println("\nTotal Sewa                       : Rp. " + a.MenghitungHarga(totalHari));
            System.out.println("Jumlah Poin                      : " + a.MenghitungPoin(totalHari));
        
        } else if("Gold".equals(jenisMember)) {
            System.out.println("\nTotal Sewa                       : Rp. " + b.MenghitungHarga(totalHari));
            System.out.println("Jumlah Poin                      : " + b.MenghitungPoin(totalHari));
            System.out.println("Jumlah Cashback                  : Rp. " + b.cashback());
            
        } else if("Platinum".equals(jenisMember)) {
            System.out.println("\nTotal Sewa                       : Rp. " + c.MenghitungHarga(totalHari));
            System.out.println("Jumlah Poin                      : " + c.MenghitungPoin(totalHari));
            System.out.println("Jumlah Cashback                  : Rp. " + c.cashback());
            System.out.println("Bonus Pulsa                      : Rp. " + c.bonusPulsa(totalHari));
            
        } else {
            System.out.println("");
        }
    }  
}
