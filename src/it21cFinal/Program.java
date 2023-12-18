package it21cFinal;
import java.util.Scanner;

public class Program extends School {
    
    Program(String name) {
        super(name);
        
    }
    void ProgramName(){
        Scanner scanner = new Scanner(System.in);
              
        System.out.println("1.BSIT ");
        System.out.println("2.BSBA ");
        System.out.println("3.TEP ");
        System.out.println(name + "Enter Program Name: ");
        String name = scanner.nextLine();
        
        //System.out.print("1. BSIT ");
       // String tep = scanner.nextLine();
        
        //System.out.print("2. BSBA ");
        //String bsba = scanner.nextLine();
        
       // System.out.print("3. TEP ");
       // String bsit = scanner.nextLine();
        
        System.out.println(name + ".Bachelor of Science in Information Technology ");
        System.out.println(name + ".Bachelor of Science in Business Adminstration ");
        System.out.println(name + ".Teacher Education Program ");
        
        
        scanner.close();
    }
}