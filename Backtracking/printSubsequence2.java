public class printSubsequence2 {
    public static void printSubsequence(String input, String output){
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        // Don't Include
        printSubsequence(input.substring(1), output);
        // Include
        printSubsequence(input.substring(1), output+input.charAt(0));
    }
    public static void main(String[] args) {
        String str = "XY";
        printSubsequence(str, "");
    }
}
