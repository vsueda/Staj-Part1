/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sueda
 */
public class VezirProblemi {
    public int [] [] diziOlustur(int dizi [] []){
        
        for(int i=0; i<8;i++){
            for(int j=0; j<8; j++){
                dizi [i] [j] = 0;
            }
        }
        
        return dizi;
    }
    public void diziYazdir(int dizi[] []){
        for(int i=0; i<8;i++){
            for(int j=0; j<8; j++){
                if(j==0){
                    System.out.print("\n"+dizi [i] [j]+" ");
                }
                else{
                System.out.print(dizi [i] [j]+" ");    
                }               
            }
        }
    }
    public void vezirYerlestir(int [][] dizi){
        
    }
     public int [][] sayiC1(int dizi[] [], int i, int j){
         int a =i,b=j;
         while(a>0&&b<7){
             dizi[a-1][b+1]+=1;           
             a--;
             b++;
         }
         return dizi;
     }
     public int [][] sayiC2(int dizi[] [], int i, int j){
         int a =i,b=j;
         while(a<7&&b>0){
            
             dizi[a+1][b-1]+=1;
             a++;
             b--;
         }
         return dizi;
     }
     public int [][] gerisayiC1(int dizi[] [], int i, int j){
         int a =i,b=j;
         while(a>0&&b<7){
             dizi[a-1][b+1]-=1;
             a--;
             b++;
         }
         return dizi;
     }
       public int [][] gerisayiC2(int dizi[] [], int i, int j){
         int a =i,b=j;
         while(a<7&&b>0){
             
             dizi[a+1][b-1]-=1;
             a++;
             b--;
         }
         return dizi;
     }
    public int [][] sayiArttir(int dizi[] [], int i, int j){
        
        
        for(int h=i+1;h<8;h++){
            dizi[h][j]+=1;         
        }
        for(int h=j+1;h<8;h++){
            dizi[i][h]+=1;
        }
        int a=i+1,b=j+1;       
        while(a<8&& b<8){
        dizi[a][b]+=1;      
        a++;
        b++;        
    }
        
     return dizi;
    }
     public int [][] sayiAzalt(int dizi[] [], int i, int j){
         
        for(int h=i-1;h>=0;h--){
            dizi[h][j]+=1;
        }
        for(int h=j-1;h>=0;h--){
            dizi[i][h]+=1;
        }
        int a=i-1,b=j-1;
        while(a>=0&& b>=0){
        dizi[a][b]+=1;       
        a--;
        b--;       
    }
       
       return dizi;
    }
     public int [][] gerisayiArttir(int dizi[] [], int i, int j){
        
         for(int h=i+1;h<8;h++){
            dizi[h][j]-=1;
        }
        for(int h=j+1;h<8;h++){
            dizi[i][h]-=1;
        }
        int a=i+1,b=j+1;
        while(a<8&& b<8){
        dizi[a][b]-=1;         
        a++;
        b++;     
    }
    return dizi;
    }
     public int [][] gerisayiAzalt(int dizi[] [], int i, int j){
                   
        for(int h=i-1;h>=0;h--){
            dizi[h][j]-=1;
        }
        for(int h=j-1;h>=0;h--){
            dizi[i][h]-=1;
        }
        int a=i-1,b=j-1;
        while(a>=0&& b>=0){
        dizi[a][b]-=1;
         
        a--;
        b--;
    }
       return dizi;
    }
    public boolean vezirKontrol(int [] [] dizi, int i, int s){   
               
            if(i ==8){
                
                return true;
            }
        
            for(int j=s;j<8;j++){
                
              if(dizi[i][j]==0){
                  dizi[i][j]=8;        
                  sayiC1(dizi, i, j);
                  sayiC2(dizi, i, j);
                  sayiArttir(dizi, i, j);
                  sayiAzalt(dizi, i, j);
                  
                  if(!vezirKontrol(dizi, i+1, 0)){
                      dizi[i][j]=0;
                      gerisayiArttir(dizi, i, j);
                      gerisayiAzalt(dizi, i, j);
                      gerisayiC1(dizi, i, j);
                      gerisayiC2(dizi, i, j);               
                  }
                  else{ 
                      return true;
                  }
                }
              if(j==7){                      
                     return false;
              }
              
            }  
            return true;
    }
        
    
    
    public static void main(String[] args) {
        VezirProblemi d = new VezirProblemi();
        int [] [] dizi= new int [8][8];
        dizi = d.diziOlustur(dizi);
        System.out.println("Örnek çözümlerde vezirler 8 olarak gösterilmektedir.");
       
        for(int j=0;j<8;j++){
            
        
           if( d.vezirKontrol(dizi, 0, j)){
               System.out.println("\n");
               for(int i=0;i<8;i++){
                   for(int s=0;s<8;s++){
                   if(dizi[i][s]!=8){
                       dizi[i][s]=0;
                   }    
                   
                   }
                   
               }
               d.diziYazdir(dizi);
               d.diziOlustur(dizi);
            
               
           }
           else{
               d.diziOlustur(dizi);
           }
        }  
    }
}
