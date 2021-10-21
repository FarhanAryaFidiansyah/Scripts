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
public class BangunDatarMain {
    public static void main(String[] args) {
        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.panjang = 25;
        persegipanjang.lebar = 38;
        persegipanjang.hitungLuas();
        persegipanjang.hitungKeliling();
        Persegi PersegiA = new Persegi();
        PersegiA.sisi = 10;
        PersegiA.hitungLuasA();
        PersegiA.hitungKelilingA();
        Persegi PersegiB = new Persegi();
        PersegiB.sisi = 15;
        PersegiB.hitungLuasB();
        PersegiB.hitungKelilingB();
        Lingkaran lingkaranX = new Lingkaran();
        lingkaranX.r = 25;
        lingkaranX.hitungLuasX();
        lingkaranX.hitungKelilingX();
        Lingkaran lingkaranY = new Lingkaran();
        lingkaranY.r = 37;
        lingkaranY.hitungLuasY();
        lingkaranY.hitungKelilingY();
    }
}
