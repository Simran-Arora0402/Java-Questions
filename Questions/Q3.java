import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int price;
        if(age < 12 || age > 60){
             price = 100;
        }
        else{
             price = 200;
        }
        System.out.println("Ticket price: "+ price);    
    }
    
}
