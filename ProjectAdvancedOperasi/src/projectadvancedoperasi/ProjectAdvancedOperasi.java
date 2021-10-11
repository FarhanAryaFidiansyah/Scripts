/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author jadin
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operasi A = new Operasi();
        System.out.println("Hasil : " + A.jumlahkan(3, 4));
        System.out.println("Hasil : " + A.jumlahkan(4, 7, -9));
        System.out.println("Hasil : " + A.jumlahkan(3.4, -0.002, 0.12313));
    }
}
