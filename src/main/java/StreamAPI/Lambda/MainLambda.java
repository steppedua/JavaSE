package StreamAPI.Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainLambda {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("John", 28),
                new User("Jane", 35),
                new User("Alex", 21)
        );

        System.out.println("Before sort:");
        for (User user : users) {
            System.out.println(user);
        }

        Collections.sort(users, (o1, o2) -> o1.getAge() - o2.getAge());

        users.sort((o1, o2) -> o1.getAge() - o2.getAge());

        Comparator<User> comparator = (o1, o2) -> o1.getAge() - o2.getAge();
        users.sort(comparator.reversed());

    }
}
