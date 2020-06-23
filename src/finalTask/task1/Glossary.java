package finalTask.task1;

import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * GLOSSARY Main class
 *
 * Version info 1
 *
 * Copyright Aleksandr Zharov KHNEU
 *
 * 1.1. Download a text about Harry Potter.
 *
 * 1.2. For each distinct word in the text calculate the number of occurrence.
 *
 * 1.3. Use RegEx..
 *
 * 1.4. Sort in the DESC mode by the number of occurrence..
 *
 * 1.5. Find the first 20 pairs.
 *
 * 1.6. Find all the proper names
 *
 * 1.7. Count them and arrange in alphabetic order.
 *
 * 1.8. First 20 pairs and names write into to a file test.txt
 *
 * 1.9. Create a fine header for the file
 *
 * 1.10 Use Java Collections to demonstrate your experience (Map, List )
 */
public class Glossary {

    public static void main(String[] args) throws IOException {
        File file = new File("./src/finalTask/task1/harry.txt");
        String text = new String(Files.readAllBytes(file.toPath()));

        Map<String, Integer> duplicates = findNumberOfDuplicates(text);

        Map<String, Integer> sortedDuplicates = sortByValue(duplicates, Comparator.reverseOrder());

        Map<String, Integer> first20Duplicates = putFirstEntries(20, sortedDuplicates);

        Set<String> properNames = findProperNames(text);

        FileWriter fileWriter = new FileWriter("./src/finalTask/task1/test.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("First 20 Duplicates!");
        printWriter.println("----------------------------------------------------------------------------------------");
        for (Map.Entry<String, Integer> entry:first20Duplicates.entrySet()) {
            printWriter.println(entry.getKey() + ": " + entry.getValue());
        }
        printWriter.println("----------------------------------------------------------------------------------------");
        printWriter.println("NAMES!");
        printWriter.println("----------------------------------------------------------------------------------------");
        for (String name : properNames) {
            printWriter.println(name);
        }
        printWriter.close();
    }

    /**
     *
     * @param text  - input text
     *
     * @return map with words as keys and number of duplicates as value
     */
    static Map<String, Integer> findNumberOfDuplicates(String text) {
        String[] wordsArray = text.trim()
                .replaceAll("[^a-zA-Z0-9\\s'-]","")
                .replaceAll("--", "")
                .replaceAll("\n", "")
                .split(" ");
        Map<String, Integer> result = new LinkedHashMap<>();
        for (String word : wordsArray) {
            result.putIfAbsent(word, 0);
            result.computeIfPresent(word,(key, value) -> value + 1);
        }
        return result;
    }

    /**
     *
     * @param map  - input map
     *
     * @param order  - sort order
     *
     * @return map sorted by value
     */
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map, Comparator order) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(order));

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    /**
     *
     * @param map  - input map
     *
     * @param max  - number of values which will be taken from map
     *
     * @return map with size equals max
     */
    public static <K,V> Map<K, V> putFirstEntries(int max, Map<K,V> map) {
        int count = 0;
        Map<K,V> result = new LinkedHashMap<>();
        for (Map.Entry<K,V> entry:map.entrySet()) {
            if (count >= max) break;

            result.put(entry.getKey(), entry.getValue());
            count++;
        }
        return result;
    }

    /**
     *
     * @param text  - input text
     *
     * @return set of proper names
     */
    private static Set<String> findProperNames(String text) {
        List<String> wordsList = Arrays.asList(text.trim()
                .replaceAll("[^a-zA-Z0-9\\s]","")
                .replaceAll("\n", "")
                .split(" "));

        List<String> namesList = wordsList.stream()
                .filter(word -> word.matches("\\b[A-Z][a-z]*?\\b"))
                .filter(word -> !wordsExceptions.contains(word))
                .filter(word -> !wordsList.contains(word.toLowerCase()))
                .filter(word -> word.length() > 1)
                .collect(Collectors.toList());
        namesList.sort(Comparator.naturalOrder());
        Set<String> result = new LinkedHashSet<>(namesList);
        return result;
    }

    private final static List<String> wordsExceptions = Arrays.asList("Mr","Mrs", "I");
}
