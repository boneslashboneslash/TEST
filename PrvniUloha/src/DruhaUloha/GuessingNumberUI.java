/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DruhaUloha;

import java.util.Scanner;


/**
 *
 * @author lukas.soucek
 */
public class GuessingNumberUI {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        playerGuesses();
    }
    
    private static void playerGuesses() {
    System.out.println("Zadej rozsah cisel");
    GuessingNumber gn = new GuessingNumber(sc.nextInt(), sc.nextInt());
    System.out.println("Myslim si cislo v rozsahu " + gn.getMin()+ " az " + gn.getMax() + ".");
        
          do {
              System.out.println("Hadej cislo, ktere si myslim");
             int result = gn.evaluate(sc.nextInt());
             if(result ==0)
             {
                 System.out.println("Uhadl jsi.");
             }
             else if (result ==1){
                 System.out.println("Cislo, ktere si myslim, je vetsi");
             }
             else
             {
                 System.out.println("Cislo, ktere si myslim, je mensi");
             }
                 }
          while(!gn.isEndGame());
          
          System.out.println("Bylo to na "+ gn.getCount() + " . pokus.");
}
}
