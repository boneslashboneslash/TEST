/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoleBoduUloha;

import java.util.Scanner;

/**
 *
 * @author SULO
 */
public class PoleBodu {

    private static Scanner sc = new Scanner(System.in);
    private Bod[] b;
    public int pocet;
    private int index = 0;

    public PoleBodu(int pocet) {
        this.pocet = pocet;
        this.b = new Bod[pocet];
    }

    /**
     *
     * @return
     */
    public Bod minvzdpoc() {
        Bod tento = b[0];
        for (Bod b1 : b) {
            if (tento.getvzdnula() > b1.getvzdnula()) {
                tento = b1;
            }
        }
        return tento;
    }  public Bod maxvzdpoc() {
        Bod tento = b[0];
        for (Bod b1 : b) {
            if (tento.getvzdnula() < b1.getvzdnula()) {
                tento = b1;
            }
        }
        return tento;
    }
    /**
     *
     * @return
     */
    public Bod[] minvzdBod() {
        Bod[] polko = new Bod[2];
        polko[0] = b[0];
        polko[1] = b[1];
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (polko[0].getvzd(polko[1]) > b[i].getvzd(b[j])) {
                    polko[0] = b[i];
                    polko[1] = b[j];
                }
            }
        }
        return polko;

    }
     public Bod[] maxvzdBod() {
        Bod[] polko = new Bod[2];
        polko[0] = b[0];
        polko[1] = b[1];
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (polko[0].getvzd(polko[1]) < b[i].getvzd(b[j])) {
                    polko[0] = b[i];
                    polko[1] = b[j];
                }
            }
        }
        return polko;

    }


    public void pridatBod(int x, int y) {
        Bod c = new Bod(x, y);
        //this.b = new Bod
        b[index] = c;
        index++;    
    }

}
/**
 *
 * @param args
 */
