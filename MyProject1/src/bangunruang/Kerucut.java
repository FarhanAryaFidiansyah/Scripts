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
public class Kerucut {
    // atribut
    public double phi= 3.14;
    public int r;
    public int t;
    public int s;
    
    // methods
    public void hitungVol(){
        double hasil = (double) 1/3 * phi * r * r * t;
        System.out.println("Luas volume kerucut adalah: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = phi * r * s;
        System.out.println("Luas selimut kerucut adalah: " + hasil);
    }
}
