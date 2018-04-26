/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoneyBox;

/**
 *
 * @author lukas.soucek
 */
public class MoneyBox {

    private int jedna;
    private int dva;
    private int tri;

    public MoneyBox(int jedna, int dva, int tri, String jmeno) {
        this.jedna = jedna;
        this.dva = dva;
        this.tri = tri;
        this.jmeno = jmeno;
    }
    private String jmeno;

    public MoneyBox(String name) // naplneni kasicky nulou
    {
        this.jedna = 0;
        this.dva = 0;
        this.tri = 0;
        this.jmeno = jmeno;
    }

    private int jedna(int count) {
        return jedna += count;

    }

    private int dva(int count) {
        return dva += count;

    }

    private int tri(int count) {
        return tri += count;

    }
    public int sum()    {
        int celkem = tri*3+dva*2+jedna;
        return celkem;
        
    }
    public boolean lze(int price)
    {
       int sum = sum();
       if(sum  >= price)
       {
           return true;
       }
       else 
       {
       return false;
       }
    }
    public String getname()
    {
       return jmeno;
    }
    @Override
    public String toString() { 
        return jmeno + "má v pokladničce" + sum() + "Kč";
    }
    
}
