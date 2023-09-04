public class twoD {
    public static void printFollowing(){
        int positive = 0;
        int negative = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;
        int [][]arr = {{1,2,-3,4},
                       {0,0,-4,2}, 
                       {1,-1,2,3}, 
                       {-4,-5,-7,0}};
        for(int i=0;i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                if(arr[i][j]==0){
                    zero++;
                }
                if(arr[i][j]>0){
                    positive++;
                }
                if(arr[i][j]<0){
                    negative++;
                }
                if(arr[i][j]%2==0){
                    even++;
                }
                if(arr[i][j]%2!=0){
                    odd++;
                }
            }
        }  
        System.out.println("Positive: "+positive);              
        System.out.println("Negative: "+negative);              
        System.out.println("Even: "+even);              
        System.out.println("Odd: "+odd);              
        System.out.println("Zero: "+zero);              
    }

    public static void printSecDiagnol(){
        int arr[][] = {{1,2,3,1},
                       {4,5,6,1},
                       {7,8,9,1},
                       {1,1,1,1}};
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(i+j<arr.length-1){
                    System.out.print(arr[i][j]+ " ");
                }
            }
        }
    }

    public static void printDiagnol(){
        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                if(i==j || i+j==arr.length-1){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }

    public static void findmax(){
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The Max Element is: "+max);
    }

    public static void printMiddle(){
        int arr[][] = {{1,2,3,4,5},{3,4,5,6,7},{7,6,5,4,3,},{8,7,6,5,4},{1,2,37,8,0}};
        int midRow = (arr.length/2);
        int midCol = (arr[0].length/2);
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                if(j == midCol){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                if(i == j){
                    continue;
                }
                if(i == midRow){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        // Question 1
        printFollowing();

        // Quesction 2
        printSecDiagnol();
        System.out.println();

        // Quesction 3
        printDiagnol();
        System.out.println();

        // Question 4
        findmax();
        System.out.println();

        // Question 5
        printMiddle();
    }
}
