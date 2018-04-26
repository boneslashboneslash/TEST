/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Earth;

/**
 *
 * @author SULO
 */
public class Earth {
    public static void main(String[] args) {
        Human tom;
        tom = new Human();
        tom.age = 18;
        tom.heightincms= 180;
        tom.eyecolor = "brown";
        tom.name = "Carl";
        tom.speak();
    }
}
