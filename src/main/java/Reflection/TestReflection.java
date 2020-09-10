package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Reflection:
 * - реализовать свою собственную аннотацию,
 * при использовании которой можно вызвать некоторую бизнес-логику
 * (любую, которую вам захочется, самое простое вывод в консоль какой-то строки).
 */

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Scanner in = new Scanner(System.in);

        //Название_класса1, Название_класса2 Название_метода

        Class<Person> classObject1 = Person.class;
        Class<Person> classObject2 = Person.class;
        String methodName = in.next();

        Method m = classObject1.getMethod(methodName, classObject2);
        Object o1 = classObject1.newInstance();
        Object o2 = classObject1.getConstructor(String.class).newInstance("String value");

        m.invoke(o1, o2);

        System.out.println(o1);
        //src/main/java/Reflection/Person.java java.lang.String setName
    }
}
