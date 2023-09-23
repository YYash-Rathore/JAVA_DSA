public class stairCaseProblem {
    public static int countWays(int n){
        int prev1 = 1, prev2 = 1, current;
        for(int i =  2; i<=n; i++){
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
    public static void main(String[] args) {
        System.out.println("For n = 1 we have "+countWays(1)+" ways");
        System.out.println("For n = 2 we have "+countWays(2)+" ways");
        System.out.println("For n = 3 we have "+countWays(3)+" ways");
        System.out.println("For n = 4 we have "+countWays(4)+" ways");
    }
}
