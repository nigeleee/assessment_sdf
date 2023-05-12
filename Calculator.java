package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        String input = "";
        
        System.out.println("Welcome.");
        //Operator operators = new Operator();
        
        Scanner scanner = new Scanner(System.in);

        List<Integer> store = new ArrayList<>();
       
        
        while(input != null) {
        
        System.out.print("> ");
        
        int num1 = scanner.nextInt();
       
        String symbol = scanner.next();

        int num2 = scanner.nextInt();

        int result;
        
        String cue;

        input = scanner.nextLine();

        if (!input.equals("exit")) {
            switch (symbol) {
                case "+":
                result = num1 + num2;
                store.add(result);
                System.out.println(result);
                break;

                case "-":
                result = num1 - num2;
                store.add(result);
                System.out.println(result);
                break;

                case "*":
                result = num1 * num2;
                store.add(result);
                System.out.println(result);
                break;

                case "/":
                result = num1 - num2;
                store.add(result);
                System.out.println(result);
                break;
            
            } 

            } else {
            System.out.println("Bye bye");

            }
        
        } 
            
    }
            
}
            
            

            
  



