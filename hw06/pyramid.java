//Anthony Rivera
//homework 06
//Pyramid Program
//Program that makes pyramids in the size specified

import java.util.Scanner;

public class pyramid {
    
    public static void main(String[] args) {
        
        //creating a scanner
        Scanner scanner = new Scanner(System.in);
        
        //declaring all the variables that will be used to determine which symbol
        //will be placed and where it will be placed
        int rows = 0;
        int rows1 = rows;
        int a = 0;
        int b = 0;
        
        //creating a while loop so the user can create as many loops as they want
        while (rows >= 0) {
            
            //asking the user for the size of the pyramid
            System.out.print("What size pyramid? " 
                + "(negative values mean I stop asking you this question) ");
            rows = scanner.nextInt();
            rows1 = rows;
            
            //creating a for loop that prints out each line
            for (int o = 1; o <= rows; o++) {
                
                b = o - 1;
                
                //creating a for loop that prints out every symbol
                for (int i = 1; i <= rows1; i++) {
                    
                    a = i;
                    //determining if the symbol will be a star
                    if (a >= (rows - b) && a <= (rows + b)) {
                        //printing the stars
                        System.out.print("*");
                    }
                    else {
                        //printing the spaces
                        System.out.print(" ");
                    }
                    
                }
                System.out.println("");
                rows1++;
                
            }
            System.out.println("");
        
        }
        
    }
    
}