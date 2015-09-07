//Anthony Rivera
//HW 02
//Arithmetic Program
//Program that computes the total cost of a sale, including sales tax

public class Arithmetic {
    
    public static void main(String[] args) {
        
        //declaring the number of each fruit that was bought
        int bananas = 12;
        int apples = 6;
        int grapes = 78;
        int kiwis = 4;
        
        //declaring the prices of each fruit
        double bCost = 0.45;
        double aCost = 0.38;
        double gCost = 0.04;
        double kCost = 0.21;
        
        //declaring the tax rate
        double tax = 0.06;
        
        //calculating the total cost without taxes
        double totalNoTax = bCost*bananas + aCost*apples + gCost*grapes + kCost*kiwis;
        
        //calculating the total cost with taxes
        int totalTaxed1 = (int)((totalNoTax + totalNoTax*tax)*100);
        double totalTaxed = (double)(totalTaxed1)/100;
        
        //telling the user the total price with and without taxes
        System.out.println("The total non-taxed price of your Walmart groceries is $" +
            totalNoTax + "\n and the total taxed price is $" + totalTaxed + ".");
        
    }
    
}