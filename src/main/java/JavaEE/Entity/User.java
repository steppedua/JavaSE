package JavaEE.Entity;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 4603757618883653323L;

    private String name;
    private int age;

    public User() {
        this.name = "";
        this.age = 0;
    }
    public User(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
