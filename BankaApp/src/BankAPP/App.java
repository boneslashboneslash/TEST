/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAPP;

import java.util.ArrayList;

/**
 *
 * @author SULO
 */
public class App {
    
    }
    public String vypocetbilance(int cislouctu)
    {
        int vydaje = 0;
        int prijmy = 0;
       for(int i=0;i<ucty.size();i++)
         {
             if(ucty.get(i).getCislouctu() == cislouctu)
             {
                 for (int j=0;j<ucty.get(i).t.size();j++) {
                     if(ucty.get(i).t.get(j).getCastka() <0)
                     {
                         vydaje += ucty.get(i).t.get(j).getCastka();
                     }
                     else
                     { 
                         prijmy += ucty.get(i).t.get(j).getCastka();
                     }
                 }
                 return ("Zůstatek: " + Integer.toString(ucty.get(i).getZustatek()) + " Souhrn příjmů: " + prijmy + " Souhrn výdajů: " + vydaje);
                //return ucty.get(i).getZustatek();
             }
         }
       throw new IllegalArgumentException("Neexistuje cislo uctu");
        
    }
     public int zustatekzuctu(int cislouctu)
     {
         for(int i=0;i<ucty.size();i++)
         {
             if(ucty.get(i).getCislouctu() == cislouctu)
             {
                return ucty.get(i).getZustatek();
             }
         }
         throw new IllegalArgumentException("Neexistuje cislo uctu");
     // return ucty.get(cislouctu).getZustatek();
     }
     public int datumprijmu()
     {
        //
         return 0;
     }
     public static void main(String[] args) {
        Ucet u = new Ucet(50,500);
        Ucet u2 = new Ucet(51,500);
        u.vlozit(200);
        u.vybrat(300);
        u2.vybrat(400);
        u2.vlozit(100);
        App p = new App();
        p.pridatUcet(u);
        p.pridatUcet(u2);
        
        System.out.println(p.zustatekzuctu(51));
        System.out.println(p.vypocetbilance(51));
                }
    
}
