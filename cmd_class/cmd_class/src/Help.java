
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukas.soucek
 */
public class Help extends Command {

    public Help() {
    }

   
  
  

    /**
     *
     * @param actualDir
     */
    
    @Override
    public void run(File dir) {
        newDir = dir;
        resultText = "Ahoj jak se mas";
    }
    
}
