/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author jadin
 */
public class Persegi {
    // atribut
    public int sisi;
    
    // methods
    public void hitungLuasA(){
        int hasil = sisi * sisi;
        System.out.println("Luas persegi A adalah: " + hasil);
    }
    
    public void hitungKelilingA(){
        int hasil = 4 * (sisi);
        System.out.println("Keliling persegi A adalah: " + hasil);
    }
    
    public void hitungLuasB(){
        int hasil = sisi * sisi;
        System.out.println("Luas persegi B adalah: " + hasil);
    }
    
    public void hitungKelilingB(){
        int hasil = 4 * (sisi);
        System.out.println("Keliling persegi B adalah: " + hasil);
    }

}
