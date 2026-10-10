import java.util.Scanner;
class Student {
    String name;
    int roll;
    int marks;
}
public class ArrDetail{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[3];
        for (int i = 0; i < 3; i++) {
            s[i] = new Student();
            System.out.print("Enter name: ");
            s[i].name = sc.next();
            System.out.print("Enter roll: ");
            s[i].roll = sc.nextInt();
            System.out.print("Enter marks: ");
            s[i].marks = sc.nextInt();
        }
       
        int high=s[0].marks;
        int temp=0;
        for (int i = 1; i < 3; i++) {
            if (s[i].marks > high) {
                high=s[i].marks;
                temp=i;
            }
        }
 System.out.println("Name: "+s[temp].name+" Roll no: "+s[temp].roll+" Marks: "+s[temp].marks);
    }
}


