final class Student{
    final int x;
    final void display(){
        x = 20;
    }
}
class fin extends Student{
    void display(){

    }
public static void main(String[]args){
    Student s = new Student();
    s.display();
}
