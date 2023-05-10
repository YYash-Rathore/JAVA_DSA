package Recursion;

import java.util.Scanner;

public class factorialFind {
    public static int factorialFinding(int n){
        int result = 0;
        if(n==0 || n==1){
            return 1;
        }
        else{
            result = n*factorialFinding(n-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = factorialFinding(n);
        System.out.println("The Factorial is: "+factorial);
    }    
}