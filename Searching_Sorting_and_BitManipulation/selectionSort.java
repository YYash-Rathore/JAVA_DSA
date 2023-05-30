import java.util.Arrays;

public class selectionSort {
    public static void SelectionSort(int [] arr){
        int min_idx;
        for(int i = 0;i< arr.length;i++){
            min_idx = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }
            if(min_idx!=i){
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {20, 50, 10, 15, 17, 25, 65};
        SelectionSort(arr);
        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(arr));
    }
}
