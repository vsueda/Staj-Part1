/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sueda
 */
public class obebBul {
    public int obeb (int s1, int s2){
        if(s1==0){
            return s2;
        }
        else{
            return obeb(s2%s1, s1);
        }
    }
}
