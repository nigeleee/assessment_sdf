package sg.edu.nus.iss.Task_2.src.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Analyse {
    public static void main(String[] args) throws IOException {
        
        String file = args[0];

        File texts = new File(file);

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        Scanner scanner = new Scanner(br);
        

        br.close();
        fr.close();
    }
    
}
