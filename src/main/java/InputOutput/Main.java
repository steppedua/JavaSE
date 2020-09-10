package InputOutput;

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
    public static void main(String[] args) {
        CreateFile createFile = new CreateFile();
        createFile.addFile("MyFile.txt");

//        DeleteFile deleteFile = new DeleteFile();
//        deleteFile.removeFile("MyFile.txt");
    }
}
