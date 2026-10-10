class Shape{
    public void displayArea(){
        System.out.println("Display Area");
    }
}
class Triangle extends Shape{
    public void displayArea(int l,int h){
        System.out.println(0.5*l*h);
    }
}

class EquilateralTriangle extends Triangle{
    public void displayArea(){
        System.out.println("All the three sides of this triangle are equal");
    }

}
    
public class inherit {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.displayArea(12,15);
        EquilateralTriangle equi = new EquilateralTriangle();
        equi.displayArea(12,15);
        }
}

