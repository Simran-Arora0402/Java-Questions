import java.util.Scanner;
interface Discount{
    int calculateDiscount(int price);
}
class StudentDiscount implements Discount{
    public int calculateDiscount(int price){
        return (price*10) / 100;
    }
}
public class Q12 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        Discount d = new StudentDiscount();
        int discountAmount = d.calculateDiscount(price);
        int finalAmount = price - discountAmount;
        System.out.println(discountAmount);
        System.out.println(finalAmount);
    }
}
