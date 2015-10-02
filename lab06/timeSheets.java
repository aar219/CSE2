//Anthony Rivera
//lab 06
//Time Sheets Program
//Program that keeps track of the hours worked by individual employees

import java.util.Scanner;

public class timeSheets {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double empPay = 0;
        double hours = 0;
        double empPayroll = 0;
        double totalPayroll = 0;
        
        System.out.print("What is the number of employees? ");
        int employees = scanner.nextInt();
        
        for (int o = 0; o < employees; o++) {
            
            System.out.println("How much is this employee paid per hour? ");
            empPay = scanner.nextDouble();
            
            empPayroll = 0;
            
            for (int i=1; i <= 5; i++) {
                
                System.out.print("How many hours did this employee work on day "
                + i + " of the week? ");
                hours = scanner.nextDouble();
                
                empPayroll += empPay*hours;
                
            }
            
            System.out.println("This employee earned $" + empPayroll + " this week");
            totalPayroll += empPayroll;
            
        }
        
        System.out.println("The total amount paid to employees is $" + totalPayroll);
        
    }
    
}