package InputOutput;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public void addFile(String fileName) {

        try {
            File file = new File("C:\\Users\\stepa\\IdeaProjects\\JavaSE\\src\\main\\java\\InputOutput\\" + fileName);

            if (file.createNewFile()) {
                System.out.println("Файл " + fileName + " был создан в корневой папке проекта");
            } else {
                System.out.println("Файл " + fileName + " не был создан в корневой папке проекта");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
