package Collections.List;

import Collections.List.Methods.Methods;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Коллекции. Задачи:
 * - Исследовать работу ArrayList, LinkedList, TreeSet, HashSet.
 * На практике измерить время выполнения операций добавления, поиска и удаления элемента.
 * Сравнить полученные результаты и объяснить, в каком случае какая коллекция работает быстрее.
 */

public class MainList {
    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();
        System.out.println("LinkedList: ");
        MainList mainList1 = new MainList();
        mainList1.checkListSpeed(linkedList);

        List<Integer> arrayList = new ArrayList<>();
        System.out.println("ArrayList: ");
        MainList mainList2 = new MainList();
        mainList2.checkListSpeed(arrayList);

    }

    private void checkListSpeed(List<Integer> list) {
        Methods methods = new Methods();

        System.out.println("Add: ");
        methods.addMethod(list);

        System.out.println("Get: ");
        methods.getMethod(list);

        System.out.println("Remove: ");
        methods.removeMethod(list);
    }
}
