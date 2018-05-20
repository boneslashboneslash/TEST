
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
public class Dir extends Command{

    public Dir() {
    }

  
/*
    @Override
  public void run(File dir){
      newDir = dir;
     File [] tmp = null;
      if(this.parameters.length ==1)
      {
         tmp = newDir.listFiles();
      }
      else
      {
          if(this.parameters[1].equals("-e"))
          {
            
              // blablblablbla
          }
      }
  }
  */
 public void runExtensionDir(File dir)
         
 {
     newDir =  dir;
             File[] tmp = newDir.listFiles(new JavaFilter());
             
 }
    
    @Override
    public void run(File dir) {
        newDir = dir;
        File [] tmp = newDir.listFiles();
        resultText = "\n";
        for (int i=0;i<tmp.length;i++) {
            
        
            resultText += String.format("%d %10dB",tmp[i].lastModified(),tmp[i].length()); 
            
            if(tmp[i].isDirectory())
       {
           resultText += " <DIR>";
       }
      
       
            resultText += " " +tmp[i].getName();
       
            resultText += "\n";
        }
    }
    
}
