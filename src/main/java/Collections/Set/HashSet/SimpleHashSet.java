package Collections.Set.HashSet;

/*
    HashSet
 */

import Collections.Set.Methods.MethodsSet;

import java.util.HashSet;
import java.util.Set;

public class SimpleHashSet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();

        MethodsSet method = new MethodsSet();
        System.out.println("HashSet: ");

        System.out.println("Add: ");
        method.addMethod(hashSet);

        System.out.println("Get: ");
        method.getMethod(hashSet);

        System.out.println("Remove: ");
        method.removeMethod(hashSet);
    }
}
