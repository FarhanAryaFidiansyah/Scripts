/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import mypackage.MyNewClass;

/**
 *
 * @author jadin
 */
public class MyClass {
    public static void main(String[] args) {
        OperasiBilangan Project1 = new OperasiBilangan();
        Project1.bilPertama = 100;
        Project1.bilKedua = 150;
        Project1.hitungPenjumlahan();
        Project1.hitungPengurangan();
        Project1.hitungPerkalian();
        Project1.hitungPembagian();
    }
}
