package InputOutput;

import java.util.Scanner;

/**
 * Input-output:
 * - реализовать файловый менеджер (в виде консольного приложения).
 * На вход программе указывается абсолютный путь к файлу и ключ операции (с параметрами),
 * которую необходимо выполнить над файлом. Должны быть реализованы операции создания файла, удаления, чтения, записи в файл.
 * Учесть пограничные случаи и не забыть про удобную обработку исключений с выводом валидаций ользователю в консоль.
 * Пример вызова программы:
 * >>c:\\testdata\myfile.txt -create (создаст пустой файл)
 * или
 * >>c:\\testdata\myfile.txt -write "blablabla" (запишет в файл строку blablabla)
 */

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите команду:");
            System.out.println("create");
            System.out.println("delete");
            System.out.println("write");
            System.out.println("read");
            System.out.println("Или введите close для завершения");
            System.out.println("--------------------------------");

            String action = in.nextLine();

            switch (action) {
                case "create":
                    CreateFile createFile = new CreateFile();
                    createFile.addFile("MyFile.txt");
                    break;
                case "delete":
                    DeleteFile deleteFile = new DeleteFile();
                    deleteFile.removeFile("MyFile.txt");
                    break;
                case "write":
                    SimpleWrite sw = new SimpleWrite();
                    sw.fileWrite("MyFile.txt");
                    break;
                case "read":
                    SimpleRead sr = new SimpleRead();
                    sr.fileRead("MyFile.txt");
                    break;
                case "close":
                    return;
                default:
                    System.out.println("Invalid action");
            }
        }
    }
}
