import java.util.Scanner;
class Account{
    int balance;
    Account(int balance){
        this.balance = balance;
    }
    void deposit(int amount){
        balance = balance + amount;
        System.out.println(balance);
    }
    void withdraw(int amount){
        if(amount>balance){
            System.out.println("Insufficient Balance");

        }else{
            balance = balance - amount;
            System.out.println(balance);
        }
    }
}

public class Q16 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int dep = sc.nextInt();
        int wd = sc.nextInt();
        Account acc = new Account(start);
        acc.deposit(dep);
        acc.withdraw(wd);

        System.out.println("Final Balance: "+ acc.balance);
          
    }
}
