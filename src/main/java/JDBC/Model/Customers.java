package JDBC.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customers {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;

    public Customers(Integer id, Integer age) {
        this.id = id;
        this.age = age;
    }
}
