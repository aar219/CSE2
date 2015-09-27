//Anthony Rivera
//HW 05
//Average Grade Program
//Program that computes the average grade of an unspecified number of entries

import java.util.Scanner;

public class averageGrade {
    
    public static void main(String[] args) {
        
        //creating a scanner
        Scanner scanner = new Scanner(System.in);
        
        //declaring all the necessary variables
        double response = 0;
        double gradeTotal = 0;
        double numGrade = 0;
        double aveGrade = 0;
        
        //entering the loop that adds up all the grades and averages them
        while(response != 999) {
            
            //asking the user for a grade
            System.out.print("Enter a grade(999 to compute the average grade): ");
            response = scanner.nextDouble();
            
            //determining whether or not the user entered a valid grade or is finished with the grades
            if(response >= 0 && response <= 100) {
                //adding that grade to the total and adding up the number of grades
                gradeTotal += response;
                numGrade++;
            }
            else if(response != 999) {
                //informing the user of the invalid value
                System.out.println("You have entered an invalid value. Please Try again.");
            }
            else {
                //calculating the average grade and informing the user of that value
                aveGrade = gradeTotal/numGrade;
                System.out.println("The average grade in this class is " + aveGrade + ".");
            }
            
        }
        
    }
    
}