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
public class SilverMembership {
     //Atributt
    protected int HargaSewaPerHari, diskon, poin, hargaSewaTotalHari, totalharga, totalDiskon, HargaTotal;
    
    public void HargaSewaPerHari(int x){
        this.HargaSewaPerHari = x;
    }
    
    public void Poin(int y){
        this.poin = y;
    }
    
    public void Diskon(int z){
        this.diskon = z;
    }

    SilverMembership(){
        HargaSewaPerHari(25000);
        Poin(1);
        Diskon(1);
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
