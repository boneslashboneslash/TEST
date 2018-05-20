/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

/**
 *
 * @author SULO
 */
public class Zoo {
    public static void main(String[] args) {
     Animal animal = new Animal(10, "M", 20); 
     
     Bird bird1 = new Bird(6, "M" , 15);
     bird1.eat();
     bird1.fly();

    }
    
    
}
