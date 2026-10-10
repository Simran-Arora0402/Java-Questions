import java.util.Scanner;
abstract class Vehicle{
    abstract int rentPricePerDay();
}

class Car extends Vehicle{
    int rentPricePerDay(){
        return 1500;
    }
}

public class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        
        Vehicle car = new Car();
        int totalRent = car.rentPricePerDay() * days;

        System.out.println(totalRent);
        }
    }


