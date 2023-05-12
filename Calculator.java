package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       
        System.out.println("Welcome.");

        String input = "";
        

        //Operator operators = new Operator();
        
        Scanner scanner = new Scanner(System.in);

        List<String> $last = new ArrayList<>();
       
      
        int num1 = scanner.nextInt();
       
        String symbol = scanner.next();

        int num2 = scanner.nextInt();

        int result;

        input = scanner.nextLine();
        while (input.equals("exit")) {   

            System.out.print("> ");
        
            switch (symbol) {
                case "+":
                result = num1 + num2;
                System.out.println(result);
                break;

                case "-":
                result = num1 - num2;
                System.out.println(result);
                break;

                case "*":
                result = num1 * num2;
                System.out.println(result);
                break;

                case "/":
                result = num1 - num2;
                System.out.println(result);
                break;
            } 

        }  
            
    }
            
            
}
            
  



