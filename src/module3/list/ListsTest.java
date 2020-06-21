package module3.list;

import java.beans.Expression;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsTest {

    public static void main(String[] args) {
        int totalNumbersQuantity = 100000;
        int operateNumbersQuantity = 1000;
        //1.  Create ArrayList and LinkedList containing 100 000 Integer elements. Compare time intervals.
        LocalDateTime start = LocalDateTime.now();
        System.out.println("ArrayList creation start: " + start);
        List<Integer> arrayIntegers = new ArrayList<>();
        for (int i = 0; i < totalNumbersQuantity; i++) {
            arrayIntegers.add(i);
        }
        LocalDateTime finish = LocalDateTime.now();
        System.out.println("ArrayList creation finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        start = LocalDateTime.now();
        System.out.println("LinkedList creation start: " + start);
        List<Integer> linkedIntegers = new LinkedList<>();
        for (int i = 0; i < totalNumbersQuantity; i++) {
            linkedIntegers.add(i);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList creation finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //2. Insert new 1000 elements on the beginning, on the middle and on the end of ones. Compare time intervals.

        //Insert new 1000 elements on the beginning of ArrayList
        start = LocalDateTime.now();
        System.out.println("ArrayList insert on the beginning start: " + start);
        for (int i = 0; i < operateNumbersQuantity; i++) {
            arrayIntegers.add(0, i);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList insert on the beginning finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //Insert new 1000 elements on the middle of ArrayList
        start = LocalDateTime.now();
        System.out.println("ArrayList insert on the middle start: " + start);
        int middleOfList = arrayIntegers.size()/2;
        for (int i = 0; i < operateNumbersQuantity; i++) {
            arrayIntegers.add(middleOfList, i);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList insert on the middle finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //Insert new 1000 elements on the end of ArrayList
        start = LocalDateTime.now();
        System.out.println("ArrayList insert on the end start: " + start);
        for (int i = 0; i < operateNumbersQuantity; i++) {
            arrayIntegers.add(i);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList insert on the end finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //Insert new 1000 elements on the beginning of LinkedList
        start = LocalDateTime.now();
        System.out.println("LinkedList insert on the beginning start: " + start);
        for (int i = 0; i < operateNumbersQuantity; i++) {
            linkedIntegers.add(0, i);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList insert on the beginning finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //Insert new 1000 elements on the middle of LinkedList
        start = LocalDateTime.now();
        System.out.println("LinkedList insert on the middle start: " + start);
        middleOfList = linkedIntegers.size()/2;
        for (int i = 0; i < operateNumbersQuantity; i++) {
            linkedIntegers.add(middleOfList, i);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList insert on the middle finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //Insert new 1000 elements on the end of LinkedList
        start = LocalDateTime.now();
        System.out.println("LinkedList insert on the end start: " + start);
        for (int i = 0; i < operateNumbersQuantity; i++) {
            linkedIntegers.add(i);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList insert on the end finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //3. Update 1000 elements from the beginning, from the middle and from the end of ones. Compare time intervals.

        //Update 1000 elements from the beginning of ArrayList
        start = LocalDateTime.now();
        System.out.println("ArrayList update from the beginning start: " + start);
        for (int i = 0; i < operateNumbersQuantity; i++) {
            arrayIntegers.set(i, operateNumbersQuantity - i);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList update from the beginning finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //Update 1000 elements from the middle of ArrayList
        start = LocalDateTime.now();
        System.out.println("ArrayList update from the middle start: " + start);
        middleOfList = arrayIntegers.size()/2;
        for (int i = 0; i < operateNumbersQuantity; i++) {
            arrayIntegers.set(middleOfList+i, operateNumbersQuantity - i);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList update from the middle finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //Update 1000 elements from the end of ArrayList
        start = LocalDateTime.now();
        System.out.println("ArrayList update from the end start: " + start);
        for (int i = 0; i < operateNumbersQuantity; i++) {
            arrayIntegers.set(arrayIntegers.size() - 1 - i, operateNumbersQuantity - i);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList update from the end finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //Update 1000 elements from the beginning of LinkedList
        start = LocalDateTime.now();
        System.out.println("LinkedList update from the beginning start: " + start);
        for (int i = 0; i < operateNumbersQuantity; i++) {
            linkedIntegers.set(i, operateNumbersQuantity - i);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList update from the beginning finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //Update 1000 elements from the middle of LinkedList
        start = LocalDateTime.now();
        System.out.println("LinkedList update from the middle start: " + start);
        middleOfList = linkedIntegers.size()/2;
        for (int i = 0; i < operateNumbersQuantity; i++) {
            linkedIntegers.set(middleOfList+i, operateNumbersQuantity - i);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList update from the middle finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //Update 1000 elements from the end of LinkedList
        start = LocalDateTime.now();
        System.out.println("LinkedList update from the end start: " + start);
        for (int i = 0; i < operateNumbersQuantity; i++) {
            linkedIntegers.set(arrayIntegers.size() - 1 - i, operateNumbersQuantity - i);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList update from the end finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //4. Delete 1000 elements from the beginning, from the middle and from the end of ones. Compare time intervals.
        //Update 1000 elements from the beginning of ArrayList
        start = LocalDateTime.now();
        System.out.println("ArrayList update from the beginning start: " + start);
        for (int i = 0; i < operateNumbersQuantity; i++) {
            arrayIntegers.set(i, operateNumbersQuantity - i);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList update from the beginning finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //Update 1000 elements from the middle of ArrayList
        start = LocalDateTime.now();
        System.out.println("ArrayList update from the middle start: " + start);
        middleOfList = arrayIntegers.size()/2;
        for (int i = 0; i < operateNumbersQuantity; i++) {
            arrayIntegers.set(middleOfList+i, operateNumbersQuantity - i);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList update from the middle finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //Update 1000 elements from the end of ArrayList
        start = LocalDateTime.now();
        System.out.println("ArrayList update from the end start: " + start);
        for (int i = 0; i < operateNumbersQuantity; i++) {
            arrayIntegers.set(arrayIntegers.size() - 1 - i, operateNumbersQuantity - i);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList update from the end finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //Update 1000 elements from the beginning of LinkedList
        start = LocalDateTime.now();
        System.out.println("LinkedList update from the beginning start: " + start);
        for (int i = 0; i < operateNumbersQuantity; i++) {
            linkedIntegers.set(i, operateNumbersQuantity - i);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList update from the beginning finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //Update 1000 elements from the middle of LinkedList
        start = LocalDateTime.now();
        System.out.println("LinkedList update from the middle start: " + start);
        middleOfList = linkedIntegers.size()/2;
        for (int i = 0; i < operateNumbersQuantity; i++) {
            linkedIntegers.set(middleOfList+i, operateNumbersQuantity - i);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList update from the middle finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

        //Update 1000 elements from the end of LinkedList
        start = LocalDateTime.now();
        System.out.println("LinkedList update from the end start: " + start);
        for (int i = 0; i < operateNumbersQuantity; i++) {
            linkedIntegers.set(arrayIntegers.size() - 1 - i, operateNumbersQuantity - i);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList update from the end finish: " + finish);
        System.out.println("Total time: " + Duration.between(start, finish).toMillis());

//        start = LocalDateTime.now();
//        System.out.println("LinkedList creation start: " + start);
//        finish = LocalDateTime.now();
//        System.out.println("LinkedList creation finish: " + finish);
//        System.out.println("Total time: " + Duration.between(start, finish).toMillis());
    }

//    TODO: complete this method
//    private static void loggingTimeOfOperations(String message, Expression func) throws Exception {
//        LocalDateTime start = LocalDateTime.now();
//        System.out.println(message + " start: " + start);
//        func.execute();
//        LocalDateTime finish = LocalDateTime.now();
//        System.out.println(message + " finish: " + finish);
//        System.out.println("Total time: " + Duration.between(start, finish).toMillis());
//    }
}
