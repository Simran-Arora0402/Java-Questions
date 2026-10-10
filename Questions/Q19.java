import java.util.Scanner;

class Employee{
    String name;
    double basicSalary;

    Employee(String name , double basicSalary){
        this.name = name;
        this.basicSalary = basicSalary;
    }
    double calculateNetSalary(){
        return basicSalary + (basicSalary * 10/100);
    }
}
public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double basicSalary = sc.nextDouble();

        Employee emp = new Employee(name,basicSalary);
        System.out.println(name + " 's Net Salary : " + emp.calculateNetSalary());
    }
}

