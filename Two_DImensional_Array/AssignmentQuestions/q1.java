import java.util.*;
public class q1 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int zero = 0;
        int pn = 0;
        int nn = 0;
        int even = 0;
        int odd = 0;
        int [][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    zero++;
                    even++;
                }
                else if(arr[i][j]>0){
                    pn++;
                    if(arr[i][j]%2==0){
                        even++;
                    }
                    else{
                        odd++;
                    }
                }
                else if(arr[i][j]<0){
                    nn++;
                    if(arr[i][j]%2==0){
                        even++;
                    }
                    else{
                        odd++;
                    }
                }
            }
        }
        System.out.println("Positive numbers:"+pn);
        System.out.println("Negative Numbers:"+nn);
        System.out.println("Even Numbers:"+even);
        System.out.println("Odd Numbers:"+odd);
        System.out.println("Zero Numbers:"+zero);
    }
}
