package points;

import java.util.ArrayList;
import java.util.Scanner;
import polygon.Point;

/**
 *
 * @author 
 */
public class Points {

    private static final Scanner sc = new Scanner(System.in);
    private static ArrayList<Point> points = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zpracovani sady bodu ");
        boolean end = false;
        do {
            displayMenu();
            int choice = readChoice();
            switch (choice) {
                case 0:
                    end = true;
                    break;
                case 1:
                    loadPoints();
                    break;
                case 2:
                    addPoint();
                    break;
                case 3:
                    break;
                case 4:
                    getNearest();
                    break;
                case 5:
                    getFurthermostTo();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Neplatna volba");
            }
        } while (!end);
    }

    private static void displayMenu() {
        System.out.println("");
        System.out.println("Hlavni menu programu");
        System.out.println("1. Zadani sady bodu");
        System.out.println("2. Pridat dalsi bod");
        System.out.println("3. Vypsat bod s maximalni vzdalenosti od pocatku");
        System.out.println("4. Vypsat bod s minimalni vzdalenosti od pocatku");
        System.out.println("5. Vypsat bod s maximalni vzdalenosti od jineho zadaneho bodu");
        System.out.println("6. Vypsat bod s minimalni vzdalenosti od jineho zadaneho bodu");
        System.out.println("7. Vypsat dva body s maximalni vzajemnou vzdalenosti");
        System.out.println("8. Vypsat dva body s minimalni vzajemnou vzdalenosti");
        System.out.println("0. Konec ");
    }

    private static int readChoice() {
        System.out.print("Zadej cislo zvolene polozky menu: ");
        int cislo = sc.nextInt();
        sc.nextLine();
        // pripadne osetreni
        return cislo;
    }
     // bacha je tu dynamicka delka arraylistu size, která se mění dle počtu položek uvnitř ;)
    private static void loadPoints() {
        System.out.println("Zadej pocet bodu");
        int count = sc.nextInt();
        System.out.println("Zadej souradnice bodu:");
        points = new ArrayList();
        for(int i=0;i<count;i++)
        {
           points.add(new Point(sc.nextDouble(),sc.nextDouble()));
        }
                  
                   
        
        // pouziti dynamickeho pole / static atribut tridy  
        // dostupny ve vsech static metodach 
        // vytvorit novou instanci ArrayList 
        // nacitat vice bodu, pridat do pole
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void addPoint() {
        System.out.println("Zadej souřadnice bodů");
        if(points != null)
        {
           points.add(new Point(sc.nextDouble(),sc.nextDouble()));
        }
        else
        {
            points = new ArrayList();
        }
                  
        // pridat dalsi jeden bod do existujiciho pole 
        // pokud neexistuje, je treba vytvorit a pridat
        throw new UnsupportedOperationException("Not supported yet.");
    }
   // toto implementovat nutně
    private static void getNearest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 // rychle implementuj to, vole :D, kokos
    private static void getFurthermostTo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}