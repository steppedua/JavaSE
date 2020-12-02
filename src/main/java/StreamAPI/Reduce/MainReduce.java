package StreamAPI.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class MainReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5);

        Integer reduce = numbers.stream()
                .reduce(10, (a, b) -> a + b);

        System.out.println(reduce);

        Integer reduce1 = numbers.stream()
                .reduce(10, (a, b) -> a * b, (c, d) -> c + d);

        System.out.println(reduce1);

        Integer min = numbers.stream()
                .reduce(Integer.MAX_VALUE, Integer::min);

        System.out.println(min);

        List<String> strings = Arrays.asList("aaa", "bbb", "ccc", "ddd", "ffff");

        String s = strings.stream()
                .reduce("", (left, right) -> left.length() > right.length() ? left : right);

        System.out.println(s);
    }
}
