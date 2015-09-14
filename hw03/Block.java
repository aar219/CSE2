//Anthony Rivera
//homework 03
//Block Program
//Program that calculates the volume and surface area of a block

import java.util.Scanner;

public class Block {
    
    public static void main(String[] args) {
        
        //creating a scanner
        Scanner scanner = new Scanner(System.in);
        
        //asking the user for the block's dimensions
        System.out.print("What is the height? ");
        double height = scanner.nextDouble();
        System.out.print("What is the length? ");
        double length = scanner.nextDouble();
        System.out.print("What is the width? ");
        double width = scanner.nextDouble();
        
        //calculating the surface area and the volume
        double volume = height*width*length;
        double surfaceArea = 2*height*width + 2*height*length + 2*length*width;
        
        //telling the user the volume and surface area
        System.out.println("The volume of your block is " + volume 
            + " and the surface area is " + surfaceArea + ".");
        
    }
    
}