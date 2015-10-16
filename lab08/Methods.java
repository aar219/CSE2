//Anthony Rivera
//lab 08
//Methods Program
//Program that finds the mean, median, and provides a print of the results 
//through methods

import java.util.Scanner;

public class Methods {
    
    public static void main(String[] args) {
        
        //creating a new scanner
        Scanner scanner = new Scanner(System.in);
        
        //declaring the variables that hold the numbers' total and total 
        //number of numbers
        double total = 0;
        int i = 0;
        int n;
        
        //asking the user for the number of numbers
        System.out.println("How many numbers are there? ");
        n = scanner.nextInt();
        
        //initializing the array that holds the numbers
        double array[] = new double[n];
        
        do {
            
            //asking for each number
            System.out.print("Give me number " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
            
            //adding each number to the total
            total += array[i];
            
            //increasing the sentinel variable
            i++;
            
        } while (i < n);
        
        //calling upon the methods that find the mean and median as well as 
        //prints it out for the user
        double average = mean(total, n);
        double median = median(total, array, n);
        print(average, median);
        
    }
    
    //method that finds the mean
    public static double mean(double total, int n) {
       
       //calculating the mean
        double average = total/((double)(n));
        return average;
        
    }
    
    //method that finds the median
    public static double median(double total, double[] array, int n) {
        
        double median;
        
        //finding out if the number of numbers is odd or even
        if (n%2 == 0) {
            //finding the median for evens
            median = (array[(n-1)/2] + array[(n-1)/2 + 1])/2;
        }
        else {
            //finding the median for odds
            median = array[n/2];
        }
            
        return median;
        
    }
    
    //method that prints out the mean and median
    public static void print(double mean, double median) {
        
        //telling the user the mean and median
        System.out.println("The mean is " + mean + " and the median is " 
            + median + ".");
        
    }
    
}