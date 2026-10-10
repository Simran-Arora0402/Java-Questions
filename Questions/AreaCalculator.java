import java.util.Scanner;

 class AreaCalculator{
    //for square
    double area(double side){
        return side*side;
    }
    //for rectangle
    double area(double length, double breadth){
        return length*breadth;
    }
    double area(double radius,char type){
        return Math.PI * radius * radius;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.next();

        AreaCalculator obj = new AreaCalculator();
        if(shape.equals("SQUARE")){
            double side = sc.nextDouble();
            System.out.printf("Area:%.2f",obj.area(side));

        }
        else if(shape.equals("RECTANGLE")){
            double length = sc.nextDouble();
            double breadth = sc.nextDouble();
            System.out.printf("Area:%.2f",obj.area(length,breadth));

        }
        else if(shape.equals("CIRCLE")){
            double radius = sc.nextDouble();
            System.out.printf("Area:%.2f",obj.area(radius,'C'));

        }
    }
}

 