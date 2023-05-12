import java.util.*;
public class q2 {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        for (int elem : arr) {
            if (elem % 2 == 0)
                System.out.println(elem);
        }
    }
}
