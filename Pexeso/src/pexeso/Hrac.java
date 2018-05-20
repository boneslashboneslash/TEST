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
public class Hrac {

    private int pocet = 0;
    private int id;
    private int skore;

    public Hrac() {
        skore = 0;
        id = 0;
    }

    /**
     *
     * @return id of current player
     */
    public int getId() {
        return id;
    }

    /**
     * sets currently active player on the board
     */
    public void setaktivni()
    {
        for (int i = id ; i < pocet; i++) {
            if(id != pocet-1)
            {
                id++;
            }
            else
            {
                id=0;
            }
        }
    }
    /**
     *
     * @return amount of playing players
     */
    public int getpocethracu() {
        return pocet;
    }

    /**
     *
     * @return actual amount of score
     */
    public int getskore() {
        return skore;
    }

    /**
     *
     * @return score raised by one
     */
    public int zvysitscore() {
        return skore++;
    }

    @Override
        public String toString() {
        return "Hrac{" + "id=" + id + ", má skóre" + skore + '}';
    }

}
