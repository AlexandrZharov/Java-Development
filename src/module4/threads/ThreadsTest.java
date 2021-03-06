package module4.threads;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

/**
 * ThreadsTest class
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
public class ThreadsTest {
    static List<String> dateArray = Arrays.asList("2019-10-14", "2019-10-15", "2019-10-16", "2019-10-17", "2019-10-18");
    static String filePath = "./logs.txt";
    public static void main(String[] args) throws IOException {
        LogServiceImpl service = new LogServiceImpl();
        LocalDateTime start = LocalDateTime.now();
        System.out.println("Start counting with threads at " + start);
        for (String date : dateArray) {
            new TestThread(date, filePath).start();
        }
        LocalDateTime finish = LocalDateTime.now();
        System.out.println("Finish counting with threads at " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());
        System.out.println("------------------------------------------------------------");


        start = LocalDateTime.now();
        System.out.println("Start counting without threads at " + start);
        for (String date : dateArray) {
            service.getLogsAmountByDate(date, filePath, "NO THREAD");
        }
        finish = LocalDateTime.now();
        System.out.println("Finish counting without threads at " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        Map<String, List<String>> logsByDay = new HashMap<>();
        for (String date : dateArray) {
            logsByDay.put(date, service.getLogsByDate(date,filePath,"SAVING LOGS"));
        }

        for (String date : dateArray) {
            new TestThread2(logsByDay.get(date), date + ".txt");
        }

        for (String date : dateArray) {
            service.toFile(logsByDay.get(date), date + ".txt", "NO THREAD");
        }

    }

    static class TestThread extends Thread {
        private String filePath;
        private String date;

        public TestThread(String date, String filePath) {
            this.date = date;
            this.filePath = filePath;
        }

        @Override
        public void run() {
            LogServiceImpl service = new LogServiceImpl();
            try {
                service.getLogsAmountByDate(date, filePath, "THREAD");
            } catch (IOException ioe) {
                System.out.println("Error reading file: " + ioe.getMessage());
            }
        }
    }

    static class TestThread2 extends Thread {
        private String filePath;
        private List<String> logs;

        public TestThread2(List<String> logs, String filePath) {
            this.logs = logs;
            this.filePath = filePath;
        }

        @Override
        public void run() {
            LogServiceImpl service = new LogServiceImpl();
            try {
                service.toFile(logs, filePath, "THREAD");
            } catch (IOException ioe) {
                System.out.println("Error reading file: " + ioe.getMessage());
            }
        }
    }
}
