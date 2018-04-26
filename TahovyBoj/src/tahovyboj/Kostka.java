/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tahovyboj;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author SULO
 */
public class Kostka {
    private int pocetsten;

    @Override
    public String toString() {
        return "Kostka{" + "má celkem=" + pocetsten + "stěn" + '}';
    }
    private Random random;
   private static Scanner sc = new Scanner(System.in);
    public Kostka(int pocetstenn) {
        pocetsten = pocetstenn;
        random = new Random();
}
    public int getpocetsten()
    {
        return pocetsten;
    }
    public int hod(int pocetsten)
    {
        return  (random.nextInt(pocetsten)+1);
    }
    
}
