/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operace;

/**
 *
 * @author SULO
 */
public class Operace {
    private int cislo1, cislo2;

    public Operace(int cislo1, int cislo2) {
        this.cislo1 = cislo1;
        this.cislo2 = cislo2;
    }
     public void secist(int a, int b){
       System.out.println(a+b);
   }
    public void odecist(int a, int b){
       System.out.println(a-b);
   }
    public void nasobit(int a, int b){
       System.out.println(a*b);
   }
    public void delit(int a, int b){
       System.out.println(a/b);
   }
    
}
