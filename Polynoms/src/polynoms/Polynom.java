/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 mppkpkp
 kpkp
 k
 pkp
 kp
 kp
 k
package polynoms;

import java.util.Arrays;

/**
 *
 * @author lukas.soucek
 */
public class Polynom {
 
    private double [] koeficienty;
    public Polynom(double[] coefreversed) {
        // využilo se zapouzdření daného pole pomocí vytvoření dalšího pole
           this.koeficienty = new double[coefreversed.length];       
        for(int i=0;i<koeficienty.length;i++)
        {
            // musí být this, nutně -> jinak to nejde
        this.koeficienty[i] = coefreversed[koeficienty.length-1-i];
        }
    }
     public Polynom(double a, double b) {
        // využilo se zapouzdření daného pole pomocí vytvoření dalšího pole
                
       this.koeficienty= new double [2];
       this.koeficienty[0] = a;
       this.koeficienty[1] = b;
    }

     public int stupenpolynomu()
     {
         return koeficienty.length-1;
     }
     public double getCoef(int i)
     {
         return koeficienty[i];
     }
     /**
      * 
      * @returns for x**2 + 2 [2,0,1] 
      */
     public double [] getcoef()
     {
         double [] pole = new double [koeficienty.length];
         System.arraycopy(koeficienty, 0, pole , 0, koeficienty.length);
         return pole;
     }
    /**
     *
     * @param coefreversed
     * @return 
     */
     // tovární metoda -> musí být statická, jinak není jiný způsob jak ji zavolat -> např getinstance
    public static Polynom getInstance(double...coefreversed)
     {
      return new Polynom(coefreversed);
        
     }
    

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(int i =koeficienty.length-1;i>=0;i--)
        {
            
            
         builder.append("+");
         builder.append(koeficienty[i]);
         builder.append("x**");
         builder.append(i);
        }
      return builder.toString();
    }
    
    
    
    /**
     * @param args the command line arguments
    
    */
    
    public static void main(String[] args) {
     
    }
    
}
