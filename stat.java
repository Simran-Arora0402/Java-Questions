class Student{
    int id;
    static String college = "kiet";
    Student(int id){
        this.id = id;
    }
    public static void show(){
        System.out.println("Hello student");
    }
}
class stat{
    public static void display(){
        System.out.println("Hello java");
    }
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(2);
        System.out.println(s1.id +" "+Student.college);
        System.out.println(s2.id+" "+Student.college);
        Student.show();
        display(); 
    }
}

