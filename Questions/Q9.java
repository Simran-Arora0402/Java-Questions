import java.util.Scanner;

class Student{
    String name;
    int marks;

    Student(String name , int marks){
        this.name = name;
        this.marks = marks;
    }

    String result(){
        if(marks>=40){
            return "Pass";
        }else{
            return "Fail";
        }
    }

}
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int marks = sc.nextInt();
        Student s = new Student(name,marks);
        System.out.println(s.result());
        
    }
}

