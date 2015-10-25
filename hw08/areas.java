//Anthony Rivera
//HW 008
//Area Program

import java.util.Scanner;

public class areas {
    
    public static void main(String[] args) {
        
        //creating the scanner
        Scanner scanner = new Scanner(System.in);
        
        //declaring the necessary dimension variables
        double radius, length, height, length2, area = -1.0;
        
        //asking the user for the shape
        System.out.print("What shape are you using(only rectangle, trapezoid, or circle)? ");
        String shape = scanner.nextLine();
        
        //determining which shape the user wants
        if (shape.equalsIgnoreCase("circle")) {
            
            //asking for the radius(if circle)
            System.out.print("What is the radius? ");
            radius = scanner.nextDouble();
            
            //calling the method for area
            area = area(radius);
            
        }
        else if (shape.equalsIgnoreCase("rectangle")) {
            
            //asking the  user for the length and height(if rectangle)
            System.out.print("What is the length? ");
            length = scanner.nextDouble();
            System.out.print("What is the height? ");
            height = scanner.nextDouble();
            
            //calling the method for area
            area = area(length, height);
            
        }
        else if (shape.equalsIgnoreCase("trapezoid")) {
            
            //asking the user for the two base lengths and height (if trapezoid)
            System.out.print("What is the base length? ");
            length = scanner.nextDouble();
            System.out.print("What is the height? ");
            height = scanner.nextDouble();
            System.out.print("What is the second base length? ");
            length2 = scanner.nextDouble();
            
            //calling the method for area
            area = area(length, height, length2);
            
        }
        //informing the user that they picked picked a wrong shape
        else {System.out.println("That is not one of the specified shapes.");}
        
        //telling the user what the area is
        if (area >= 0) {
            System.out.println("The area of the " + shape + " is " + area + ".");
        }
        
    }
    
    //method for area of a circle
    public static double area(double radius) {return 3.14*radius*radius;}
    
    //method for area of a rectangle
    public static double area(double length, double height) {return length*height;}
    
    //method for area of a trapezoid
    public static double area(double length, double height, double length2) {return ((length2+length)/2)*height;}
    
} 