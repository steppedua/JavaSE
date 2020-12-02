package StreamAPI.Collect;

import java.util.*;
import java.util.stream.Collectors;

public class MainCollect {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> eventNumbers = numbers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(eventNumbers);

        List<String> names = Arrays.asList("John", "Arya", "Sansa");
        Set<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println(upperCaseNames);

        List<String> namess = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");

        Queue<String> queue = namess.stream()
                .filter(n -> !n.isEmpty())
                .collect(Collectors.toCollection(() -> new LinkedList<>()));

        System.out.println(queue);
    }
}
