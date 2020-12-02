package StreamAPI.Map;

import java.util.Arrays;
import java.util.List;

public class MainMap {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        numbers.stream()
                .map(i -> i * 2)
                .forEach(System.out::println);

        List<String> names = Arrays.asList("john", "arya", "sansa");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AM1111BE", 2009),
                new Car("AK5555IT", 2010),
                new Car("AI5601CC", 2015),
                new Car("AI3838PP", 2017));

        cars.stream()
                .map(Car::getNumber)
                .forEach(System.out::println);


        List<Car> carss = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));

        carss.stream()
                .filter(car -> car.getYear() > 2010)
                .map(Car::getNumber)
                .filter(car -> car != null && !car.isEmpty())
                .forEach(System.out::println);
    }
}
