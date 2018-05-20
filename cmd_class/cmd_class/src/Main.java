
import java.io.File;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukas.soucek
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File(System.getProperty("user.dir"));
                       System.out.println(f.exists());
                System.out.println(f.isDirectory());
                System.out.println(f.length());
                System.out.println(f.getAbsolutePath());
                
    }
}
