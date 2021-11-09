/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author jadin
 */
public class Program {
    int pilih;
    int b;
    
    ArrayList<Integer> dataBil = new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);
    
    void program(){
        while (true) {
            System.out.println("Menu Data Array List :\n1. Tambah data\n2. Cari Data\n3. Hapus Data\n4. Tampil Data\n5. Keluar");
            System.out.print("Pilih nomor berapa :");
            pilih = input.nextInt();
            if (pilih == (int)1) {
                System.out.print("Masukkan Data String :");
                this.dataBil.add(input.nextInt());
                System.out.println("Daftar string dalam array list: " + this.dataBil);
            } else if (pilih == (int)2){
                System.out.print("String yang mau dicari :");
                b = input.nextInt();   
            } else if (pilih == (int)3){
                System.out.print("String yang mau dihapus :");
                b = input.nextInt();
                if (dataBil.contains(b)){
                    System.out.println("String " +"'"+b+"'"+" sudah dihapus di dalam data");
                } else {
                    System.out.println("String tidak ada dalam data");
                }

            } else if (pilih == (int)4){
                System.out.println("Daftar string dalam array list: " + this.dataBil);
            } else if (pilih == (int)5){
                System.out.println("Keluar dari program...");
                System.exit(0);
            }
        } 
    }
   
     
}
