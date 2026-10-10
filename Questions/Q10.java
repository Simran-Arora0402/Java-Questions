import java.util.Scanner;

abstract class Animal{
    abstract void makeSound();
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("Meow");
    }
}
class Cow extends Animal{
    void makeSound(){
        System.out.println("Moo");
    }
}


public class Q10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Animal a;
        if(name.equals("Dog")){
             a = new Dog();
        }
        else if(name.equals("Cat")){
            a = new Cat();
        }
        else {
            a = new Cow();
        }
        a.makeSound();
    }
   
    
 }

