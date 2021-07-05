/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sueda
 */
public class nSayiOkek extends nSayiObeb {
    public int nSayiOkek(int dizi[]){
    int sonuc = dizi[0];
    for(int i=1;i<dizi.length;i++){
        sonuc = sonuc * dizi[i];
    }    
    int okek = sonuc/nSayiObeb(dizi);
    return okek;
    }
    
}
