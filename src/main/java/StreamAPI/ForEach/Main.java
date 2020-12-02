package StreamAPI.ForEach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.forEach(System.out::println);

        Map<Integer, Integer> num = new HashMap<>();
        num.put(1, 100);
        num.put(2, 200);
        num.put(3, 300);

        num.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
    }
}
