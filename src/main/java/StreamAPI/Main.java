package StreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Задача - найти разработчиков с уникальными языками программирования, используя Stream API.
 * Для данного примера ожидаемый результат [Наташа, Элла].
 **/
public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Наташа", Arrays.asList("Java", "C++"));
        Developer dev2 = new Developer("Эрнест", Arrays.asList("Java", "Python"));
        Developer dev3 = new Developer("Элла", Arrays.asList("С#", "Python", "JavaScript"));
        Stream<Developer> developerStream = Stream.of(dev1, dev2, dev3);

        developerStream(developerStream);

    }

    private static void developerStream(Stream<Developer> developerStream) {
        developerStream.flatMap(developer -> developer.getLanguages().stream()
                .collect(Collectors.toMap(Function.identity(), e -> developer.getName())).entrySet().stream())
                .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.mapping(Map.Entry::getValue, Collectors.toList())))
                .values().stream().filter(strings -> strings.size() == 1).map(strings -> strings.get(0)).collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
