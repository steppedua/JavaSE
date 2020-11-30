package Optional_Java;

import JunitTestSystem.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MainOptional {
    public static void main(String[] args) {
        List<Client> clients = Arrays.asList(
                new Client(1, "John", 18),
                new Client(2, "Ted", 22),
                new Client(3, "Robert", 14)
        );

        System.out.println(new MainOptional().getClient(1, clients));
    }

    public Optional<Client> getClient(int username, List<Client> clients) {
        Optional<Client> client = Optional.ofNullable(clients.get(username));

        return Optional.ofNullable(client.get())
                .filter((c) -> c.getAge() >= 18);
    }
}

@Data
@AllArgsConstructor
class Client {
    private int id;
    private String username;
    private int age;
}