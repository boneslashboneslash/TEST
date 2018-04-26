/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gomoku;


public class Deska {

	private int sirka, vyska;
	private int[][] misto;
  // vytvoreni desky pro hru
	Deska(int sirka, int vyska) {

		this.sirka = sirka;
		this.vyska = vyska;

		misto = new int[sirka][vyska];

		for (int i = 0; i < sirka; i++) {
			for (int z = 0; z < vyska; z++) {
				misto[i][z] = 0;
			}
		}
	}
  
	public int tahnout(int hrac, int x, int y) {
		try {
			if (misto[x][y] != 0) {
				return 0;
			} else {
				misto[x][y] = hrac;
				return 1;
			}
		} catch (Exception  e) {
			return 0;
		}

	}

	// kontrola výhry ...
	public int kontrolaVyhry() {
		
		return 0;
	}
    // dostane aktualni situaci na desce
	public int[][] zjistitmisto() {
		return misto;
	}

	public void vypisTabulky() {
		int i, j;

		// vypis prvniho rozmeru 
		for (i = 0; i < sirka + 2; i++) {
			if (i > 0 && i < 20)
				System.out.printf(" %d ", (i - 1) % 10);
			else
				System.out.printf(" # ");
		}
		System.out.printf("\n");
                    
                // vypis druheho rozmeru
		for (i = 0; i < vyska; i++) {
			for (j = 0; j < sirka; j++) {
				if (j == 0) {
					System.out.printf(" %d ", i % 10);
				}
				if (misto[j][i] == 0) {
					System.out.printf("  ");
				} else {
					System.out.printf(" %d ", misto[j][i]);
				}

				if (j == sirka - 1) {
					System.out.printf(" %d\n", i % 10);
				}
			}
		}

		for (i = 0; i < sirka + 2; i++) {
			if (i > 0 && i < 20)
				System.out.printf(" %d ", (i - 1) % 10);
			else
				System.out.printf(" # ");
		}
		System.out.printf("\n");

	}
}