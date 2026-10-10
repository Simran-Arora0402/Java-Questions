import java.util.Scanner;

class Rectangle{
    int length , width;
    Rectangle(int length , int width){
        this.length = length;
        this.width = width;
    }
    int area(){
        return length * width;
    }
    int perimeter(){
        return 2 * (length + width);
    }

}
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        Rectangle r = new Rectangle(length,width);
        System.out.println("Area: "+ r.area());
        System.out.println("Perimeter: " +r.perimeter());
    }
}

