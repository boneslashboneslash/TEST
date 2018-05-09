/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pexeso;

public class Pexeso {

    private Hrac aktivni;
    private Deska deska;
    private Hrac[] hraci;

    /**
     *
     * @return integer representing who is the winner by number
     */
    public int jevitez() {
        int max = 0;
        int hracvitez = 0;
        for (Hrac hrac : hraci) {
            if (max < hrac.getskore()) {
                max = hrac.getskore();
                hracvitez = hrac.getId();
            }
        }

        return hracvitez;

    }

    /**
     *
     * @param pocet set the new length of the board
     */
    public void setdeska(int pocet) {
        deska = new Deska(pocet);
    }

    /**
     *
     * @return gets the right amount of the cards on the board
     */
    public int[] getpocetkaret() {
        return deska.getpole();
    }

    /**
     *
     * @param k1 first card selected by the player
     * @param k2 second card selected by the player
     * @return true if the player found two same cards, otherwise false
     */
    public boolean otocitkartu(int k1, int k2) {
        if (k1 > deska.getdelkapole() || k2 > deska.getdelkapole() || k1 < 0 || k2 < 0) {
            System.out.println("Zadejte spravné místo pole");
        } else if (deska.getcislokarty(k1) == deska.getcislokarty(k2)) {

            aktivni.zvysitscore();
            deska.getvynulovani(k1, k2);
            return true;
        } else {
            aktivni.setaktivni();

        }
        return false;
    }

    public int getskorevyhra(int id) {
        return hraci[id].getskore();
    }

    public boolean jekonec() {
        int score = 0;
        for (Hrac hrac : hraci) {
            score = +hrac.getskore();
        }
        if (score == deska.getdelkapole() / 2) {
            return true;
        } else {
            return false;
        }

    }
}
