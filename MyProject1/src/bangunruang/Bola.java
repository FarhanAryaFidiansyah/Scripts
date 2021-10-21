/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author jadin
 */
public class Bola {
    // atribut
    public double phi= 3.14;
    public int r;
    
    // methods
    public void hitungVol(){
        double hasil = (double) 4/3 * phi * r * r * r;
        System.out.println("Luas volume bola adalah: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = (double) 4 * phi * r * r;
        System.out.println("Luas selimut bola adalah: " + hasil);
    }
}
