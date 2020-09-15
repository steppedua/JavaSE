package InputOutput;

import java.io.File;

public class DeleteFile {

    public void removeFile(String fileName) {
        File file = new File("C:\\Users\\stepa\\IdeaProjects\\JavaSE\\src\\main\\java\\InputOutput\\" + fileName);

        if (file.delete()) {
            System.out.println("Файл " + fileName + " был удален с корневой папки проекта");
        } else {
            System.out.println("Файл " + fileName + " не был найден в корневой папке проекта");
        }
    }
}
