//Anthony Rivera
//lab 05
//Special Calculator Program

import java.util.Scanner;

public class CalculatorSpecial {
    
    public static void main(String[] args) {
        
        //creating a scanner
        Scanner scanner = new Scanner(System.in);
        
        //initializing all the variables
        String response = " ";
        double num1;
        double num2;
        String oper;
        char oper1;
        double ans = 0;
        
        //beginning the process of asking for numbers and operator in a while 
        //loop so it can be asked multiple times
        while(!response.equalsIgnoreCase("n")) {
            
            //asking for number 1
            System.out.print("Number #1: ");
            num1 = scanner.nextDouble();
            
            //asking for number 2
            System.out.print("Number #2: ");
            num2 = scanner.nextDouble();
            
            //asking for the type of operator
            System.out.println("What operation would you like to perform on " 
                + "these two numbers? ");
            oper = scanner.nextLine();
            oper = scanner.nextLine();
            oper1 = oper.charAt(0);
            
            //determining which operation to use on the two numbers
            switch(oper1) {
                
                case '+': ans = num1 + num2;
                break;
                case '-': ans = num1 - num2;
                break;
                case '*': ans = num1*num2;
                break;
                case '/': ans = num1/num2;
                break;
                default: System.out.println("This is an illegal operator.");
                
            }
            
            //telling the user what the answer is
            if(oper1 == '+' || oper1 == '-' || oper1 == '*' || oper1 == '/') {
                System.out.println(num1 + " " + oper1 + " " + num2 + " = " + ans);
            }
            
            //asking the user if he wants to continue
            System.out.print("Do you want to continue? (y/n) ");
            response = scanner.nextLine();
            
        }
        
    }
    
}