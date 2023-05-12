import java.util.*;
class q3{
    public static int findMax(int [] arr){
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of elements");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int result = findMax(arr);
        System.out.println("Maximum element is: "+result);
    }
}