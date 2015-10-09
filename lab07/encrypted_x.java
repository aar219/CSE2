//Anthony Rivera
//lab 07
//Encrypted X Program

import java.util.Scanner;

public class encrypted_x {
    
    public static void main(String[] arsg) {
        
        //creating a scanner
        Scanner scanner = new Scanner(System.in);
        
        //asking the user for the size of the x
        System.out.print("input a number between 0 and 100: ");
        int input = scanner.nextInt();
        
        //creating a variable that keeps track of the spaces
        int space = 0;
        
        //checking to see if the number given is between 0 and 100
        if(input >= 0 && input <= 100) {
            
            //for loop that makes the lines of the x
            for (int i = 0; i < input; i++) {
                
                //creating a new line
                System.out.println("");
                
                //for loop that creates each symbol in the line
                for (int o = 0; o < input; o++) {
                    
                    //checking to see if the symbol should be a star or space
                    if (o == space || o == (input - space - 1)) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                    
                }
                space++;
                
            }
            
        }
        else {
            //informing the user that their number was not within the specified range
            System.out.println("The number was not between 0 and 100.");
        }
        
    }
    
}