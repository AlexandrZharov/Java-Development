package module4.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * LogsParser class
 *
 * @author Aleksandr Zharov
 * @version 1
 *
 * Copyright Aleksandr Zharov KHNEU
 *
 * Home task. Files management
 *
 * 1. Parse the file logs.txt (see the attachment).  Extract to a separate file all the logs.
 *
 * 2. Calculate the total number of logs (lines).
 *
 * 3. Calculate the total  number of  ERROR logs. Use previous skills - String.split
 *
 * 4.  Calculate the total number of ERROR logs. Use Files.lines.
 *
 * 5. Compare two results.
 */
public class LogsParser {
    public static void main(String[] args) throws IOException {
        String fileName = "./logs.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        long totalNumberOfLogs = 0;
        long numberOfErrorLogs = 0;

        LocalDateTime start = LocalDateTime.now();
        String line =  bufferedReader.readLine();
        while(line != null) {
            totalNumberOfLogs++;
            if(line.contains("ERROR")) numberOfErrorLogs++;
            line = bufferedReader.readLine();
        }
        LocalDateTime finish = LocalDateTime.now();
        System.out.println("----------BufferedReader----------");
        System.out.println("Total number of logs: " + totalNumberOfLogs + System.lineSeparator() + "Number of ERROR logs: " + numberOfErrorLogs);
        System.out.println("Total time of calculation: " + Duration.between(start, finish).toMillis());
        System.out.println("----------------------------------");

        start = LocalDateTime.now();
        Supplier<Stream<String>> streamSupplier = () -> {
            try {
                return Files.lines(Paths.get(fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        };
        totalNumberOfLogs = streamSupplier.get().count();
        numberOfErrorLogs = streamSupplier.get().filter(row -> row.contains("ERROR")).count();
        finish = LocalDateTime.now();
        System.out.println("-----------Files.lines------------");
        System.out.println("Total number of logs: " + totalNumberOfLogs + System.lineSeparator() + "Number of ERROR logs: " + numberOfErrorLogs);
        System.out.println("Total time of calculation: " + Duration.between(start, finish).toMillis());
        System.out.println("----------------------------------");
    }
}
