package InputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SimpleRead {

    public void fileRead(String fileName) {
        File file = new File("C:\\Users\\stepa\\IdeaProjects\\JavaSE\\src\\main\\java\\InputOutput\\" + fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            int c;

            while ((c = br.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
