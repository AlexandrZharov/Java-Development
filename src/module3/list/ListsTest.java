package module3.list;

import java.beans.Expression;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class ListsTest {

    public static void main(String[] args) {
        int totalNumbersQuantity = 100000;
        int operateNumbersQuantity = 1000;
        //1.  Create ArrayList and LinkedList containing 100 000 Integer elements. Compare time intervals.
        List<Integer> arrayIntegers = new ArrayList<>();
        loggingTimeOfOperations("ArrayList creation", arrayIntegers, (list) -> {
            for (int i = 0; i < totalNumbersQuantity; i++) {
                list.add(i);
            }
            return list;
        });

        List<Integer> linkedIntegers = new LinkedList<>();
        loggingTimeOfOperations("LinkedList creation", linkedIntegers, (list) -> {
            for (int i = 0; i < totalNumbersQuantity; i++) {
                list.add(i);
            }
            return list;
        });

        //2. Insert new 1000 elements on the beginning, on the middle and on the end of ones. Compare time intervals.

        //Insert new 1000 elements on the beginning of ArrayList
        loggingTimeOfOperations("ArrayList insert on the beginning", arrayIntegers, (list) -> {
            int middleOfList = list.size()/2;
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.add(0, i);
            }
            return list;
        });

        //Insert new 1000 elements on the middle of ArrayList
        loggingTimeOfOperations("ArrayList insert on the middle", arrayIntegers, (list) -> {
            int middleOfList = list.size()/2;
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.add(middleOfList, i);
            }
            return list;
        });

        //Insert new 1000 elements on the end of ArrayList
        loggingTimeOfOperations("ArrayList insert on the end", arrayIntegers, (list) -> {
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.add(i);
            }
            return list;
        });

        //Insert new 1000 elements on the beginning of LinkedList
        loggingTimeOfOperations("LinkedList insert on the beginning", linkedIntegers, (list) -> {
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.add(0, i);
            }
            return list;
        });

        //Insert new 1000 elements on the middle of LinkedList
        loggingTimeOfOperations("LinkedList insert on the middle", linkedIntegers, (list) -> {
            int middleOfList = list.size()/2;
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.add(middleOfList, i);
            }
            return list;
        });

        //Insert new 1000 elements on the end of LinkedList
        loggingTimeOfOperations("LinkedList insert on the end", linkedIntegers, (list) -> {
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.add(i);
            }
            return list;
        });

        //3. Update 1000 elements from the beginning, from the middle and from the end of ones. Compare time intervals.
        //Update 1000 elements from the beginning of ArrayList
        loggingTimeOfOperations("ArrayList update from the beginning", arrayIntegers, (list) -> {
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.set(i, operateNumbersQuantity - i);
            }
            return list;
        });

        //Update 1000 elements from the middle of ArrayList
        loggingTimeOfOperations("ArrayList update from the middle", arrayIntegers, (list) -> {
            int middleOfList = list.size()/2;
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.set(middleOfList + i, operateNumbersQuantity - i);
            }
            return list;
        });

        //Update 1000 elements from the end of ArrayList
        loggingTimeOfOperations("ArrayList update from the end", arrayIntegers, (list) -> {
            int indexOfLast = list.size() - 1;
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.set(indexOfLast - i, operateNumbersQuantity - i);
            }
            return list;
        });

        //Update 1000 elements from the beginning of LinkedList
        loggingTimeOfOperations("LinkedList update from the beginning", linkedIntegers, (list) -> {
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.set(i, operateNumbersQuantity - i);
            }
            return list;
        });

        //Update 1000 elements from the middle of LinkedList
        loggingTimeOfOperations("LinkedList update from the middle", linkedIntegers, (list) -> {
            int middleOfList = list.size()/2;
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.set(middleOfList + i, operateNumbersQuantity - i);
            }
            return list;
        });

        //Update 1000 elements from the end of LinkedList
        loggingTimeOfOperations("LinkedList update from the end", linkedIntegers, (list) -> {
            int indexOfLast = list.size() - 1;
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.set(indexOfLast - i, operateNumbersQuantity - i);
            }
            return list;
        });

        //4. Delete 1000 elements from the beginning, from the middle and from the end of ones. Compare time intervals.
        //Delete 1000 elements from the beginning of ArrayList
        loggingTimeOfOperations("ArrayList delete from the beginning", arrayIntegers, (list) -> {
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.remove(0);
            }
            return list;
        });
        //Delete 1000 elements from the middle of ArrayList
        loggingTimeOfOperations("ArrayList delete from the middle", arrayIntegers, (list) -> {
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.remove(list.size()/2);
            }
            return list;
        });

        //Delete 1000 elements from the end of ArrayList
        loggingTimeOfOperations("ArrayList delete from the end", arrayIntegers, (list) -> {
            int indexOfLast = list.size() - 1;
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.remove(indexOfLast - i);
            }
            return list;
        });

        //Delete 1000 elements from the beginning of LinkedList
        loggingTimeOfOperations("LinkedList delete from the beginning", linkedIntegers, (list) -> {
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.remove(0);
            }
            return list;
        });
        //Delete 1000 elements from the middle of LinkedList
        loggingTimeOfOperations("LinkedList delete from the middle", linkedIntegers, (list) -> {
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.remove(list.size()/2);
            }
            return list;
        });
        //Delete 1000 elements from the end of LinkedList
        loggingTimeOfOperations("LinkedList delete from the end", linkedIntegers, (list) -> {
            int indexOfLast = list.size() - 1;
            for (int i = 0; i < operateNumbersQuantity; i++) {
                list.remove(indexOfLast - i);
            }
            return list;
        });

    }

    private static List<Integer> loggingTimeOfOperations(String message, List<Integer> list, Function<List<Integer>, List<Integer>> func) {
        LocalDateTime start = LocalDateTime.now();
        System.out.println(message + " start: " + start);
        List<Integer> result = func.apply(list);
        LocalDateTime finish = LocalDateTime.now();
        System.out.println(message + " finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());
        return result;
    }
}
