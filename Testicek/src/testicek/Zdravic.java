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
public class Zdravic {
      /* text pozdravu */
    public String text;
    
    /**
     *
     * @param jmeno name of the user
     * @return text s greetings
     */
    public String pozdrav(String jmeno)
    {
        return String.format("%s %s", text, jmeno);
    }
    
    
}
