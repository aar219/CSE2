public class SortandMerge {
    
    public static void main(String[] args) {
        
        //declaring the arrays that will be sorted
        int[] arr1 = new int[20];
        int[] arr2 = new int[10];
        
        //assigning a value to every spot in the arrays
        for (int i = 0; i < 20; i++) {arr1[i] = (int)(Math.random()*100);}
        for (int i = 0; i < 10; i++) {arr2[i] = (int)(Math.random()*100);}
        
        //calling upon the sort method for each array.
        sort(arr1);
        sort(arr2);
        
        //printing out each value of array 1
        System.out.print("Array 1: ");
        for (int i = 0; i < arr1.length; i++) {System.out.print(arr1[i] + " ");}
        System.out.println();
        
        //printing out each value of array 2
        System.out.print("Array 2: ");
        for (int i = 0; i < arr2.length; i++) {System.out.print(arr2[i] + " ");}
        System.out.println();
        
        //declaring the variables that will keep track of the two arrays and 
        //declaring a new array of size 30 to combine the previous two arrays
        int num1 = 0;
        int num2 = 0;
        int[] arr3 = new int[30];
        
        //printing out the values of the third array after it is created
        System.out.print("Array 3: ");
        //assigning a value for each int in the array in ascending order
        for (int i = 0; i <= 30; i++) {
            
            //checking to see if each array still has any unused values
            if (num1 < 20 && num2 < 10) {
                //checking to see which array currently holds the smaller value
                if (arr2[num2] < arr1[num1]) {
                    //assigning that value of array 2 to array 3
                    arr3[i] = arr2[num2];
                    num2++;
                }
                else {
                    //assigning that value of array 1 to array 3
                    arr3[i] = arr1[num1];
                    num1++;
                }
            }
            //checking to see if array 1 is the only array with unused values
            else if (num1 < 20) {
                //assigning the rest of the values from array 1 to array 3
                arr3[i] = arr1[num1];
                num1++;
            }
            //checking to see if array 2 is the only array with unused values
            else if (num2 < 10) {
                //assigning the rest of the values from array 2 to array 3
                arr3[i] = arr2[num2];
                num2++;
            }
            //once done, printing out each value in array 3
            else {
                for (int o = 0; o < 30; o++) {
                    System.out.print(arr3[o] + " ");
                }
            }
            
        }
        
    }
    
    public static void sort(int[] arr) {
        
        //declaring a variable to hold certain values
        int num = 0;
        
        //using a for loop to repeatly correct the order of the values in the 
        //array
        for (int o = 0; o < arr.length; o++) {
            //using a for loop to correct the order of values by swapping values
            //that aren't in the right order and moving down the array
            for (int i = arr.length-1; i > 0; i--) {
                
                //checking to see if the values are in the right order relative 
                //to each other (each value is larger than the value preceding 
                //it)
                if (arr[i] < arr[i-1]) {
                
                    //swapping values that aren't in the correct order
                    num = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = num;
                
                }
                
            }
        }
        
    }
    
}