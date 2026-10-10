import java.util.Scanner;
public class sum2D {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][2];
        int sum = 0;
        System.out.println("Enter four elements:");        
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                 arr[i][j] = sc.nextInt();
                 sum = sum+arr[i][j];
            }
            }

            
            System.out.println("Sum of the 2d array is:"+ sum);
            
            
        }
        
        
    }

