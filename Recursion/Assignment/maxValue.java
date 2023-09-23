package Assignment;

public class maxValue {
    public static int maxFind(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int sumFind(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }    
    public static void main(String[] args) {
        int[] arr = {13, 1, -3, 22, 5};
        int ans1 = maxFind(arr);
        int ans2 = sumFind(arr);
        System.out.println("The ans is :"+ans1);
        System.out.println("The sum is :"+ans2);
    }
}
