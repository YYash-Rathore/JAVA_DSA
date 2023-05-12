import java.util.*;
public class q5 {
    public static int findPeak(int [] arr){
        int pe = 0;
        int n = arr.length-1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                pe = arr[i];
            }
        }
        return pe;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of elements");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int result = findPeak(arr);
        System.out.println("The Peak Element is: "+ result);
    }
}
