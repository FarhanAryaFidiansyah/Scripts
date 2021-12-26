/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawanapp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jadin
 */
public class Karyawan {
    static Map<String, List<String>> dataKaryawan = new HashMap<String, List<String>>();
    static void tambahKaryawan(){
        String kodeKaryawan, namaKaryawan, alamatKaryawan, tglLahirKaryawan, usiaKaryawan;
        Scanner input = new Scanner(System.in);
           
        List<String> Karyawan = new ArrayList<String>();
        System.out.print("Masukkan Kode Karyawan               : ");
        kodeKaryawan = input.nextLine();
        System.out.print("Masukkan Nama Karyawan               : ");
        namaKaryawan = input.nextLine();
        Karyawan.add(namaKaryawan);
        System.out.print("Masukkan Alamat Karyawan             : ");
        alamatKaryawan = input.nextLine();
        Karyawan.add(alamatKaryawan);
        System.out.print("Masukkan Usia Karyawan               : ");
        usiaKaryawan = input.nextLine();
        Karyawan.add(usiaKaryawan);
        System.out.print("Masukkan Golongan Karyawan           : ");
        String golKaryawan = input.nextLine();
        if (golKaryawan.equals("A")){
            Karyawan.add(golKaryawan);
        } else if (golKaryawan.equals("B")){
            Karyawan.add(golKaryawan);
        } else if (golKaryawan.equals("C")){
            Karyawan.add(golKaryawan);
        } else if (golKaryawan.equals("D")){
            Karyawan.add(golKaryawan);
        } else {
            System.out.println("Golongan Karyawan Salah..Silahkan Ulangi Program");
            System.exit(0);
        }
        System.out.print("Masukkan Status Menikah              : ");
        String statusMenikah = input.nextLine();
        if (statusMenikah.equals("1")){
            Karyawan.add("Sudah Menikah");
            System.out.print("Masukkan Jumlah Anak                 : ");
            String jumlahAnak = input.nextLine();
            Karyawan.add(jumlahAnak);
        } else if (statusMenikah.equals("0")){
            Karyawan.add("Belum Menikah");
            Karyawan.add("-");
        } else {
            System.out.println("Status Menikah Salah..Silahkan Ulangi Program");
            System.exit(0);
        }
        dataKaryawan.put(kodeKaryawan, Karyawan);  
    }
    static void hapusKaryawan(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kode Karyawan yang ingin dihapus      :");
        String HapusKodeKaryawan = input.nextLine();
        dataKaryawan.remove(HapusKodeKaryawan);
    }
    static void lihatKaryawan(){
        System.out.println("============================================================================");
        System.out.println("\t\t\t\tDATA KARYAWAN");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("KODE KARY\t NAMA KARY\t GOL\t USIA\t STATUS NIKAH\t JUMLAH ANAK");
        System.out.println("----------------------------------------------------------------------------");
        for ( Map.Entry<String, List<String>> data : dataKaryawan.entrySet()) {
            String key = data.getKey();
            List<String> value = data.getValue();
            System.out.print(key + "\t " + value.get(0)+ "\t\t " + value.get(3)+ "\t " + value.get(2)+ "\t " + value.get(4)+ "\t "+ value.get(5)+ "\n");
           
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Jumlah Data :" + dataKaryawan.size());
    }
    static void cariKaryawan() {
        int tunjanganPegawai = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kode Karyawan :");
        String carikodeKaryawan = input.nextLine();
        if(dataKaryawan.containsKey(carikodeKaryawan)) {
            
            for(Map.Entry<String, List<String>> entry : dataKaryawan.entrySet()) {
                if(entry.getKey().equals(carikodeKaryawan)) {
                    
                String key = entry.getKey();
                List<String> values = entry.getValue();
                
                System.out.println("\nKode Karyawan                 : " + key);
                System.out.println("Nama Karyawan                 : " + values.get(0));
                System.out.println("Golongan                      : " + values.get(3));
                System.out.println("Usia                          : " + values.get(2));
                System.out.println("Status Menikah                : " + values.get(4));
                System.out.println("Jumlah Anak                   : " + values.get(5));
                System.out.println("-------------------------------------");
                if (values.get(3).equals("A")){
                    int gajiPokok = 5000000;
                    System.out.println("Gaji Pokok                    : Rp.5000000,00-");
                    if (values.get(4).equals("Sudah Menikah")){
                        int tunjanganPernikahan = 500000;
                        System.out.println("Tunjangan Istri/Suami         : Rp.500000,00-");
                        int cekUsia = Integer.parseInt(values.get(2));
                        if (cekUsia > 30){
                            tunjanganPegawai = tunjanganPegawai + 750000;
                            System.out.println("Tunjangan Pegawai             : Rp.750000,00-");
                        } else if(cekUsia < 0){
                            tunjanganPegawai = 0;
                        }
                        int totalAnak = Integer.parseInt(values.get(5));
                        int tunjanganAnak = totalAnak * 250000;
                        System.out.println("Tunjangan Anak                : Rp."+ tunjanganAnak +",00-");
                        System.out.println("------------------------------------- +");
                        int gajiKotor = gajiPokok + tunjanganPernikahan + tunjanganPegawai + tunjanganAnak;
                        System.out.println("Gaji Kotor                    : Rp."+ gajiKotor +",00-");
                        int potongan = (int) (gajiKotor * 2.5 / 100);
                        System.out.println("Potongan                      : Rp."+ potongan +",00-");
                        System.out.println("------------------------------------- -");
                        System.out.println("Gaji Bersih                   : Rp."+ (gajiKotor - potongan) +",00-");
                    } else if (values.get(4).equals("Belum Menikah")){
                        int cekUsia = Integer.parseInt(values.get(2));
                        if (cekUsia > 30){
                            tunjanganPegawai = tunjanganPegawai + 750000;
                            System.out.println("Tunjangan Pegawai             : Rp.750000,00-");
                        } else if(cekUsia < 0){
                            tunjanganPegawai = 0;
                        }
                        System.out.println("------------------------------------- +");
                        int gajiKotor = gajiPokok + tunjanganPegawai;
                        System.out.println("Gaji Kotor                    : Rp."+ gajiKotor +",00-");
                        int potongan = (int) (gajiKotor * 2.5 / 100);
                        System.out.println("Potongan                      : Rp."+ potongan +",00-");
                        System.out.println("------------------------------------- -");
                        System.out.println("Gaji Bersih                   : Rp."+ (gajiKotor - potongan) +",00-");
                    }
                } else if (values.get(3).equals("B")){
                    int gajiPokok = 6000000;
                    System.out.println("Gaji Pokok                    : Rp.6000000,00-");
                    if (values.get(4).equals("Sudah Menikah")){
                        int tunjanganPernikahan = 600000;
                        System.out.println("Tunjangan Istri/Suami         : Rp.600000,00-");
                        int cekUsia = Integer.parseInt(values.get(2));
                        if (cekUsia > 30){
                            tunjanganPegawai = tunjanganPegawai + 900000;
                            System.out.println("Tunjangan Pegawai             : Rp.900000,00-");
                        } else if(cekUsia < 0){
                            tunjanganPegawai = 0;
                        }
                        int totalAnak = Integer.parseInt(values.get(5));
                        int tunjanganAnak = totalAnak * 300000;
                        System.out.println("Tunjangan Anak                : Rp."+ tunjanganAnak +",00-");
                        System.out.println("------------------------------------- +");
                        int gajiKotor = gajiPokok + tunjanganPernikahan + tunjanganPegawai + tunjanganAnak;
                        System.out.println("Gaji Kotor                    : Rp."+ gajiKotor +",00-");
                        int potongan = (int) (gajiKotor * 2.5 / 100);
                        System.out.println("Potongan                      : Rp."+ potongan +",00-");
                        System.out.println("------------------------------------- -");
                        System.out.println("Gaji Bersih                   : Rp."+ (gajiKotor - potongan) +",00-");
                    } else if (values.get(4).equals("Belum Menikah")){
                        int cekUsia = Integer.parseInt(values.get(2));
                        if (cekUsia > 30){
                            tunjanganPegawai = tunjanganPegawai + 900000;
                            System.out.println("Tunjangan Pegawai             : Rp.900000,00-");
                        } else if(cekUsia < 0){
                            tunjanganPegawai = 0;
                        }
                        System.out.println("------------------------------------- +");
                        int gajiKotor = gajiPokok + tunjanganPegawai;
                        System.out.println("Gaji Kotor                    : Rp."+ gajiKotor +",00-");
                        int potongan = (int) (gajiKotor * 2.5 / 100);
                        System.out.println("Potongan                      : Rp."+ potongan +",00-");
                        System.out.println("------------------------------------- -");
                        System.out.println("Gaji Bersih                   : Rp."+ (gajiKotor - potongan) +",00-");
                    }
                } else if (values.get(3).equals("C")){
                    int gajiPokok = 7000000;
                    System.out.println("Gaji Pokok                    : Rp.7000000,00-");
                    if (values.get(4).equals("Sudah Menikah")){
                        int tunjanganPernikahan = 700000;
                        System.out.println("Tunjangan Istri/Suami         : Rp.700000,00-");
                        int cekUsia = Integer.parseInt(values.get(2));
                        if (cekUsia > 30){
                            tunjanganPegawai = tunjanganPegawai + 1050000;
                            System.out.println("Tunjangan Pegawai             : Rp.1050000,00-");
                        } else if(cekUsia < 0){
                            tunjanganPegawai = 0;
                        }
                        int totalAnak = Integer.parseInt(values.get(5));
                        int tunjanganAnak = totalAnak * 350000;
                        System.out.println("Tunjangan Anak                : Rp."+ tunjanganAnak +",00-");
                        System.out.println("------------------------------------- +");
                        int gajiKotor = gajiPokok + tunjanganPernikahan + tunjanganPegawai + tunjanganAnak;
                        System.out.println("Gaji Kotor                    : Rp."+ gajiKotor +",00-");
                        int potongan = (int) (gajiKotor * 2.5 / 100);
                        System.out.println("Potongan                      : Rp."+ potongan +",00-");
                        System.out.println("------------------------------------- -");
                        System.out.println("Gaji Bersih                   : Rp."+ (gajiKotor - potongan) +",00-");
                    } else if (values.get(4).equals("Belum Menikah")){
                        int cekUsia = Integer.parseInt(values.get(2));
                        if (cekUsia > 30){
                            tunjanganPegawai = tunjanganPegawai + 1050000;
                            System.out.println("Tunjangan Pegawai             : Rp.1050000,00-");
                        } else if(cekUsia < 0){
                            tunjanganPegawai = 0;
                        }
                        System.out.println("------------------------------------- +");
                        int gajiKotor = gajiPokok + tunjanganPegawai;
                        System.out.println("Gaji Kotor                    : Rp."+ gajiKotor +",00-");
                        int potongan = (int) (gajiKotor * 2.5 / 100);
                        System.out.println("Potongan                      : Rp."+ potongan +",00-");
                        System.out.println("------------------------------------- -");
                        System.out.println("Gaji Bersih                   : Rp."+ (gajiKotor - potongan) +",00-");
                    }
                } else if (values.get(3).equals("D")){
                    int gajiPokok = 8000000;
                    System.out.println("Gaji Pokok                    : Rp.8000000,00-");
                    if (values.get(4).equals("Sudah Menikah")){
                        int tunjanganPernikahan = 800000;
                        System.out.println("Tunjangan Istri/Suami         : Rp.800000,00-");
                        int cekUsia = Integer.parseInt(values.get(2));
                        if (cekUsia > 30){
                            tunjanganPegawai = tunjanganPegawai + 1200000;
                            System.out.println("Tunjangan Pegawai             : Rp.1200000,00-");
                        } else if(cekUsia < 0){
                            tunjanganPegawai = 0;
                        }
                        int totalAnak = Integer.parseInt(values.get(5));
                        int tunjanganAnak = totalAnak * 400000;
                        System.out.println("Tunjangan Anak                : Rp."+ tunjanganAnak +",00-");
                        System.out.println("------------------------------------- +");
                        int gajiKotor = gajiPokok + tunjanganPernikahan + tunjanganPegawai + tunjanganAnak;
                        System.out.println("Gaji Kotor                    : Rp."+ gajiKotor +",00-");
                        int potongan = (int) (gajiKotor * 2.5 / 100);
                        System.out.println("Potongan                      : Rp."+ potongan +",00-");
                        System.out.println("------------------------------------- -");
                        System.out.println("Gaji Bersih                   : Rp."+ (gajiKotor - potongan) +",00-");
                    } else if (values.get(4).equals("Belum Menikah")){
                        int cekUsia = Integer.parseInt(values.get(2));
                        if (cekUsia > 30){
                            tunjanganPegawai = tunjanganPegawai + 1200000;
                            System.out.println("Tunjangan Pegawai             : Rp.1200000,00-");
                        } else if(cekUsia < 0){
                            tunjanganPegawai = 0;
                        }
                        System.out.println("------------------------------------- +");
                        int gajiKotor = gajiPokok + tunjanganPegawai;
                        System.out.println("Gaji Kotor                    : Rp."+ gajiKotor +",00-");
                        int potongan = (int) (gajiKotor * 2.5 / 100);
                        System.out.println("Potongan                      : Rp."+ potongan +",00-");
                        System.out.println("------------------------------------- -");
                        System.out.println("Gaji Bersih                   : Rp."+ (gajiKotor - potongan) +",00-");
                    }
                } 
                }
            }
        } else {
                System.out.println("Bukan Karyawan");
        }
    }
}
