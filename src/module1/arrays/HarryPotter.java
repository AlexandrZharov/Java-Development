package module1.arrays;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * HarryPotter Main
 *
 * Version info 1
 *
 * Copyright Aleksandr Zharov KHNEU
 */
public class HarryPotter {

    public static void main(String[] args) {
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get(
                    "D:\\projects\\Java Development\\harry.txt")));
        } catch (IOException ioe) {
            System.out.println("Reading file error: " + ioe.getMessage());
        }
        String[] wordsArray = text.trim()
                .replaceAll("[^a-zA-Z0-9\\s'-]","")
                .replaceAll("\n", "")
                .split(" ");
        String distinctString = "";
        for (String word : wordsArray) {
            if(!distinctString.contains(word)) {
                distinctString += word + " ";
            }
        }
        String[] distinctWordsArray = distinctString.split(" ");
        Arrays.sort(distinctWordsArray);

        for (String word : distinctWordsArray) {
            System.out.println(word);
        }
        System.out.println("All words: " + wordsArray.length);
        System.out.println("Distinct words: " + distinctWordsArray.length);
    }
}
