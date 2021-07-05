/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sueda
 */
public class HanoiKuleleri {
     int sayac=1;
    public void bilgiYazdir(int n, String platf_1, String platf_2, String platf_3){
        System.out.println(sayac+". hamle: "+n+". disk "+ platf_1+" platformdan "+platf_3+" platforma taşındı.");
        sayac++;
    }
    public void diskYerleşim(int n, String platf_1,
                    String platf_2, String platf_3)
{
    if (n == 1)
    {
        bilgiYazdir(n, platf_1, platf_2, platf_3);
        return;
    }
    else{
        
    
    diskYerleşim(n - 1, platf_1, platf_3, platf_2);
    bilgiYazdir(n, platf_1, platf_2, platf_3);
    }
    
    diskYerleşim(n - 1, platf_2, platf_1, platf_3);
}
 public static void  main(String args[])
{
   
    HanoiKuleleri hanoi = new HanoiKuleleri();
    hanoi.diskYerleşim(4, "ilk", "orta", "son");
    
}
}
