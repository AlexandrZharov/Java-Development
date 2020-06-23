package finalTask;

import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Glossary {

    public static void main(String[] args) throws IOException {
        File file = new File("./src/finalTask/harry.txt");
        String text = new String(Files.readAllBytes(file.toPath()));

        Map<String, Integer> duplicates = findNumberOfDuplicates(text);

        Map<String, Integer> sortedDuplicates = sortByValue(duplicates, Comparator.reverseOrder());

        Map<String, Integer> first20Duplicates = putFirstEntries(20, sortedDuplicates);

        Set<String> properNames = findProperNames(text);

        FileWriter fileWriter = new FileWriter("./src/finalTask/test.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("First 20 Duplicates!");
        for (Map.Entry<String, Integer> entry:first20Duplicates.entrySet()) {
            printWriter.println(entry.getKey() + ": " + entry.getValue());
        }
        printWriter.println("NAMES!");
        for (String name : properNames) {
            printWriter.println(name);
        }
        printWriter.close();
    }

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

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map, Comparator order) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(order));

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    public static <K,V> Map<K, V> putFirstEntries(int max, Map<K,V> source) {
        int count = 0;
        Map<K,V> result = new LinkedHashMap<>();
        for (Map.Entry<K,V> entry:source.entrySet()) {
            if (count >= max) break;

            result.put(entry.getKey(), entry.getValue());
            count++;
        }
        return result;
    }

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
