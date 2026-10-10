import java.util.Scanner;
public class evenarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[2];
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            System.out.println("enter array element");
            arr[i] = sc.nextInt();
        }
        System.out.println("Even number:");

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" ");
                count+=1;
            }
        }
        System.out.println("count of even numbers:"+count);
        
        }
        
    }
    

