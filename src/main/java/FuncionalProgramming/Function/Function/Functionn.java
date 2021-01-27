package FuncionalProgramming.Function.Function;

import FuncionalProgramming.Function.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * FuncionalProgramming.Function - Принимает значение в качестве аргумента одного типа
 * и возвращает другое значение. Часто используется для преобразования одного значения в другое:
 */
public class Functionn {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ivan", "man", 12),
                new Student("PPNNs", "man", 16),
                new Student("Fkdklsdfl", "woman", 45),
                new Student("Akdfhklhfd", "man", 36),
                new Student("KJJK", "woman", 86),
                new Student("Sdfjsdgjk", "man", 23)
        );

        // Функция, которая принимает на вход студента и выводит его возраст
        Function<Student, Integer> studentIntegerFunction = student -> student.getAge();
        // Или так:
        Function<Student, Integer> studentIntegerFunction2 = student -> 10;

        int result1 = avgAge(students, studentIntegerFunction);

        //Или так: students, stud -> stud.getAge()
        int result2 = avgAge(students, stud -> stud.getAge());
        System.out.println(result2);
    }

    // Метод для нахождения среднего арифметического возраста всех студентов
    private static Integer avgAge(List<Student> studentsList, Function<Student, Integer> studentIntegerFunction) {
        Integer result = 0;

        for (Student s : studentsList) {
            result += studentIntegerFunction.apply(s);
        }

        result = result / studentsList.size();

        return result;
    }
}
