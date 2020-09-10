package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("A", "A");
        map.put("B", "B");
        map.put("C", "C");

        System.out.println(map.containsKey("A"));
        System.out.println(map.containsValue("D"));
        System.out.println(map.containsValue("C"));
        System.out.println(map.size());

        System.out.println(map.remove("A"));
    }
}
