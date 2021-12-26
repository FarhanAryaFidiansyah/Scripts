/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawanapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jadin
 */
public class KaryawanApp extends Karyawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Pilihan Menu :\n1. Tambah Data\n2. Hapus Data\n3. Cari Data\n4. Lihat Data\n5. Exit");
            System.out.print("Menu Pilihan :");
            int pilih = input.nextInt();
            if (pilih == (int)1){
                tambahKaryawan();
                while (true) {
                    System.out.println("Pilihan Sub Menu :\n1. Kembali ke Menu Utama \n2. Tambah Data Kembali ");
                    System.out.print("Menu Pilihan :");
                    int PilihSubMenu = input.nextInt();
                    if (PilihSubMenu == 1){
                        break;
                    } else if (PilihSubMenu == 2){
                        tambahKaryawan();
                    }
                }
            } else if (pilih == (int)2){
                hapusKaryawan();
                while (true) {
                    System.out.println("Pilihan Sub Menu :\n1. Kembali ke Menu Utama \n2. Hapus Data Kembali ");
                    System.out.print("Menu Pilihan :");
                    int PilihSubMenu = input.nextInt();
                    if (PilihSubMenu == 1){
                        break;
                    } else if (PilihSubMenu == 2){
                        hapusKaryawan();
                    }
                }
            } else if (pilih == (int)3){ 
                cariKaryawan();
                while (true) {
                    System.out.println("Pilihan Sub Menu :\n1. Kembali ke Menu Utama \n2. Cari Data Kembali ");
                    System.out.print("Menu Pilihan :");
                    int PilihSubMenu = input.nextInt();
                    if (PilihSubMenu == 1){
                        break;
                    } else if (PilihSubMenu == 2){
                        cariKaryawan();
                    }
                }
            } else if (pilih == (int)4){ 
                lihatKaryawan();
                while (true) {
                    System.out.println("Pilihan Sub Menu :\n1. Kembali ke Menu Utama \n2. Lihat Data Kembali ");
                    System.out.print("Menu Pilihan :");
                    int PilihSubMenu = input.nextInt();
                    if (PilihSubMenu == 1){
                        break;
                    } else if (PilihSubMenu == 2){
                        lihatKaryawan();
                    }
                }
            } else if (pilih == (int)5){
                System.out.println("Keluar dari Program..");
                System.exit(0);
            } else {
                System.out.println("Pilihan Salah..Silahkan Ulangi");
            }
        }
    }
    
}
