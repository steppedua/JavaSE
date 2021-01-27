package FuncionalProgramming.Function.Consumer;


import FuncionalProgramming.Function.Student;
import FuncionalProgramming.Function.Supplier.Supplierr;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Consumer - потребитель имеет один метод, принимающий T - void accept(T t), является противоположностью Supplier.
 * Используется в случае, если необходимо передать объект на вход и
 * произвести над ним некоторые операции не возвращая результат.
 * Самый частый случай использования этого интерфейса - это вывод на консоль.
 */
public class Consumerr {

    public static void main(String[] args) {
// С помощью метода get() будет создано 3 одинаковых объекта
        ArrayList<Student> studentArrayList = Supplierr.createStudent(() ->
                new Student("Ivan", "man", 12));

        System.out.println(studentArrayList);

        changeStudent(studentArrayList.get(0), student -> {
            student.setName("Lovash");
            student.setAge(15);
            System.out.println("Student = " + student);
        });
    }

    public static void changeStudent(Student student, Consumer<Student> studentConsumer) {
        studentConsumer.accept(student);
    }
}
