import java.util.*;
public class q4 {
    public static int findMax(int [][] arr){
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int result = findMax(arr);
        System.out.println("The maximum element is: "+result);
    }
}
