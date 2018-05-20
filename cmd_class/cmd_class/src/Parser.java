/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukas.soucek
 */
public class Parser {

    
    
    public Command parse(String command) {
        Command c = null;
        // rozdělení dle mezer
        String[] parts = command.split(" ");
        switch (parts[0]) {
            // nutný parametr
            case "dir":
                c = new Dir();
                break;
            case "help":
                c = new Help();
                break;

        }
        return c;

    }

    public static void main(String[] args) {

    }
}
