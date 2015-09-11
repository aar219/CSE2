//Anthony Rivera
//lab 03
//Check java program

import java.util.Scanner;

public class Check {
    
    public static void main(String[] args) {
        
        //creating the scanner
        Scanner scanner = new Scanner(System.in);
        //asking the user what the total on the check is
        System.out.print("What is the total on the check (in the form xxx.xx)? ");
        //declaring the value of the total based off of the user's input
        double total = scanner.nextDouble();
        
        //asking the user what the tip will be
        System.out.print("What percentage tip will you be paying (in the form: xx)? ");
        //declaring the tip's value
        double tip = scanner.nextDouble();
        tip /= 100;
        tip = total * tip;
        
        //asking the user how many people will be splitting the check
        System.out.print("How many people will be splitting the check (in the form xx)? ");
        //declaring the value of the number of people splitting the check
        double people = scanner.nextDouble();
        
        //calculating the amount each person will be paying
        double totalWithTip = total + tip;
        double each = totalWithTip/people;
        int each1 = (int) each;
        
        //breaking up the value of each person's check by dollar, dime, 
        //and penny amounts 
        int dimes = dimes=(int)(each * 10) % 10;
        int pennies = (int)(each * 100) % 10;
        
        //telling the user how much each person will be paying
        System.out.println("The amount each person will be paying is " + each1
            + "." + dimes + pennies + " dollars.");
        
    }
    
}