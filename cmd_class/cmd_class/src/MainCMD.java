
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lukas.soucek
 */
public class MainCMD {

    private static Scanner sc = new Scanner(System.in);
    private static String command;

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        CmdInterface cmd = new CmdEditor();
        String result;
        System.out.println(cmd.getActualDir() + ">");
        
        while (!(command = sc.nextLine()).equals("exit")) {

            result = cmd.execute(command);

            System.out.println(result);
            System.out.println(cmd.getActualDir() + ">");

        }

    }

}
