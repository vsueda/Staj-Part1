/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sueda
 */
public class Fibonacci {
    public int basamakHesapla(int deger){
         int sayac = 0;
        
        while(deger > 0) {
            deger /= 10; 
            sayac++;
        }
        return sayac;
    }
    public  int basamakDegeri(int sayi){
        int temp;
        temp = sayi%1000000;
        if(basamakHesapla(temp)>6){
            basamakDegeri(temp);
        }
        
            return temp;
        
    }
    public int fibonacciHesapla(){
        int a, b = 1, sonuc = 0;  
  
        for(int i = 0; i<10000; i++){  
        a = b;  
        b = sonuc;      
        sonuc = a + b; 
        if(basamakHesapla(sonuc)>6){          
         sonuc= basamakDegeri(sonuc);
      }
     
}
return sonuc;
    }
}
