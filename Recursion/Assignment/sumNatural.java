package Assignment;

public class sumNatural {
    public static int naturalSum(int n){
        int sum = 0;
        for(int i = 1; i<= n; i++){
            if(i%2 == 0){
                sum = sum - n;
            }
            else {
                sum = sum + n;            
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 10;
        int ans = naturalSum(n);
        System.out.println("The sum is :"+ans);
    }
}
