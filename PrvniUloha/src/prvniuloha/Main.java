/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prvniuloha;

import java.util.Scanner;






/**
 *
 * @author lukas.soucek
 */
public class Main {
 
    public static Scanner sc = new Scanner(System.in);
    private static FractionCalculator calculate;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     System.out.println("Kalkulator zlomku");
     inputExpression();
     displayResult();
        /* Fraction f1 = new Fraction(24,38); // volání konstruktoru z mainu ;)
     Fraction f2 = new Fraction("5/4");
     System.out.println(f1);
     System.out.println(f2); // lze napsat i bez toString
     Fraction f3 =f1.add(f2);
     System.out.println(f3);
     */
        
     
    }
      private static void inputExpression() {
        System.out.println("Zadej vyraz se 2 zlomky");
        String expression = sc.nextLine();
       calculate = new FractionCalculator(expression);
    }
      private static void  displayResult()
                {
                  String result =calculate.getResult();  
                  System.out.println(result);
                }
}
