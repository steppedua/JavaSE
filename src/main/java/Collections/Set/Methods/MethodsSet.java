package Collections.Set.Methods;

import java.util.Set;

public class MethodsSet {
    public void addMethod(Set<Integer> set) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Старт: " + start + " ms");
        System.out.println("Конец: " + end + " ms");
        System.out.println("Разница: " + (end - start) + " ms \n");
    }

    public void getMethod(Set<Integer> set) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < set.size(); i++) {
            set.contains(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Старт: " + start + " ms");
        System.out.println("Конец: " + end + " ms");
        System.out.println("Разница: " + (end - start) + " ms \n");
    }

    public void removeMethod(Set<Integer> set) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < set.size(); i++) {
            set.remove(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Старт: " + start + " ms");
        System.out.println("Конец: " + end + " ms");
        System.out.println("Разница: " + (end - start) + " ms \n");

    }
}
