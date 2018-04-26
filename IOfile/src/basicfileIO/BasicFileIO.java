/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicfileIO;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;
import java.lang.*;
import java.nio.file.Files;
import java.util.*;
import static jdk.nashorn.tools.ShellFunctions.input;
import sun.misc.IOUtils;


/**
 *
 * @author SULO
 */
public class BasicFileIO {
    
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        System.out.println("Zadej název vstupního souboru");
        String h = sc.nextLine();
        File file = new File ( h+".txt");
        System.out.println("Zadej název výstupního souboru");
        String h2 = sc.nextLine();
        File file2 = new File ( h2+".txt");
        file2.createNewFile();
       
           if(file.exists())
                   {
           FileInputStream f1 = new FileInputStream(file);
           FileOutputStream f2 = new FileOutputStream(file2);

           byte [] buffer = new byte [1024];
           int bytesRead;
           while ((bytesRead = f1.read(buffer)) != -1)
    {
        f2.write(buffer, 0, bytesRead);
          
    }
         
                          }
           
           else
           {
               
           }
        
       
    
       
      
        
        /*
      ArrayList<Student> students = new ArrayList<>();
      students.add(new Student("Tom",3.921));
      students.add(new Student("Mark",5.921));
      students.add(new Student("Marek",4.921));
      FileOutputStream fo = new FileOutputStream(file);
        DataOutputStream out = new DataOutputStream(fo);
        for (Student student : students) {
            out.writeBytes(student.getName()+ " "+ String.valueOf(student.getGPA())+ "\n");
        }
        out.close();
        
        /*
        
        /*
        try {stdu
        PrintWriter output = new PrintWriter(file);
        output.println("gigigi");
        output.println("72");
        output.close();
        } catch (IOException ex) {
        System.out.println("error");
        }
        /* Scanner input;
        try {
        input = new Scanner(file);
        String name = input.nextLine();
        int age = input.nextInt();
        System.out.printf("%s %d", name, age);
        } catch (FileNotFoundException ex) {
        System.out.println("error");
        }
         */
  
      
    }
   
    }
    
