package polygon;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class PolygonApp {

    private static final Scanner sc = new Scanner(System.in);
    private static Point[] polygonPoints = null;

    /**
     * @param args the command line arguments
     */
    // Point [] mbs = null; mbs = new Point[n] -> staticka pamet (ne static) -> pevna delka pole
    public static void main(String[] args) {
        System.out.println("Vypocet plosnych obrazcu ");
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
                    calculatePerimeter();
                    break;
                case 3:
                    calculateArea();
                    break;
                default:
                    System.out.println("Neplatna volba");
                    ;
            }
        } while (!end);
    }

    private static void displayMenu() {
        System.out.println("");
        System.out.println("Hlavni menu programu");
        System.out.println("1. Zadani bodu n-uhelnika");
        System.out.println("2. Vypocet a vypis obvodu zadaneho n-uhelnika");
        System.out.println("3. Vypocet a vypis plochy zadaneho n-uhelnika");
        System.out.println("0. Konec ");
    }

    private static int readChoice() {
        System.out.print("Zadej cislo zvolene polozky menu: ");
        int number = sc.nextInt();
        sc.nextLine();
        // pripadne osetreni
        return number;
    }

    private static void loadPoints() {
        System.out.println("Zadejte pocet bodu");
        int pocet = sc.nextInt();
        System.out.println("Zadejte souradnice");
        
        for(int i=0;i<pocet;i++)
        {
         polygonPoints[i] = new Point(sc.nextDouble(), sc.nextDouble());
        }
        
        // pouziti statickeho pole - static atribut tridy 
        // dostupny ve vsech static metodach 
        // vytvorit pole 
        // nacitat body, naplnit pole
            }

    private static void calculatePerimeter() {
        // pokud je naplnene pole (zadane body), vypocitat obvod
        if(polygonPoints != null )
        {
            
        double sum = 0;
        for(int i=0;i<polygonPoints.length-1;i++)
        {
            sum +=  polygonPoints[i].getDistance(polygonPoints[i+1]);
        }
        sum += polygonPoints[0].getDistance(polygonPoints[polygonPoints.length-1]);
        System.out.println("Obvod je" + sum);
        }
        else{
            System.out.println("Nezadal jste body, zadejte je !!");
        }
    }
    // podobný jako předchozí metoda ;) dle vzorečku na netu doimplementovat, jestli se ti chce, lemro :D
    private static void calculateArea() {
        // pokud je naplnene pole (zadane body), vypocitat plochu
        throw new UnsupportedOperationException("Not supported yet.");
    }

} 
