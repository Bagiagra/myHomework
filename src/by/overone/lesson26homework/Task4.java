package by.overone.lesson26homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.Character.isDigit;

public class Task4 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("2.txt");
        BufferedReader bufferReader = new BufferedReader(fileReader);
        String words = "";
        for (String line = ""; line != null; line = bufferReader.readLine()) {
           words = line.toString();
            System.out.println(line.toString());
            String words2 = words.replaceAll("\\D+"," ");
            System.out.println(words2.toString());
        }
    }
}
