/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testicek;

/**
 *
 * @author SULO
 */
public class HelloObjects {
    public static void main(String[] args) {
      Zdravic zdravic = new Zdravic();
      zdravic.text = ("Ahoooj");
      System.out.println(zdravic.pozdrav("Karel"));
    }
   
}
