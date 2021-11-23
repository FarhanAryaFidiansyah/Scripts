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
public class SilverMembership extends RentalConsole{
    //Atributt
    protected int HargaSewaPerHari, diskon, poin, hargaSewaTotalHari, totalharga, totalDiskon, HargaTotal;
    
    //Methods
    SilverMembership(){
        this.HargaSewaPerHari = 25000;
        this.poin = 1;
        this.diskon = 1;
    }
    
    protected int MenghitungHarga(int totalHari){
        hargaSewaTotalHari = totalHari * HargaSewaPerHari;
        totalDiskon = (hargaSewaTotalHari * diskon) / 100;
        HargaTotal = hargaSewaTotalHari - totalDiskon;
        
        return HargaTotal;
    }
    
    protected int MenghitungPoin(int totalHari){
        int totalPoin = totalHari * poin;
        return totalPoin;
    }
    
}
