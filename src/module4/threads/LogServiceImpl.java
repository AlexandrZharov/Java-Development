package module4.threads;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * LogServiceImpl class
 *
 * @author Aleksandr Zharov
 * @version 1
 *
 * Copyright Aleksandr Zharov KHNEU
 *
 * Home Task: Multi-threading.
 *
 * 1. Use the file from the previous task  - logs.txt.
 *
 * 2. Create a class that manages logs in this file.
 *
 * 3. Create a method that finds all the ERROR logs  for a specific date and write them into a specific file (name = ERROR  + Date  + .log)
 *
 * 4. In your main class develop a functionality to create  5 such a files for 5 different days. Launch them in consistent way (one after another ).
 *
 * 5. Repeat the above  task in parallel way. Multi-threading.
 *
 * 6. Compare the results.
 */
public class LogServiceImpl {

    public LogServiceImpl() {
    }

    /*
     *
     * @param String dateTime - search date in a format yyyy-mm-dd
     * @param String filePath - path to file
     * @param String prefix - prefix for console logs
     *
     * @return List<String> logs
     */
    public List<String> getLogsByDate(String date, String filePath, String prefix) throws IOException {
        LocalDateTime start = LocalDateTime.now();
        System.out.println(prefix + " " + date + " - Start counting at " + start);

        List<String> logs = Files.lines(Paths.get(filePath))
                .filter(line -> line.contains(date))
                .collect(Collectors.toList());

        LocalDateTime finish = LocalDateTime.now();

        System.out.println(prefix + " " + date + " - Finish counting at " + finish);
        System.out.println(prefix + " " + date + " - Total time: " + Duration.between(start, finish).toMillis());
        return logs;
    }

    /*
     *
     * @param String dateTime - search date in a format yyyy-mm-dd
     * @param String filePath - path to file
     * @param String prefix - prefix for console logs
     *
     * @return int logs amount
     */
    public int getLogsAmountByDate(String date, String filePath, String prefix) throws IOException {
        int amount = getLogsByDate(date, filePath, prefix).size();
        System.out.println(prefix + " " + date + " - Logs amount: " + amount);
        return amount;
    }

    /*
     *
     * @param List<String> logs
     * @param String filePath - path to file
     * @param String prefix - prefix for console logs
     *
     */
    public void toFile(List<String> list, String filePath, String prefix) throws IOException {
        LocalDateTime start = LocalDateTime.now();
        System.out.println(prefix + " " + filePath + " - Start writing in file at " + start);
        String text = "";

        for (String line:list){
            text += line + System.lineSeparator();
        }
        Files.write(Paths.get(filePath), text.getBytes());
        LocalDateTime finish = LocalDateTime.now();

        System.out.println(prefix + " " + filePath + " - Finish writing in file at " + finish);
        System.out.println(prefix + " " + filePath + " - Total time: " + Duration.between(start, finish).toMillis());
    }
}
