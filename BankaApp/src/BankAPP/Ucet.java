/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BankAPP;

import java.util.ArrayList;

/**
 *
 * @author lukas.soucek
 */
public class Ucet {
    private int cislouctu;
    private int zustatek;
    ArrayList<Transakce> t;

    public void setCisloUctu(int cislo) {
        this.cislouctu = cislo;
    }

    public Ucet(int cislo, int zustatek) {
        this.cislouctu = cislo;
        this.zustatek = zustatek;
        t = new ArrayList<>();
    }

    public int getZustatek() {
        return zustatek;
    }

    public void setZustatek(int zustatek) {
        this.zustatek = zustatek;
    }
    public void vybrat(int castka)
    {
        t.add(new Transakce(-castka));
        this.zustatek -= castka;
    }
     public void vlozit(int castka)
    {
        t.add(new Transakce(castka));
        this.zustatek += castka;
    }
    //umožnit vybrat částku, pokud nepřesahuje částku na účtu

    public int getCislouctu() {
        return cislouctu;
    }
    
    // umožnit vložit na účet
    
     public static void main(String[] args) {
        Ucet u = new Ucet(1,100);
        u.vlozit(100);
        u.vlozit(200);
    }
    
}
