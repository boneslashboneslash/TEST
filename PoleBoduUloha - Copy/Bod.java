/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoleBoduUloha;

/**
 *
 * @author SULO
 */
public class Bod {
    private double x;
    private double y;
    

    public Bod(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double getvzdnula()
    {
        return Math.sqrt(x*x+y*y);
        
        
    }
    public double getvzd(Bod a)
    {
         return Math.sqrt( (x-a.x)*(x-a.x) + (y-a.y)*(y-a.y));
        
    }
    
    
}
