package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * - Поменять местами ключи и значения в HashMap.
 */

public class ReverseHashMap {
    public static void main(String[] args) {
        Map<String, String> stringHashMap = new HashMap<>();

        stringHashMap.put("1", "a");
        stringHashMap.put("2", "b");
        stringHashMap.put("3", "c");

        ReverseHashMap map = new ReverseHashMap();
        System.out.println(map.reverseHashMap(stringHashMap));
    }

    private HashMap<String, String> reverseHashMap(Map<String, String> map) {
        HashMap<String, String> reverseHashMap = new HashMap<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            reverseHashMap.put(entry.getValue(), entry.getKey());
        }

        return reverseHashMap;
    }
}
