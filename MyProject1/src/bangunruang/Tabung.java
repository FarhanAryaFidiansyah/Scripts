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
public class Tabung {
    // atribut
    public double phi= 3.14;
    public int r;
    public int t;
    
    // methods
    public void hitungVol(){
        double hasil = (double) phi * r * r * t;
        System.out.println("Luas volume tabung adalah: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = (double) 2 * phi * r * (r + t);
        System.out.println("Luas selimut tabung adalah: " + hasil);
    }
}
