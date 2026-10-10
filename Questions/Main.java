import java.util.Scanner;

class Student{
    private int marks;

    void setMarks(int marks){
        if (marks>=0 && marks<= 100){
            this.marks = marks;
        }
        
        else {
        this.marks = 0;
    }
}

int getMarks(){
    return marks;
}
}

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int marks= sc.nextInt();
        Student student = new Student();
        student.setMarks(marks);
        System.out.println(student.getMarks());
}
}