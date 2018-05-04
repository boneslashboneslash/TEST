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
public class Chicken extends Bird {
    
    public Chicken(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    /**
     *
     */
    @Override
    public void fly() {
        System.out.println("I don´t fly, sorry.");
    }
    
    
}
