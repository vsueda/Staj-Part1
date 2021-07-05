/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sueda
 */
public class nSayiObeb extends obebBul{
    public int nSayiObeb (int dizi []){
        int obeb =0;
        for(int i=1;i<dizi.length;i++){
        obeb = obeb(obeb,dizi[i]);
        if(obeb==1){
            return 1;
        }
    }
        return obeb;
    }
}
