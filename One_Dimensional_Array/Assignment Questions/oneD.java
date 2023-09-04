public class oneD {
    public static int sum(){
        int sum = 0;
        int [] arr = {3,20,4,6,9};
        int indx = 0;
        while (indx < arr.length) {
            sum += arr[indx];
            indx = indx +2;
        }
        return sum;
    }

    public static int findmax(){
        int max = 0;
        int arr[] = {4,3,6,7,1};
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void printMax(){
        int arr[] = {4,3,6,7,1};
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        System.out.println("Method2 Max Element is: "+max);
    }

    public static void printEven(){
        int arr[] = {34,21,54,65,43};
        for (int num : arr) {
            if(num%2 == 0){
                System.out.print(num+" ");
            }
        }
        System.out.println();
    }

    public static int secMax(){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int arr[] = {4,3,6,7,1};
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i = 0; i<arr.length;i++){
            if(arr[i]!= max){
                if(arr[i]>smax){
                    smax = arr[i];
                }
            }
        }
        return smax;
    }

    public static void printSecMax(){
        int arr[] = {4,3,6,7,1};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max,num);
        }
        for (int num : arr) {
            if(num!=max){
                smax = Math.max(smax, num);
            }
        }
        System.out.println("The Secound Max is: "+smax);
    }

    public static int peakELement(){
        int pe = 0;
        int arr[] = {1,3,2,6,5};
        for(int i =1; i<arr.length;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                pe = arr[i];
            }
        }
        return pe;
    }
    public static void main(String[] args) {
        // Assignment Question 1
        System.out.println("The Sum is :"+sum());

        // Assignment Question 2
        printEven();

        // Assignment Question 3 Method1
        System.out.println("The Max Element is:"+ findmax());
        // Assignment Question 3 Method2
        printMax();

        // Assignment Question 4 Mathod 1
        System.out.println("The Secound Max Element is: "+secMax());
        // Assignment Question 4 Mathod 2
        printSecMax();

        // Assignment Question 5
        System.out.println("The Peak Element is: "+peakELement());

    }
}