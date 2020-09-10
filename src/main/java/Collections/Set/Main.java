package Collections.Set;

import Collections.List.Methods.Methods;
import Collections.Set.Methods.MethodsSet;

import java.util.Set;
import java.util.TreeSet;

/**
 * Коллекции. Задачи:
 * - Исследовать работу ArrayList, LinkedList, TreeSet, HashSet.
 * На практике измерить время выполнения операций добавления, поиска и удаления элемента.
 * Сравнить полученные результаты и объяснить, в каком случае какая коллекция работает быстрее.
 */

public class Main {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();

        System.out.println("TreeSet: ");
        MethodsSet method = new MethodsSet();

        System.out.println("Add: ");
        method.addMethod(treeSet);

        System.out.println("Get: ");
        method.getMethod(treeSet);

        System.out.println("Remove: ");
        method.removeMethod(treeSet);
    }
}
