class Shape{
    public double area(){
        return 0;
    }
}
class Circle extends Shape{
    double radius = 5;
    public double area(){
        return 3.14 * radius * radius;
    }
}
class Rectangle extends Shape{
    double length = 10;
    double breadth = 15;
    public double area(){
       return length * breadth;
    }
}
class Triangle extends Shape{
    double base = 8;
    double height = 6;
    public double area(){
    return 0.5 * base * height;
    }
}
public class Main{
    public static void main(String[]args){
        Shape s = new Circle();
        System.out.println(s.area());
    }
}