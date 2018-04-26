/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





/**
 *
 * @author lukas.soucek
 */
public class Soubor {
    private static Scanner sc = new Scanner(System.in);
   
    /**
     *
     * @param s - command
     * @param s1 - name of the first compared file
     * @param s2 - name of the second compared file
     */
    public static void comparing(String s,String s1, String s2) throws IOException
        {
                
       
        
        String sLine;
        List<String>list1 = new ArrayList<>();
        List<String>list2 = new ArrayList<>();
        System.out.println("Porovnávání rozdílu soubor" + s1 + "a" + s2);
           
               FileReader fr = new FileReader(s1);
            BufferedReader br1 = new BufferedReader(fr);
             FileReader fr2 = new FileReader(s2);
            BufferedReader brr = new BufferedReader(fr2);
                   
            
             
           System.out.println("Chyba, Error");
        
       
            while((sLine = br1.readLine()) != null)
            {
                list1.add(sLine);
            }
         
       
            while((sLine = brr.readLine()) != null)
            {
                 list2.add(sLine);
            }
         
        
        List<String> tempList = new ArrayList<>(list1);
        tempList.removeAll(list2);
        if(!tempList.isEmpty())
            {
         System.out.println(s1);
            for (String tempList1 : tempList) {
              
                    System.out.println(tempList1);
                 
            }
        
       
        tempList = list2;
         tempList.removeAll(list1);
         
         System.out.println(s2);
       
            for (String tempList1 : tempList) {
                System.out.println(tempList1);
            }
        }
        else
         
             System.out.println("Nezjisteny zadne rozdily");
         
        }
}
         
         
    

