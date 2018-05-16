
import java.util.Scanner;
import operace.Operace;



kokoko
kok
kko
k

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SULO
 */
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Napiste dve cisla, potvrdte Enter a zvolte co s nima");
        int a =sc.nextInt();int b = sc.nextInt();
        Operace udelat = new Operace(a, b);
        hlavniMenu();
        
         int choice;
          choice = sc.nextInt();
        switch (choice) {
            case 1:
               udelat.secist(a, b);
                break;
            case 2:                
                udelat.odecist(a, b);
                break;
            case 3:
                udelat.nasobit(a, b);
                break;
            case 4:
                udelat.delit(a, b);
                break;
            default: hlavniMenu();
                break;
        }
    }
    public static void hlavniMenu()
    {
        System.out.println("1. secist 2 cisla");
        System.out.println("2. odecist 2 cisla");
        System.out.println("3. vynasobit 2 cisla");
        System.out.println("4. vydelit 2 cisla");
          
           
    }
    
}
