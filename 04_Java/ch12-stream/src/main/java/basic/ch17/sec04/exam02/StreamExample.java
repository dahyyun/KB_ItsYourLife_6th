package basic.ch17.sec04.exam02;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = {"홍길동", "신용권", "김미나"};

        int[] intArray = { 1, 2, 3, 4, 5 };

        Stream<String> strStream = Arrays.stream(strArray);
        IntStream intStream = Arrays.stream(intArray);

        strStream.forEach(name -> System.out.print(name + ","));
        System.out.println();
        intStream.forEach(num -> System.out.print(num + ","));
    }
}
