import java.util.Scanner;
public class Q7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int totalDays = sc.nextInt();
        int daysPresent = sc.nextInt();
        double attendance = (double)daysPresent/totalDays * 100;
        System.out.println("Attendance:"+attendance+"%");
        
        if(attendance>=75){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
}
