package InputOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleWrite {

    public void fileWrite(String fileName) {
        File file = new File("C:\\Users\\stepa\\IdeaProjects\\JavaSE\\src\\main\\java\\InputOutput\\" + fileName);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

            Scanner in = new Scanner(System.in);
            bw.write(in.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
