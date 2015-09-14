//Anthony Rivera
//homework 03
//Timer Program
//Program that calculates the time you have until dinner

import java.util.Scanner;

public class Timer {
    
    public static void main(String[] args) {
        
        //creating the scanner
        Scanner scanner = new Scanner(System.in);
        
        //asking the user for the time of dinner and declaring that value
        System.out.print("Enter the time in which you will be having dinner " 
            + "(in military time): ");
        int dinner = scanner.nextInt();
        
        //splitting the time given into hours and minutes
        int dinnerH = dinner/100;
        int dinnerM = dinner%100;
        
        //asking the user for the time now and declaring that value
        System.out.print("Enter the time now: ");
        int time = scanner.nextInt();
        
        //splitting up that time into hours and minutes
        int timeH = time/100;
        int timeM = time%100;
        
        //making sure the times entered are valid times
        if(timeH < 24 && timeM < 60 && dinnerH < 24 && dinnerM < 60) {
            
            //calculating the amount of time left
            int hoursLeft = dinnerH - timeH;
            int minutesLeft = dinnerM - timeM;
            
            //telling the user how much time is left
            System.out.println("The amount of time you have left until dinner" 
                + " is " + hoursLeft + " hours and " + minutesLeft + " minutes.");
            
        }
        
        else {
            
            //telling the user that one of their times was invalid
            System.out.println("You have entered an invalid time for either dinner or now.");
            
        }
        
    }
       
}