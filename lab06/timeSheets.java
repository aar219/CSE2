//Anthony Rivera
//lab 06
//Time Sheets Program
//Program that keeps track of the hours worked by individual employees

import java.util.Scanner;

public class timeSheets {
    
    public static void main(String[] args) {
        
        //creating a scanner
        Scanner scanner = new Scanner(System.in);
        
        //declaring the variables that calculate the employees' payrolls
        double empPay = 0;
        double hours = 0;
        double empPayroll = 0;
        double totalPayroll = 0;
        
        //asking the user for the number of employees
        System.out.print("What is the number of employees? ");
        int employees = scanner.nextInt();
        
        //calculating the payroll for each employee
        for (int o = 0; o < employees; o++) {
            
            //asking for how much the employee is paid per hour
            System.out.println("How much is this employee paid per hour? ");
            empPay = scanner.nextDouble();
            
            empPayroll = 0;
            
            
            for (int i=1; i <= 5; i++) {
                
                //asking the user for the number of hours worked per day by each employee
                System.out.print("How many hours did this employee work on day "
                + i + " of the week? ");
                hours = scanner.nextDouble();
                
                //actually calculating the payroll for each employee
                empPayroll += empPay*hours;
                
            }
            
            //telling the user what eaach employee was paid per week
            System.out.println("This employee earned $" + empPayroll + " this week");
            
            //calculating the total payroll of all the employees
            totalPayroll += empPayroll;
            
        }
        
        //telling the user what all of the employees were paid for the week
        System.out.println("The total amount paid to employees is $" + totalPayroll);
        
    }
    
}