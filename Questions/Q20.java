import java.util.Scanner;

class Device{
    String brandName;

}
class SmartBulb extends Device{
    int wattage;
    SmartBulb(String brandName,int wattage){
        this.brandName = brandName;
        this.wattage = wattage;
    }
        void printConfiguration(){
            System.out.println("Device Brand :"+ brandName);
            System.out.println("Power Rating:"+ wattage + "W");
        }

    }

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brandName = sc.nextLine();
        int wattage = sc.nextInt();
        SmartBulb bulb = new SmartBulb(brandName , wattage);
        bulb.printConfiguration();
    }
}
    

