import java.util.Scanner;

public class Average {
    
    public static void main(String[] args) {
        
        //creating the scanner
        Scanner scanner = new Scanner(System.in);
        
        //asking the user for the size of the array
        System.out.print("How big is the array? ");
        int n = scanner.nextInt();
        
        //declaring variables that hold the values of the total and average
        double average = 0;
        double total = 0;
        
        //creating an array of the specified size that is made up of random 
        //numbers
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random()*100); //making a random number
            System.out.println(arr[i]); //printing out the values in the array
            total += arr[i]; //calculating the total
        }
        
        //calculating the average
        average = total/n;
        
        //telling the user what the total and average are
        System.out.println("The total is " + (int)(total) + " and the average" 
            + " is " + average + ".");
        
        //printing out the values in the array that are bigger than average
        for (int i = 0; i < n; i++) {
            if (arr[i] >= average) {
                System.out.println("Greater than average: " + arr[i]);
            }
        }
        
    }
    
}