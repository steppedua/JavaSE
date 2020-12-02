package StreamAPI.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainFlatMap {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Sam", Arrays.asList("Buddy", "Lucy")),
                new Human("Bob", Arrays.asList("Frankie", "Rosie")),
                new Human("Marta", Arrays.asList("Simba", "Tilly")));

        List<String> petNumbers = humans.stream()
                .flatMap(pets -> pets.getPets().stream())
                .collect(Collectors.toList());

        System.out.println(petNumbers);

        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};

        int[] newArr = Arrays.stream(arr)
                .flatMapToInt(i -> Arrays.stream(i))
                .toArray();

        System.out.println(Arrays.toString(newArr));
    }
}
