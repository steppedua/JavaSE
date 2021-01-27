package FuncionalProgramming.Function.Predicate;

import FuncionalProgramming.Function.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Интерфейс Predicate имеет один метод test, который принимает параметр T t,
 * и определяет true or false
 **/
public class Predicatee {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ivan", "man", 12),
                new Student("PPNNs", "man", 16),
                new Student("Fkdklsdfl", "woman", 45),
                new Student("Akdfhklhfd", "man", 36),
                new Student("KJJK", "woman", 86),
                new Student("Sdfjsdgjk", "man", 23)
        );

        // Выведет тех, кто старше 30 лет
        testStudent(students, (Student p) -> p.getAge() > 30);


        Predicate<Student> p1 = student -> student.getName().equals("Ivan");
        Predicate<Student> p2 = student -> student.getAge() > 10;

        // Выведет тех, кто является Ivan и его возраст больше 10

        testStudent(students, p1.and(p2));

        // Выведет тех, кто является Ivan или его возраст больше 10
        testStudent(students, p1.or(p2));

        // Выведет по условию, что строчка > 1
        List<String> list = new ArrayList<>();
        list.add("awdqedef");
        list.add("b");
        list.add("dasdsac");
        list.add("d");
        list.removeIf(e -> e.length() > 1);
        System.out.println(list);
    }

    public static void testStudent(List<Student> students, Predicate<Student> predicate) {
        for (Student s : students) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}
