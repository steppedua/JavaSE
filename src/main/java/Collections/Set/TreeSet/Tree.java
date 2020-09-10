package Collections.Set.TreeSet;

import java.util.List;

public interface Tree<E> extends Iterable<E> {
    boolean add(E e);
    List<E> getAllElementsLeafTree();
    int size();
    SimpleTree.Leaf find(E e);
}
