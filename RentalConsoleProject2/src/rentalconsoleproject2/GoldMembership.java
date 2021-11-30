/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsoleproject2;

/**
 *
 * @author jadin
 */
public class GoldMembership extends SilverMembership {
    //Atributt
    int cashback;
    
    public void Cashback(int w){
        this.cashback = w;
    }
    
    GoldMembership(){
        HargaSewaPerHari(30000);
        Poin(5);
        Diskon(2);
        Cashback(5000);
    }
    
    public int cashback(){
        return this.cashback;
    }
}
