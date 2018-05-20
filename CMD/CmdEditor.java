/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CMD;

import java.io.File;
import java.lang.reflect.Executable;

/**
 *
 * @author SULO
 */
public class CmdEditor {
    private File actualDir;
    private boolean isRunning;
    private Executable command;
    
    public CmdEditor()
    {
        isRunning = true;
        actualDir = new File(System.getProperty("user.dir"));
    }
    

    public boolean isRunning() {
        return isRunning;
    }

    public String getActualDir() {
      return actualDir.getAbsolutePath();
    }

    public String parseAndExecute(String line) {
        if(line.equals("exit"))
        {
            isRunning = false;
        }
        
      // command = Parser.parse(line);
      //  return command.execute(actualDir);
      return "h";
    }
    
}
