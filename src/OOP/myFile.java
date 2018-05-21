package OOP;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class myFile {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Enter 1 : Write\nEnter 2 : Read");
        int op = reader.nextInt();

        switch (op) {
            case 1:
                String fileText;
                System.out.print("Enter File: ");
                fileText = reader.next();
                FileWriter(fileText);    
            break;
            case 2:
                FileReader();
            break;
        }
        
    }

    static void FileReader(){
        try {
            FileReader fin = new FileReader("file.txt");
            int c;
            while ((c=fin.read())!=-1) {
                System.out.print((char)c);
            }
            fin.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void FileWriter(String str) {
        try {
            FileWriter fo = new FileWriter("file.txt") ;
            fo.write(str);
            fo.close();
        } 
        catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
