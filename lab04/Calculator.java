//Anthony Rivera
//lab 04
//Calculator Program

import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        
        //creating a scanner
        Scanner scanner = new Scanner(System.in);
        
        //asking the user for the two numbers
        System.out.print("First number: ");
        int a = scanner.nextInt();
        System.out.print("Second number: ");
        int b = scanner.nextInt();
        
        //asking the user for the operation to be done on the two numbers
        System.out.print("What operation will be performed on these two " + 
            "numbers? (+, -, *, or /) ");
        String oper = scanner.nextLine();
        oper = scanner.nextLine();
        char operator = oper.charAt(0);
       
       //performing the calculations on the two numbers based off of the 
       //operator the user asked for
        switch(operator) {
            
            case '+':
                System.out.println(a + "+" + b + "=" + (a+b));
                break;
            case '-':
                System.out.println(a + "-" + b + "=" + (a-b));
                break;
            case '*':
                System.out.println(a + "*" + b + "=" + (a*b));
                break;
            case '/':
                System.out.println(a + "/" + b + "=" + (a/b));
                break;
            default:
                System.out.print("Illegal Operator");
            
        }
        
    }
    
}