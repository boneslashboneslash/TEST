/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahovyboj;

import java.util.Scanner;

/**
 *
 * @author SULO
 */
public class main {

    private static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kostka kostka = new Kostka(6);
        System.out.println("Zadejte váš celkový počet hodů kostkou");
        int pocet = sc.nextInt();
        System.out.println("Zadejte počet stěn kostky");
        int pocet2 = sc.nextInt();
        System.out.println("Házeli jsme kostkou s " + pocet2 + " stěnami a padly nám následující čísla:");

        for (int i = 0; i < pocet; i++) {
            System.out.print(kostka.hod(pocet2) + " ");
        }

    }

}
