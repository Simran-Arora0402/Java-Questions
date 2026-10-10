import java.util.Scanner;
class array2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int arr[] = new int[2];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the " + i +  " array element:");

            arr[i]=sc.nextInt();

            sum = sum+arr[i];
        }
        System.out.println("sum="+sum);
    }
}
