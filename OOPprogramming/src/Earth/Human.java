/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SULO
 */
package Earth;
public class Human {
    protected String name;
    protected int age;
    protected int heightincms;
    protected String eyecolor;

    public Human() {
        
    }
    
    public void speak()
    {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age + " years old"  );
        System.out.println("I am tall about " + heightincms + " inches");
        System.out.println("and my eyes are " + eyecolor);
    }
    public void eat()
    {
        System.out.println("I am eating");
    }
     public void walk()
    {
        System.out.println("I am walking");
    }
}
