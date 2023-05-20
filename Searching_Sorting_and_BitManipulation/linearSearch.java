import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements present in an Array: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element you want to search: ");
        int a = sc.nextInt();
        int indx = -1;
        for(int i = 0;i<n;i++){
            if(arr[i]==a){
                indx = i;
            }
        }
        if(indx == -1){
            System.out.println("Element not Found");
        }
        else{
            System.out.println("Index: "+indx);
        }
    }
}
