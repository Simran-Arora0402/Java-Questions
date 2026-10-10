import java.util.Scanner;
class SavingsAccount{
    private double balance;
    SavingsAccount( double balance){
        this.balance = balance;
    }
    void deposit(double amount){
        balance = balance + amount;
    }
    double getBalance(){
        return balance;
    }
}

public class Q4 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double initialBalance = sc.nextDouble();
    double depositAmount = sc.nextDouble();
    SavingsAccount account = new SavingsAccount(initialBalance);
    account.deposit(depositAmount);
    System.out.println("New Balance:"+ account.getBalance());

   }
} 

