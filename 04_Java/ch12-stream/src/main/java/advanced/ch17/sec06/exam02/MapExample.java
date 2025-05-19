package advanced.ch17.sec06.exam02;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5 };

        IntStream arr = Arrays.stream(intArray);

        // 실수형 반환
        arr.asDoubleStream()
                .forEach(System.out::println);

        System.out.println();

        // 정수형 반환
        // 다시 IntStream으로 출력하려면 처음부터 새로 생성해야 함
        IntStream arr1 = Arrays.stream(intArray);

        arr1.forEach(System.out::println);




    }
}
