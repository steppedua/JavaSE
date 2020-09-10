package Collections.List.Methods;

import java.util.List;

public class Methods {
    public void addMethod(List<Integer> lists) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            lists.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Конец: " + end + " ms");
        System.out.println("Старт: " + start + " ms");
        System.out.println("Разница: " + (end - start) + " ms \n");
    }

    public void getMethod(List<Integer> lists) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            lists.get(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Конец: " + end + " ms");
        System.out.println("Старт: " + start + " ms");
        System.out.println("Разница: " + (end - start) + " ms \n");
    }

    public void removeMethod(List<Integer> lists) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < lists.size(); i++) {
            lists.remove(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Конец: " + end + " ms");
        System.out.println("Старт: " + start + " ms");
        System.out.println("Разница: " + (end - start) + " ms \n");

    }
}
