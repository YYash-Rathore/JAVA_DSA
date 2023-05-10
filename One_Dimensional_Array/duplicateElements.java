// Time Complexity: O(n*n)
// Space Complexity: O(1)

public class duplicateElements {
    public static void main(String[] args) {
        int[] arr = {2,4,4,7,10};
        // Expected Output : 4
        int n = arr.length;
        for(int i =0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
