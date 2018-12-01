package lesson18.task5;

import java.io.File;

public class FileInputOutputDemo {
    public static void main(String[] args) {
        File file = new File("src\\lesson18\\task5\\file.txt");
        FileInputOutputStream.write(file, new char[]{'a', 'b', 'c'});
        String fileText = FileInputOutputStream.read(file);
        System.out.print(fileText);
    }}
