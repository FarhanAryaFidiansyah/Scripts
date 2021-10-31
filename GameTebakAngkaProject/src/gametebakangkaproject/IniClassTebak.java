/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
/**
 *
 * @author jadin
 */
public class IniClassTebak {
    //Attributs
    int tebakan; 
    int random = ThreadLocalRandom.current().nextInt(0, 100 + 1);
    
    //Methods
    void tebakAngka(){
        System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
        Scanner number = new Scanner(System.in);
        
        //Tebak
        do {
            System.out.print("Masukkan Tebakan Anda : ");
            tebakan = number.nextInt();
 
            //if else jika tebakan salah atau benar
            if (tebakan > random) {
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
            } else if (tebakan < random) {
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
            } else {
                System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
            }
        } while (tebakan != random);
    }
}
