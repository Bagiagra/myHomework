package by.overone.lesson26homework;

import java.io.FileReader;
import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("1.txt");
        int line;
        while ((line = fileReader.read()) != -1) {
            System.out.print((char) line);
        }
        fileReader.close();

    }
}

