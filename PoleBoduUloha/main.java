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
public class main {
    private static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Bod c = new Bod(4,2);
        //System.out.println(b.getvzd(c));
        PoleBodu d   = new PoleBodu(3);
        for(int i=0;i<d.pocet;i++)
        {
        d.pridatBod(sc.nextInt(), sc.nextInt());
        }
        //Bod k = d.maxvzdpoc();
        //System.out.format("Bod s nejvetsi vzdalenosti od pocatku se souradnicemi %f %f",k.getX(),k.getY());
        Bod [] k = d.maxvzdBod();
        System.out.format("Bod se souradnicemi %f,%f je nejdale od bodu %f %f",k[0].getX(),k[0].getY(),k[1].getX(),k[1].getY());
      
    // TODO code application logic here
    }
    
}
