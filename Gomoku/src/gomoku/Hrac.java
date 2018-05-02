/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gomoku;

import java.util.Scanner;

public class Hrac {

	private Main.PLAYER id;
	private int cisloHrace;

	public Hrac (int cisloHrace)
	{
		this.cisloHrace = cisloHrace;
	}

    /**
     *
     * @param id
     */
        // nastaveni identifikace uzivatele
    public void nastaveniID(Main.PLAYER id)
	{
		this.id = id;
	}
           // zahrani tahu
	public int [] ziskatTah(int[][] misto){
		int[] zahratTah = new int[2];

		if (id == Main.PLAYER.HUMAN)
			zahratTah = tahCloveka(misto,cisloHrace);
		else if (id == Main.PLAYER.UMELA_INTELIGENCE)
			zahratTah = hrajeAI(misto);
		

		return zahratTah;
	}
            // moznost pro hrani piskvorek lidskou bytosti
	public int[] tahCloveka(int[][] misto,int cisloHrace)
	{
		int[] zahratTah = new int[2];
		Scanner sc = new Scanner(System.in);

		System.out.printf("(Hrac %d)  Zvol svuj tah (od 0 do %d)\n",cisloHrace,
				18);
		System.out.printf("souradnice x: ");
		zahratTah[0] = sc.nextInt();
		System.out.printf("souradnice y: ");
		zahratTah[1] = sc.nextInt();
		return zahratTah;
	}




   // moznost pro hrani umele inteligence
    public int[] hrajeAI(int store[][]) {
        int[] zahraniTahu = new int[2];
        for (int w = 0; w <= 18; w++) {
            for (int h = 0; h <= 18; h++) {
                if (store[w][h] == 1) {
                    if (w != 0 && h != 0 && w != 18 && h != 18) {
                        if (store[w - 1][h - 1] == 0) {
                            zahraniTahu[0] = w - 1;
                            zahraniTahu[1] = h - 1;
                            return zahraniTahu;
                        }
                        if (store[w + 1][h + 1] == 0) {
                            zahraniTahu[0] = w + 1;
                            zahraniTahu[1] = h + 1;
                            return zahraniTahu;
                        }
                        if (store[w + 1][h - 1] == 0) {
                            zahraniTahu[0] = w + 1;
                            zahraniTahu[1] = h - 1;
                        }
                        if (store[w - 1][h + 1] == 0) {
                            zahraniTahu[0] = w - 1;
                            zahraniTahu[1] = h + 1;
                        }
                        if (store[w][h - 1] == 0) {
                            zahraniTahu[0] = w;
                            zahraniTahu[1] = h - 1;
                            return zahraniTahu;
                        }
                        if (store[w][h + 1] == 0) {
                            zahraniTahu[0] = w;
                            zahraniTahu[1] = h + 1;
                            return zahraniTahu;
                        }
                        if (store[w - 1][h] == 0) {
                            zahraniTahu[0] = w - 1;
                            zahraniTahu[1] = h;
                            return zahraniTahu;
                        }
                        if (store[w + 1][h] == 0) {
                            zahraniTahu[0] = w + 1;
                            zahraniTahu[1] = h;
                            return zahraniTahu;
                        }
                    }
                }
            }
        }

        //snaha o hrani veprostred
        zahraniTahu[0] = 6 + (int) (Math.random() * 5);
        zahraniTahu[1] = 6 + (int) (Math.random() * 5);
        return zahraniTahu;
    }
}