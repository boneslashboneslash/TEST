package townsconnection;
import java.util.Scanner;

/**
 *
 * @author 
 */
 // bude pole ve kterém bude na indexed čísla určující v jaké skupině jsou jednotlivé uzly
public class TownsConnectionApp {
    private static Scanner sc = new Scanner(System.in);
    private static Connections myNet;
    /**
     * @param args the command line arguments
     */
    // snaha o ošetření v jedné metodě a případné použití v dalších metodách
    public static void main(String[] args) {
        boolean end = false;
        do {
            displayMenu();
            int choice = readChoice();
            switch (choice) {
                case 1: {
                    myNet = new Connections(readTownsCount());
                    System.out.println("Silnicni sit byla vytvorena.");
                    break;
                }
                case 2: {
                    addRoad();
                    break;
                }
                case 3: {
                    isConnectionBetweenTwoTowns();
                    break;
                }
                case 4: {
                    isNetCompletelyConnected();
                    break;
                }
                case 5: {
                    getNumberOfUnconnectedGroups();
                    break;
                }
                case 0: {
                    end = true;
                }
                default: 
                    System.out.println("Neplatna volba.");
            }
        } while (!end);
    }

    private static void displayMenu() {
        System.out.println("");
        System.out.println("Hlavni menu programu");
        System.out.println("1. Nova silnicni sit");
        System.out.println("2. Pridani silnice");
        System.out.println("3. Zjisti dosazitelnost dvou mest");
        System.out.println("4. Zjisti kompletni propojenost mest");
        System.out.println("5. Zjisti pocet navzajem nepropojenych skupin mest");
        System.out.println("0. Konec programu");
    }

    private static int readChoice() {
        System.out.print("Zadej cislo pozadovane polozku menu: ");
        return sc.nextInt();
    }
    
    private static int readTownsCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static void addRoad() {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void isConnectionBetweenTwoTowns() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void isNetCompletelyConnected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void getNumberOfUnconnectedGroups() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}