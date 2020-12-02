package StreamAPI.StreamModification;

import java.util.Arrays;
import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c", "d", "a", "b");

        strings.stream()
                .distinct()
                .forEach(System.out::println);

        strings.stream()
                .sorted()
                .forEach(System.out::println);

        strings.stream()
                .parallel()
                .forEach(System.out::println);
    }
}
