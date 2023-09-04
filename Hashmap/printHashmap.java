import java.util.HashMap;

public class printHashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> obj = new HashMap<>();
        obj.put(1,"ABC");
        obj.put(2,"dEF");
        obj.put(3,"FGH");
        obj.put(4,"IJK");
        obj.put(5,"LMN");

        System.out.println("Hashmap is :"+obj);
    }
}