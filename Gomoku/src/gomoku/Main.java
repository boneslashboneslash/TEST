/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gomoku;

import java.util.Scanner;


public class Main {

	public enum PLAYER {
		HUMAN, UMELA_INTELIGENCE;
	}

	private static void hlavniMenu() {
		System.out.println("1. Clovek");
		System.out.println("2. Pocitac");
		
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
     	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PLAYER p1 = PLAYER.HUMAN;
		PLAYER p2 = PLAYER.HUMAN;
		int volba;

		System.out.println("Hra Gomoku verze 1.0");
		System.out.println("Výběr prvního hráče");
		hlavniMenu();
		volba = sc.nextInt();
		if (volba == 2)
			p1 = PLAYER.UMELA_INTELIGENCE;
		

		System.out.println("Výběr druhého hráče");
		hlavniMenu();
		volba = sc.nextInt();
		if (volba == 2)
			p2 = PLAYER.UMELA_INTELIGENCE;
		

		hratHru(p1, p2);
		System.out.println("Děkuji za hru");
	}
      // vytvoreni hracu a priprava desky pro hrani hry
	private static void hratHru(PLAYER p1, PLAYER p2) {
		int sirka = 19;
		int vyska = 19;
		Deska hraciDeska = new Deska(sirka, vyska);
		int vyhra = 0;
		int spravnyTah = 0;
		int[] move = new int[2];

		Hrac hrac1 = new Hrac(1);
		Hrac hrac2 = new Hrac(2);

		//  nastaveni hrace cislo jedna
		if (p1 == PLAYER.UMELA_INTELIGENCE) {
			hrac1.nastaveniID(PLAYER.UMELA_INTELIGENCE);
		} else if (p1 == PLAYER.HUMAN) {
			hrac1.nastaveniID(PLAYER.HUMAN);
		} 

		//  nastaveni hrace cislo dva
		if (p2 == PLAYER.UMELA_INTELIGENCE) {
			hrac2.nastaveniID(PLAYER.UMELA_INTELIGENCE);
		} else if (p2 == PLAYER.HUMAN) {
			hrac2.nastaveniID(PLAYER.HUMAN);
		} 
		while (true) {
			// tah hráče číslo 1
			hraciDeska.vypisTabulky();
			while (spravnyTah != 1) {
				move = hrac1.ziskatTah(hraciDeska.zjistitmisto());
				spravnyTah = hraciDeska.tahnout(1, move[0], move[1]);
			}
			spravnyTah = 0;

			// kontrola výhry
			vyhra = hraciDeska.kontrolaVyhry();
			if (vyhra == 1) {
				hraciDeska.vypisTabulky();
				System.out.println("Hrac 1 vyhral");
				break;
			}

			// tah hráče číslo 2
			hraciDeska.vypisTabulky();
			while (spravnyTah != 1) {
				move = hrac2.ziskatTah(hraciDeska.zjistitmisto());
				spravnyTah = hraciDeska.tahnout(2, move[0], move[1]);
			}
			spravnyTah = 0;

			// kontrola výhry
			vyhra = hraciDeska.kontrolaVyhry();
			if (vyhra == 2) {
				hraciDeska.vypisTabulky();
				System.out.println("Hrac 2 vyhral");
				break;
			}
		}

	}
}