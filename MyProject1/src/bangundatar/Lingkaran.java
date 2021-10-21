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
public class Lingkaran {
    // atribut
    public double phi= 3.14;
    public int r;
    
    // methods
    public void hitungLuasX(){
        double hasil = (double) phi * r * r;
        System.out.println("Luas lingkaran X adalah: " + hasil);
    }
    
    public void hitungKelilingX(){
        double hasil = (double) 2 * phi * r;
        System.out.println("Keliling lingkaran X adalah: " + hasil);
    }
    
    public void hitungLuasY(){
        double hasil = (double) phi * r * r;
        System.out.println("Luas lingkaran Y adalah: " + hasil);
    }
    
    public void hitungKelilingY(){
        double hasil = (double) 2 * phi * r;
        System.out.println("Keliling lingkaran Y adalah: " + hasil);
    }
  
}
