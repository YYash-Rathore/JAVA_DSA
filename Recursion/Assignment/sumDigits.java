package Assignment;

public class sumDigits{
    public static int findSum(int num){
        int sum = 0;
        int rem = 0;
        while(num!=0){
            rem = num%10;
            sum += rem;
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 1234;
        int sum = findSum(num);
        System.out.println("The sum is :"+sum);
    }
}