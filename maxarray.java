import java.util.Scanner;
public class maxarray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    
}
