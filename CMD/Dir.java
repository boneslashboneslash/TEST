/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CMD;

import java.io.File;

/**
 *
 * @author SULO
 */
public class Dir extends Command {
  @Override
  public String execute(File actualDir)
  {
      File[] subDirAndFiles = actualDir.listFiles();
      StringBuilder sb = new StringBuilder();
      StringBuilder sf = new StringBuilder();
      for(File file: subDirAndFiles)
      {
          if(file.isDirectory())
          {
              sb.append(file.getName()).append("\n");
          } else if(file.isFile())
          {
              sf.append(file.getName()).append(file.length()).append("/n");
          }
      }
      return null;
  } 
    public static void main(String[] args) {
        Dir d = new Dir();
        System.out.println(d.execute(new File(System.getProperty("user.dir"))));
    }
    
}
