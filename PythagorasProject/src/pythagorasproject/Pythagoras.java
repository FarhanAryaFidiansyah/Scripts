/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;
import java.util.Scanner;

/**
 *
 * @author jadin
 */
public class Pythagoras {
    //Attributs
    int pilih;
    int a;
    int b;
    int c;
    
    //Methods
    void pythagoras(){
        Scanner input = new Scanner(System.in);
        System.out.println("Pilihan Menu :\n1. Cek Triple Pythagoras\n2. Menentukan sisi miring segitiga\n3. Menentukan sisi siku-siku segitiga\n4. Exit");
        while (true) {
            System.out.print("Masukkan Pilihan :");
            pilih = input.nextInt();
            if (pilih == (int)1) {
                System.out.print("Masukkan nilai sisi A :");
                a = input.nextInt();
                System.out.print("Masukkan nilai sisi B :");
                b = input.nextInt();
                System.out.print("Masukkan nilai sisi C :");
                c = input.nextInt();
                if (a*a + b*b == c*c){
                    System.out.println("Triple Pythagoras");
                } else{
                    System.out.println("Bukan Triple Pythagoras");
                }
            } else if (pilih == (int)2){
                System.out.print("Masukkan nilai sisi A :");
                a = input.nextInt();
                System.out.print("Masukkan nilai sisi B :");
                b = input.nextInt();
                double sisiMiring = Math.sqrt(a*a + b*b);
                System.out.println("Sisi miring : " + sisiMiring);
            } else if (pilih == (int)3){
                System.out.print("Masukkan nilai sisi A :");
                a = input.nextInt();
                System.out.print("Masukkan nilai sisi C :");
                c = input.nextInt();
                double sisiSiku = Math.sqrt(c*c - a*a);
                System.out.println("Sisi miring : " + sisiSiku);
            } else if (pilih == (int)4){
                System.out.println("Keluar dari program...");
                System.exit(0);
            }
        }
    }  
}
