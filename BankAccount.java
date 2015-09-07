public class BankAccount {

    public static void main(String[] args) {
    
        double  balance = 3456.57;
        double interestRate = 0.03;
        int interest = (int)(3456.57*0.03);
        double balance1 = balance + interest;
        
        System.out.println("Your balance was " + balance + " dollars. Your new balance is " + balance1 + " dollars.");
        
        balance = balance1;
    
    }

}