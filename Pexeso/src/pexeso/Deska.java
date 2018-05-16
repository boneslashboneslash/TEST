/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pexeso;

/**
 *
 * @author SULO
 */
public class Deska {

    private int[] pole;

    /**
     *
     * @param pocetkaret defines how long will be the array
     */
    public Deska(int pocetkaret) {
        int karta = 0;
        int pocet = 0;
        int[] pole2 = new int[pocetkaret / 2];
        for (int i = 0; i < pocetkaret; i++) {

            do {
                karta = (int) (Math.random() * (pocetkaret / 2));
                for (int j = 0; j < pole2.length; j++) {
                    if (karta == pole2[j]) {
                        pole2[j]++;
                        pocet = pole2[j];
                        j = pole2.length - 1;
                    }

                }
            } while (pocet > 2);

            pole[i] = karta;

        }

    }

    /**
     *
     * @param a -> card which we are choosing to flip
     * @return the number of the card on the current index in the field
     */
    public int getcislokarty(int a)
  {
      return pole[a];
  }
    public void getvynulovani(int k1, int k2)
    {
        pole[k1] = 0;
        pole[k2] = 0;
    }
    /**
     *
     * @return the whole array
     */
    public int[] getpole() {
        return pole;

    }

    /**
     *
     * @return the actual length of the array
     */
    public int getdelkapole() {
        return pole.length;
    }
}
