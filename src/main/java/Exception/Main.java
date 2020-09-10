package Exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            List<Integer> array = new ArrayList<>();

            System.out.println("Введите значение размера листа:");

            SizeCheck size = new SizeCheck();
            size.setSizeArray(array, in.nextInt());

            System.out.println(array.toString());
        } catch (ArrayListException e) {
            e.printStackTrace();
        }

    }
}
