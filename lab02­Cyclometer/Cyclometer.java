//Anthony Rivera
//Lab 02
//Cyclometer Java Program
//Program that measures the number of rotations a bicycle has and the time per rotation

public class Cyclometer {
    
    public static void main(String[] args) {
        
        //information recorded by the cyclometer
        int rotations1 = 1561;
        int rotations2 =9037;
        double time1 = 480;
        double time2 = 3220;
    
        //constants
        double wheel = 1.25;
        int feetPerMile = 5280;
        final double PI = 3.14159;
        
        //informing the user of the cyclometer's data
        System.out.println("Trip 1 took " + time1 + " seconds and had " +
            rotations1 + " rotations.");
        System.out.println("Trip 2 took " + time2 + " seconds and had " +
            rotations2 + "rotations.");
            
        //performing the calculations for distance using the number of rotations and
        //wheel diameter
        double trip1Dist = wheel*PI*rotations1;
        trip1Dist = trip1Dist/feetPerMile;
        double trip2Dist = wheel*PI*rotations2;
        trip2Dist = trip2Dist/feetPerMile;
        
        //printing out the distances in miles
        System.out.println("Trip 1 was " + trip1Dist + " miles.");
        System.out.println("Trip 2 was " + trip2Dist + " miles.");
        System.out.println("The total distance was " + (trip1Dist + trip2Dist) + 
            " miles.");
        
    }
    
}