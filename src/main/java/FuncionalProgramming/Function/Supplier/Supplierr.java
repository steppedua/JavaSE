package FuncionalProgramming.Function.Supplier;

import FuncionalProgramming.Function.Student;

import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * Supplier - поставщик, принимает метод T get() и возвращает T,
 * Интерфейс Supplier используется тогда,
 * когда на вход не передаются значения, но необходимо вернуть результат.
 */
public class Supplierr {
    public static void main(String[] args) {

        // С помощью метода get() будет создано 3 одинаковых объекта
        ArrayList<Student> studentArrayList = createStudent(() ->
                new Student("Ivan", "man", 12));

        System.out.println(studentArrayList);
    }

    public static ArrayList<Student> createStudent(Supplier<Student> studentSupplier) {

        // Метод, поставляющий объекты studentSupplier
        ArrayList<Student> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.add(studentSupplier.get());
        }
        return arrayList;
    }
}
