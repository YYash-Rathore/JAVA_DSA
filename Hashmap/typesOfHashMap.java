import java.util.*;

public class typesOfHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String>map = new HashMap<>();
        map.put(1, "Yash");
        map.put(5, "Aditi");
        map.put(7, "Muskan");
        map.put(2, "Tanya");
        map.put(6, "Ashu");

        System.out.println("HashMap is:"+map);

        LinkedHashMap<Integer,String>map2 = new LinkedHashMap<>();
        map2.put(1, "Yash");
        map2.put(5, "Aditi");
        map2.put(7, "Muskan");
        map2.put(2, "Tanya");
        map2.put(6, "Ashu");

        System.out.println("LinkedHashMap is:"+map2);

        TreeMap<Integer,String>map3 = new TreeMap<>();
        map3.put(1, "Yash");
        map3.put(5, "Aditi");
        map3.put(7, "Muskan");
        map3.put(2, "Tanya");
        map3.put(6, "Ashu");

        System.out.println("TreeMap is:"+map3);
    }
}
