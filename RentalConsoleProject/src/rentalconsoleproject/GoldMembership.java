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
public class GoldMembership extends SilverMembership {
    //Atributt
    int cashback;
    
    //Methods
    GoldMembership(){
        HargaSewaPerHari = 30000;
        poin = 5;
        diskon = 2;
        cashback = 5000;
    }
    
    
}
