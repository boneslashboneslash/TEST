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
public class Bird extends Animal{

    public Bird(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    

       public void fly()
    {
System.out.println("fly please");
    }
}
