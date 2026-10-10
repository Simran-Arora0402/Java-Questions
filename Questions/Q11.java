import java.util.Scanner;
class AreaCalculator{
    double area(double side){
        return side*side;
    }
    double area(double length , double breadth){
        return length*breadth;
    }
    double area(double radius,char type){
        return 3.14*radius*radius;
    }
}
public class Q11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();
        AreaCalculator calc = new AreaCalculator();

        if(shape.equals("Square")){
            double side = sc.nextDouble();
            System.out.printf("Area:%.2f",calc.area(side));

        }
        else if(shape.equals("Rectangle")){
            double length = sc.nextDouble();
            double breadth = sc.nextDouble();
            System.out.printf("Area:%.2f",calc.area(length,breadth));

        }
        else if(shape.equals("Circle")){
            double radius = sc.nextDouble();
            System.out.printf("Area:%.2f",calc.area(radius,'C'));
        }
    }
    
}
