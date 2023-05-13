import java.util.*;
public class q5 {
    public static void display(int [][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i][n/2] + "  "); 
        }   
         for(int j = 0 ; j < m ; j++){
            if(j == n/2)continue;
            System.out.print(arr[m/2][j] + "  ");
        }
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
        display(arr);
    }
}
