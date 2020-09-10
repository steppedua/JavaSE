package Exception;

import java.util.List;

public class SizeCheck {

    public void setSizeArray(List<Integer> array, int sizeArray) throws ArrayListException {

        for (int i = 0; i < sizeArray; i++) {
            array.add(i);
        }

        if (array.size() > 10) {
            throw new ArrayListException();
        }

        System.out.println("Размер листа: " + array.size());
    }
}
