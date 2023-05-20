import java.util.*;
public class binarySearch {
    public static int binarySearchIndex(int [] arr, int a){
        int low = 0;
        int high = arr.length-1;
        while(low<= high){
            int mid = (low+high)/2;
            if(arr[mid]==a){
                return mid;
            }
            else if(arr[mid]>a){
                high = mid -1;
            }
            else if(arr[mid]<a){
                low = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements present in an Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Array in Sorted format(low to high):");
        int [] arr = new int [n];
        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element you want to search: ");
        int a = sc.nextInt();
        int result = binarySearchIndex(arr, a);
        if(result == -1){
            System.out.println("Element not Found");
        }
        else{
            System.out.println("Index: "+result);
        }
    }
}
