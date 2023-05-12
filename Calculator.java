package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       
        System.out.println("Welcome.");

        String input = "";

        int num1, num2;
        String symbol;
    
        //Operator operators = new Operator();
        
        Scanner scanner = new Scanner(System.in);

        List<String> $last = new ArrayList<>();
       
        while(!input.equals("exit")) {
            System.out.print("> ");

            if(scanner.hasNextInt()) {
            num1 = scanner.nextInt();

        } else if(scanner.hasNext()) {
            symbol = scanner.next();

        } else if(scanner.hasNextInt()) {
            num2 = scanner.nextInt();

        } else {
            System.out.println("Values keyed wrongly,input in order: 'num space operator space num'");

        }
    }   System.out.println("Bye bye");

    }
}
