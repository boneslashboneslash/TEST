package simplemath;
import java.util.Scanner;

/**
 *
 * @author lukas.soucek
 */
public class SimpleMath {

    private static final Scanner sc = new Scanner(System.in);
    private static int pocet = 5;
    private static int maxHodnotaVyrazu = 10;
    private static String typPrikladu = "+";
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Testicek UI ");
        boolean konecProgramu = false;
        do {
            vypisMenu();
            int volba = nactiVolbu();
            switch (volba) {
                case 0:
                    konecProgramu = true;
                    break;
                case 1:
                    test();
                    break;
                case 2:
                    nastaveni();
                    break;
                default:
                    System.out.println("Neplatna volba");
                    ;
            }
        } while (!konecProgramu);
    }

    private static void vypisMenu() {
        System.out.println("");
        System.out.println("Hlavni menu programu");
        System.out.println("1. Spustit testovani znalosti jednoduche aritmetiky");
        System.out.println("2. Nastaveni programu");
        System.out.println("0. Konec ");
    }

    private static int nactiVolbu() {
        System.out.print("Zadej cislo ");
        int cislo = sc.nextInt();
        sc.nextLine();
        // pripadne osetreni
        return cislo;
    }

    private static void test() {
                 
        SimpleMathExamTest test;
        //vytvoreni instance 
        test = new SimpleMathExamTest(maxHodnotaVyrazu, typPrikladu);
        boolean dalsiTest = true;
        while (dalsiTest) {
            
            System.out.println("");
            System.out.println("Probiha novy test");
            System.out.println("Zadavej odpovedi");
            for (int i = 0; i < pocet; i++) {
               
            }
            System.out.println("Konec testu ");
            System.out.println("Pocet prikladu: " + pocet);
            System.out.println("Pocet spravnych odpovedi: ");
            System.out.println("Uspesnost (%): " + test.getScore());
            System.out.println("Trvalo ti to: " + test.getTestDurationSec());
            System.out.println("");
            char volba;
            do {
                System.out.print("Prejes si dalsi test (a/n)?: ");
                volba = Character.toUpperCase(sc.nextLine().trim().charAt(0));
            } while (volba != 'A' && volba != 'N');
            dalsiTest = volba == 'A';
        }
    }

    private static void nastaveni() {
        System.out.println("");
        System.out.println("Pocet prikladu jednoho testu je: " + pocet);
        System.out.print("Zadej novou hodnotu: ");
        pocet = sc.nextInt();
        sc.nextLine();
        System.out.println("Maximalni hodnota ve vyrazech bude: " + maxHodnotaVyrazu);
        System.out.print("Zadej novou hodnotu: ");
        maxHodnotaVyrazu = sc.nextInt();
        sc.nextLine();
        System.out.println("Typ prikladu v testu: " + ((typPrikladu.length() == 0) ? "+-" : typPrikladu));
        System.out.print("Zadej novou hodnotu (+ - nebo pouze ENTER pro mix prikladu): ");
        typPrikladu = sc.nextLine();
    }
}