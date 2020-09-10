package Generics;

import java.util.ArrayList;
import java.util.List;

/*
    PECS (Producer extends, Consumer super)
 */

public class Generics2<T> {
    public void copy(List<? extends T> src, List<? super T> dst) {
        dst.addAll(src);
    }

    public static void main(String[] args) {
        Generics2<Number> generics = new Generics2<>();

        List<Integer> src = new ArrayList<>();
        src.add(1);
        src.add(1);
        src.add(1);

        List<Number> dst = new ArrayList<>();

        generics.copy(src, dst);

        System.out.println(dst.size());
    }
}

class Generics01 {
}

class F extends Generics01 {
}
