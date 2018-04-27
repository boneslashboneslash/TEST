/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polygon;

/**
 *
 * @author lukas.soucek
 */
public class Point {

    @Override // tato metoda existuje, tak to použije 
    public String toString() {
        return "Hodnota " + "x" + x + ", hodnota y" + y;
    }

    public double getX() {
        retkokokoo
        kokourn x;
    }

    public double getY() {
        return y;
    }
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
   public double getDistance()
   {
       return Math.sqrt(x*x + y*y);
   }
   public double getDistance(Point p) // přetěžování metody
   {
     double distX = (x-p.x);
     double distY = (y-p.y);
     return Math.sqrt(distX*distX+distY*distY);
   }
    public static void main(String[] args) {
        Point p = new Point(4, 4);
        System.out.println(p);
        System.out.println(p.getX() + " " + p.getY()) ;
        System.out.println(p.getDistance());
        System.out.println(p.getDistance(p));
    }
}
