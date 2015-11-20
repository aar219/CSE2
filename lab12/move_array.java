import java.util.Scanner;

public class move_array {

    public static void main(String[] args) {
        
        //creating a scanner
        Scanner scan = new Scanner(System.in);
        boolean exception = false;
        
        
        int[] arr;
        int size = 0;
        //continually asking for an array size until it is >0
        do {
            
            exception = false;
            
            //asking for the array size
            System.out.print("How big is the array? ");
            size = scan.nextInt();
            
            //trying to make an array of the given size
            try {arr = new int[size];}
            //catching the exception if the size is <=0 and changing the boolean
            //for exceptions to true
            catch (Exception e) {
                exception = true;
                System.out.println("The given size is not larger than 0. Try" + 
                    " again.");
            }
            
        } while (exception == true);
        arr = new int[size];
        
        //creating random values between 0 and 100 for each index of the array
        for (int i = 0; i < size; i++) {arr[i] = (int)(Math.random()*100);}
        
        //declaring a variable that will hold the value of the array at the 
        //given index and a variable that will hold the value of the index
        int num = 0;
        int index = 0;
        //continually asking for the index until one is given that can be used
        //on the array
        do {
            
            exception = false;
            
            //asking for the index
            System.out.print("Index of number to be moved: ");
            index = scan.nextInt();
            
            //trying to find the value at that index
            try {
                num = arr[index];
            }
            //catching the exception if the value of index is out of the bounds 
            //of the array and changing the boolean for exceptions to true
            catch (Exception e) {
                exception = true;
                System.out.println("The given array is not within the bounds " +
                    "of the array. Try again.");
            }
            
        } while (exception == true);
        
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        //moving all the values past the array's index down a spot
        for (int i = index+1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        
        //assigning the value of the array at the index to the last spot in the 
        //array
        arr[size-1] = num;
        
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
    
}