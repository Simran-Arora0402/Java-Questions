import java.util.Scanner;
public class diagonal2D {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0 ; i<n; i++){
            System.out.println(arr[i][i] + " " );
        
        }
    }
}
