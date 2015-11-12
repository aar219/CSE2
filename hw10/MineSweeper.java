import java.util.Scanner;

public class MineSweeper {
    
    public static void main(String[] args) {
        
        //creating a scanner
        Scanner scan = new Scanner(System.in);
        
        //continually asking for the size of the 2D array until it's within the 
        //specified range
        int num = 2;
        do {
            
            //checking if it's within the range
            if (num < 2 || num > 30) {
                System.out.println("The size has to be within 2 and 30");
            }
            System.out.print("How big is the board?(1 < n < 31) ");
            num = scan.nextInt();
            
        } while (num < 2 || num > 30);
        
        //declaring the 2D array at the given size and giving them values of '0'
        char[][] N = new char[num][num];
        for (int i = 0; i < num; i++) {
            for (int o = 0; o < num; o++) {
                N[i][o] = '0';
            }
        }
        
        //continually asking for the number of mines until it's within the 
        //specified range
        int mines = 1;
        do {
            
            //checking if it's within the range
            if (mines < 1 || mines > num*num) {
                System.out.println("The number of mines has to be between 1 " + 
                    "and the number of spaces within the grid.");
            }
            System.out.print("How many minesweepers?(0 < m < (n*n + 1)) ");
            
            //assigning the value of mines
            mines = scan.nextInt();
            
        } while (mines < 1 || mines > num*num);
        
        //placing all the mines within the 2D array
        for (int i = 0; i < mines; i++) {
            
            //creating random coordinates for the mines
            int X = (int)(Math.random()*num);
            int Y = (int)(Math.random()*num);
            
            //checking to see if that coordinate is used for 'M' already
            if (N[X][Y] == 'M') {i--;}
            else {N[X][Y] = 'M';}
            
        }
        
        //using two for loops to go through the entire 2D array
        for (int i = 0; i < num; i++) {
            
            for (int o = 0; o < num; o++) {
                
                //checking to see if this spot holds an 'M'
                if(N[i][o] == 'M') {
                    
                    //using two more for loops to go through all the spots 
                    //around the spot with 'M'
                    for (int p = i-1; p < i+2; p++) {
                        
                        for (int u = o-1; u < o+2; u++) {
                            
                            //checking to see if the spot being looked at is 
                            //within the array's bounds or if it doesn't have an
                            //'M' yet
                            if (p < 0 || p >= num || u < 0 || u >= num || N[p][u] == 'M') {}
                            else {
                                //bringing the value of all non-'M' spots up by 1
                                switch (N[p][u]) {
                                    case '7': N[p][u] = '8';
                                        break;
                                    case '6': N[p][u] = '7';
                                        break;
                                    case '5': N[p][u] = '6';
                                        break;
                                    case '4': N[p][u] = '5';
                                        break;
                                    case '3': N[p][u] = '4';
                                        break;
                                    case '2': N[p][u] = '3';
                                        break;
                                    case '1': N[p][u] = '2';
                                        break;
                                    default: N[p][u] = '1';
                                }
                            }
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }
        
    }
    
}