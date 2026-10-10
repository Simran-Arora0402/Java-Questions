import java.util.Scanner;

public class largest_element2D {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][2];
        int max = arr[0][0];

        for(int i=0; i<2 ; i++){
            for(int j=0; j<2; j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
                
            }
        }
        
        System.out.println("The largest number is:"+max);
        
    }
}
