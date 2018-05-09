/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prvniuloha;

/**
 *
 * @author lukas.soucek
 */
public class Fraction {

    int num, denom; // proměnné uložené v paměti na nějakém místě

    Fraction(int num, int denom) // konstruktor dvou proměnných
    {
        this.num = num;
        this.denom = denom; // v this je uložená hodnota čitatele i jmenovatele
          }

    Fraction(String fraction) {
        String[] parts = fraction.split("/"); // -> rozdeleni dvou cisel -> pole znaků
        num = Integer.parseInt(parts[0]);
        denom = Integer.parseInt(parts[1]);
                }

    public int getNum() {
        return num;
    }

    public int getDenom() {
        return denom;
    }

    public Fraction reduce() {
        int gcd = gcd(num, denom);
        if (gcd > 1) {
            num = num / gcd;
            denom = denom / gcd;
        }
        return new Fraction(num + "/" + denom);
    }

    int gcd(int a, int b) {
        int zlomek = 1;
        {
            for (int i = 1; i <= a; i++) {
                if ((a % i == 0) && (b % i == 0)) {
                   zlomek = i;
                    
                }
            }
        }

        return zlomek;
    }

    @Override // metoda existovala a kód byl změněn :-)
    public String toString() { 
        return num + "/" + denom;
    }
}
