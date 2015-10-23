//Anthony Rivera
//lab 009
//Coin Flip Program

import java.util.Scanner;
import java.util.Random;

public class CoinFlip {
    
    public static void main(String[] args) {
        
        //declaring a sentinel variable that controls the while loop
        boolean bool = true;
        //creating a scanner
        Scanner scanner = new Scanner(System.in);
        
        //while loop to continually ask for the number of coin flips
        while (bool) {
            //asking the user for number of coin flips and calling the method
            //that flips the coin
            System.out.print("How many coin flips (1-100)? ");
            int num = scanner.nextInt();
            bool = flip(num);
        }
        
    }
    
    //methd that flips the coin
    public static boolean flip(int num) {
        
        //declaring all the necessary variables
        int coin = 0;
        int heads = 0;
        int tails = 0;
        boolean bool = true;
        //creating a random number generator
        Random random = new Random();
        
        //checking to see if they asked for 1 to 100 flips
        if(num >= 0 && num <= 100) {
            
            //flipping the coin for the specified number of times
            for (int i = 0; i < num; i++) {
                coin = random.nextInt(2);
                if (coin == 1) {heads++;}
                else {tails++;}
            }
            
            //telling the user the results
            System.out.println("Tail: " + tails + " Head: " + heads);
            
        }
        //changing the sentinel loop to false so that it no longer asks the 
        //question of 'how many flips?'
        else {bool = false;}
        
        return bool;
        
    } 
    
}