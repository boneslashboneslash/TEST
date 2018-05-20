/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CMD;

import java.util.Scanner;
    ji
    ¨j¨j¨j¨j¨j
    j
    j
/**
 *
 * @author SULO
 */
public class CmdUI {
   public static Scanner input = new Scanner(System.in); 
    public static void main(String[] args) {
        CmdEditor myCmd = new CmdEditor();
        String line;
        while(myCmd.isRunning())
        {
            System.out.println(myCmd.getActualDir() + ">");
            line = input.nextLine();
            System.out.println(myCmd.parseAndExecute(line));
        }
    }
}
