import java.util.HashMap;
import java.util.Map;

public class hashMapFunctions {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        // Functionality of put function
        hashMap.put(1, "Yash");
        hashMap.put(2, "Muskan");
        hashMap.put(3, "Tanya");
        hashMap.put(4, "Akash");

        System.out.println("HashMap of the given data is: "+hashMap);

        // Functionality of get function
        String result = hashMap.get(2);
        System.out.println("Value of given key is: "+result);

        // Functionality of Contains-key function
        System.out.println(hashMap.containsKey(2));

        // Functionality of remove function
        hashMap.remove(4);
        System.out.println("Updated HashMap: "+hashMap);

        // Iterating using for loop
        System.out.println("HashMap is:");
        for(Map.Entry<Integer,String>e:hashMap.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }    
}