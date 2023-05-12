import java.util.Scanner;

public class q1{
    public static int sum(int []arr){
        int sum = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(i%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        // Sum of Even indices
        int result = sum(arr);
        System.out.println("The Sum of even indices is: "+result);
    }
}