package by.overone.lesson26homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class Task2 {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("1.txt");
        BufferedReader bufferReader = new BufferedReader(fileReader);
        String words = "";
        for (String line = ""; line != null; line = bufferReader.readLine()) {
            words += line;
        }
        String[] words2 = words.split(" ");
        System.out.print(Arrays.toString(words2) + "\n");
        // решение задачи 2
        for (int i = 0; i < words2.length; i++) {
            if (words2[i].startsWith("a") || words2[i].startsWith("e") || words2[i].startsWith("i") || words2[i].startsWith("o") || words2[i].startsWith("u") || words2[i].startsWith("y"))

                System.out.print(words2[i] + " ");
        }
        // решение задачи 3
        for (int i = 1; i < words2.length; i++) {
            int a = words2[i - 1].length();
            if (words2[i - 1].charAt(a - 1) == words2[i].charAt(0)) {
                System.out.println("\n" + words2[i - 1] + " " + words2[i]);
            }
        }

    }
}






