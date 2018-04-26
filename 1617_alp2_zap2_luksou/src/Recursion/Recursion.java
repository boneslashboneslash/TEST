/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;

/**
 *
 * @author lukas.soucek
 */
public class Recursion {
    public static void main(String[] args) {
     
       System.out.println(fib(8));
    }
    
    
  
    public static int fib(int cislo)
    {
          int i=0;
     if(cislo ==1)   
     {
       return 0;  
     }
     else if(cislo ==2)
     {
         return 1;
     }
     else
       // vrácí celk. výsl.
        i = fib(cislo-2)+ fib(cislo-1)+i;
     return i;
    }
}
