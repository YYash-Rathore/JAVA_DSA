import java.util.Scanner;

public class fibonacciFind {
    public static int fibonacciFinding(int n){
        int result = 0;
        if(n<=1){
            return n;
        }
        else{
            result = fibonacciFinding(n-2) + fibonacciFinding(n-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number in fibonacci series: ");
        int n = sc.nextInt();
        int result = fibonacciFinding(n);
        System.out.println("The result of nth fibonacci number is: "+result);
    }
}
