package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteObject {
    private static final String FILE_SRC = "C:\\Users\\stepa\\OneDrive\\Рабочий стол\\SE\\src\\main\\java\\Serialization\\simpleSerialization.bin";

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jack", 69));
        persons.add(new Person("Tom", 33));
        persons.add(new Person("Sam", 21));
        persons.add(new Person("Jacob", 16));
        persons.add(new Person("Sandi", 5));
        persons.add(new Person("Lindi", 2));

        SimpleSerialization simpleSerialization = new SimpleSerialization();

        persons.forEach(simpleSerialization::personSerialization);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_SRC))) {

            oos.writeObject(persons);

            System.out.println("Serialization was successful!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
