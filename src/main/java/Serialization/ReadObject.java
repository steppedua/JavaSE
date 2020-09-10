package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObject {
    private static final String FILE_SRC = "C:\\Users\\stepa\\OneDrive\\Рабочий стол\\SE\\src\\main\\java\\Serialization\\simpleSerialization.bin";

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(FILE_SRC);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            ArrayList<Person> person = (ArrayList<Person>) ois.readObject();

            System.out.println(person);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
