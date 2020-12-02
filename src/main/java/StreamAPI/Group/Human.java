package StreamAPI.Group;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Human {
    private String name;
    private String surname;
    private int friendsAmount;
}
