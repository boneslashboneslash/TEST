/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BankAPP;




import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lukas.soucek
 */
public class Transakce {
    private SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MMMM YYYY hh:mm:ss");
    private int castka;
    private Date datum;
     
     ko
     k
     ko
     k
     oko
    public Transakce(int vyse)  {
        this.castka = vyse;
        datum = new Date() ;
         }

    public int getCastka() {
        return castka;
    }

    public String getDatum() {
        return dateFormatter.format(datum);
    }
    public static void main(String[] args) {
        Transakce t = new Transakce(50);
        System.out.println(t.getDatum());
    }
       
}


