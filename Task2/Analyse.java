package sg.edu.nus.iss.Task2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Analyse {
    public static void main(String[] args) throws IOException {

        File dirPath = new File("src/main/java/sg/edu/nus/iss/Task2/texts");
        File fileList[] = dirPath.listFiles();   
        System.out.println("List of files and directories"); 
        
       
        String line = "";
        
        StringBuffer buffer = new StringBuffer();

        for(File file : fileList) {

            Scanner scanner = new Scanner(file);

            String input = "";
           
            while (scanner.hasNext()) {
                input = scanner.nextLine();
                input = line.trim().replaceAll("\\p{Punct}", "");
                buffer.append(input + " ");
        }

        System.out.println("File content " + buffer.toString());
        System.out.println(" ");

        }  

    }
    
}
