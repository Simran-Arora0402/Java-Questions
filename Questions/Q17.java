
import java.util.Scanner;
public class Q17 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();
        switch(color){
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Get Ready");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Signal");
        }
    }
}
