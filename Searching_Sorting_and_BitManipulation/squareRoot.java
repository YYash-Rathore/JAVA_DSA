import java.util.Scanner;

public class squareRoot {
    public static int findSquareRoot(int num){
        int low = 0;
        int high = num;
        int result = -1;
        while(low<= high){
            int mid = (low+high)/2;
            long val = mid*mid;

            if(val == num){
                return mid;
            }
            else if(val < num){
                // Store the floor value, incase of not perfect square
                result = mid;
                low = mid +1;
            }
            else{
                high = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        // Function calling
        int result = findSquareRoot(num);
        System.out.println("Square root is: "+ result);
    }
}
