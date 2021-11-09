/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author jadin
 */
public class Rerata {
    // array of integer -> data
    int[] dataBil = new int[100];
    
    // jumlah data
    int n;
    
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya data (n): ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Masukkan bil ke-"+(i+1)+"; ");
            this.dataBil[i] = input.nextInt();
        }
    }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    int cariMax(int[] data) {
        int cariMax = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > cariMax) {
                cariMax = data[i];
            }
        }
        return cariMax;
    }
    
    int cariMin(int[] data) {
        int cariMin = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < cariMin) {
                cariMin = data[i];
            }
        }
        return cariMin;
    }
    
    int[] urutkan(int[] data) {
        int n = data.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (data[j] > data[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
        return data;
    } 
    
    void output(){
        System.out.println("Rerata: " + this.hitungRerata(this.dataBil));
        System.out.println("Nilai Maksimum: " + this.cariMax(this.dataBil));
        System.out.println("Nilai Minimum: " + this.cariMin(this.dataBil));
        System.out.println("Urutkan: " + this.urutkan(this.dataBil));
    }
    
    
}
