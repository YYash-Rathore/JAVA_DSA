import java.util.*;

public class q4 {
    public static int findSecoundMax(int [] arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            max = Math.max(max, arr[i]);
        }
        for(int i =0;i<n;i++){
            if(arr[i] != max){
            secMax = Math.max(secMax, arr[i]);
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of elements");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int result = findSecoundMax(arr);
        System.out.println("The Secound Maximum element is: "+result);
    }
}
