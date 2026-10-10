class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(this.age=age);
    }
    public void printInfo(String name,int age){
        System.out.println(name + " " + age);
    }
}

public class poly {
    public static void main(String[]args){
        Student s1 = new Student();
        s1.printInfo("Simran");
        s1.printInfo(22);
        s1.printInfo("Simran",22);

    }
}
