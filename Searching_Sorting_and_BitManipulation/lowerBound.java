import java.util.*;
public class lowerBound {
    public static int binarySearchLowerBound(int []arr, int key){
        int lb = 0;
        int ub = arr.length -1;
        int mid = 0;
        int result = -1;
        while(lb<=ub){
            mid = (lb+ub)/2;
            if(arr[mid]==key){
                result = mid;
                ub = mid - 1;
            }
            else if(arr[mid]>key){
                ub = mid - 1;
            }
            else{
                lb = mid + 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // Approach Binary Search
        int []arr = {2,4,7,7,9,9,9};
        int key = 7;
        int indx = binarySearchLowerBound(arr, key);
        if(indx == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("The first occurence of "+key+" is: "+indx);
        }
    }
}
