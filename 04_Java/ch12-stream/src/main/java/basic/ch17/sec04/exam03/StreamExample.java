package basic.ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum; // 합계를 구하기 위한 변수

    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1, 100).sum();
        System.out.println("총 합 : " + sum);

    }
}
