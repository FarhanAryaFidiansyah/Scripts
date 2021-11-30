/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsoleprojectnew;

/**
 *
 * @author jadin
 */
public class PlatinumMembership extends GoldMembership{
    //Atributt
    int bonusPulsa;
    
    //Methods
    PlatinumMembership(){
        HargaSewaPerHari(45000);
        Poin(10);
        Diskon(3);
        Cashback(10000);
    }
    
    protected int bonusPulsa(int totalHari){
        bonusPulsa = totalHari * 5000;
        return bonusPulsa;
    }
}
