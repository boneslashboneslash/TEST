/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Files;

import static Files.Soubor.comparing;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lukas.soucek
 */
public class Main {
    private static Scanner sc = new Scanner(System.in);
     public static void main(String[] args) throws IOException  {
        String h = "1:10:10";
   String [] d = h.split(":"); 
   for(int i=0;i<d.length;i++)
   {
       System.out.println(d[i]);
   }
   long vysledek =  Long.parseLong(d[0])*3600+ Long.parseLong(d[1])*60+ Long.parseLong(d[2]);
   System.out.println(vysledek);
        //comparing(sc.next(),sc.next(),sc.next());
          } 
}
