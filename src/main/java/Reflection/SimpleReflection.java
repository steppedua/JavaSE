package Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Reflection:
 * - реализовать свою собственную аннотацию,
 * при использовании которой можно вызвать некоторую бизнес-логику
 * (любую, которую вам захочется, самое простое вывод в консоль какой-то строки).
 */

public class SimpleReflection {
    public static void main(String[] args) {

        Class<Person> personClass = Person.class;

        //Получение методов класса
        Method[] methods = personClass.getMethods();

        for (Method method : methods) {
            System.out.println(method.getName() + ", " + method.getReturnType() + ", " + Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("---------------------------------------");

        //Получение приватных полей
        Field[] fields = personClass.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName() + ", " + field.getType());
        }

        System.out.println("---------------------------------------");

        //Принадлежит ли аннотация интерфейсу Author
        Annotation[] annotations = personClass.getAnnotations();

        for (Annotation annotation : annotations) {
            if (annotation instanceof Author) {
                System.out.println("Yes instance");
            } else {
                System.out.println("No instance");
            }
        }

    }
}
