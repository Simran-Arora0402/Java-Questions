import java.util.Scanner;
class BankAccount{
    private double balance;
    BankAccount(double balance){
        this.balance = balance;
    }
    void deposit(double amount){
        balance = balance + amount;
    }
    void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance = balance - amount;
        }
    }
    double getBalance(){
        return balance;
    }
}

public class Q2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        int n = sc.nextInt();
        BankAccount account = new BankAccount(balance);

        for(int i=1;i<=n;i++){
            char operation = sc.next().charAt(0);
            double amount = sc.nextDouble();

            if(operation == 'D'){
                account.deposit(amount);
            }else if(operation == 'W'){
                account.withdraw(amount);
            }
        }
        System.out.println("Final Balance :"+ account.getBalance());    
    }
}


