public class fibonacci_Series {

    // Using Recursion
    // public static int fib(int n){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     return fib(n-1)+fib(n-2);
    // }

    // Using top down App
    public static int fib(int n){
        int a = 0, b = 1, c = 0;
        if(n == 0){
            return a;
        }
        for(int i = 2; i<=n; i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }

    // Using Bottom up App
    public static int fibB(int n){
        int fibSeries[]= new int[n+1];
        // Initialize with -1
        for(int i = 0; i<=n; i++){
            fibSeries[i]=-1;
        }
        return fibBHelper(n, fibSeries);
    }
    public static int fibBHelper(int n, int [] fibSeries){
        if(n == 0 || n ==1){
            return n;
        }
        if(fibSeries[n]!= -1){
            return fibSeries[n];
        }
        int x = fibBHelper(n-1, fibSeries);
        int y = fibBHelper(n-2, fibSeries);

        fibSeries[n] = x+y;

        return fibSeries[n]; 
    }
    public static void main(String[] args) {
        int ans = fib(5);
        System.out.println(ans);

        int ans2 = fibB(6);
        System.out.println(ans2);
    }
}