import java.util.Scanner;
public class addmatrices2D {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int arr1[][] = new int[n][n];
        int arr2[][] = new int[n][n];

        System.out.println("Taking input for first matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Taking input for second matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Adding two matrices");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                System.out.print(arr1[i][j] + arr2[i][j]);
            }
            System.out.println();
    }
        }
        
    }

