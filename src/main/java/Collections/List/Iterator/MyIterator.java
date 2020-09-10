package Collections.List.Iterator;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private T[] objects;
    private int index = 0;

    public MyIterator(T[] objects) {
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        return index < objects.length;
    }

    @Override
    public T next() {
        return objects[index++];
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;

        MyIterator<Integer> iterator = new MyIterator<>(integers);

        while (iterator.hasNext()){
            Integer i = iterator.next();
            System.out.println(i);
        }
    }
}
