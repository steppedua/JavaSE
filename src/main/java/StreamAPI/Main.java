package StreamAPI;

import java.util.Arrays;
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


        developerStream
                .filter(developer -> developer.getLanguages().equals(developer.getLanguages()))
                .forEach(developer -> System.out.println(developer.getName()));
    }
}
