import java.util.Scanner;
public class Q6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<12){
            System.out.println("Category: Senior Citizen");
            System.out.println("Price: 100");
        }
        else if(age>=12 && age <=59){
            System.out.println("Category: Adult");
            System.out.println("Price: 250");
        }
        else{
            System.out.println("Catgeory: Senior Citizen");
            System.out.println("Price: 150");  
        }
    }
    
}
