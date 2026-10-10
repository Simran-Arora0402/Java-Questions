import java.util.Scanner;
class array{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
       /* int[] arr = {12,23,56};
        System.out.println(arr[2]);

        int arr2[] = new int[3];
        arr2[0]=34;
        arr2[1]=25;
        System.out.println(arr2[1]);
    
    for(int i=0;i<arr2.length;i++){
    System.out.println(arr2[i]);
}*/
   //taking values from user
   int arr[] = new int[3];
   for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
   }
   for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
   }
   


}
}