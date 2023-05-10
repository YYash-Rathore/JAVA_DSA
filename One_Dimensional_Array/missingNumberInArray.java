// Time Complexity : O(n)
// Space Complexity: O(1)

public class missingNumberInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,4,7,6,5};
        // Expected Output: 3
        int n = arr.length+1;
        int sumOfNaturalNo = (n*(n+1))/2;
        int sumOfArr = 0;
        for(int i = 0; i<arr.length;i++){
            sumOfArr += arr[i];
        }
        int missingNumber = sumOfNaturalNo - sumOfArr;
        System.out.println("Missing Number is: "+ missingNumber);
    }
}
