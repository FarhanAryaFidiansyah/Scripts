/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsoleproject;

/**
 *
 * @author jadin
 */
public class PlatinumMembership extends GoldMembership {
    //Atributt
    int bonusPulsa;
    
    //Methods
    PlatinumMembership(){
        HargaSewaPerHari = 45000;
        poin = 10;
        diskon = 3;
        cashback = 10000;
    }
    
    protected int bonusPulsa(int totalHari){
        bonusPulsa = totalHari * 5000;
        return bonusPulsa;
    }
}
