package ch11.sec02.exam01;

import java.util.Arrays;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수 : " + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");

//        printLength(null); // null의 길이를 잴 수 없다.
        try {
            printLength(null);
        } catch (NullPointerException e) {
            System.out.println("null 존재 : " + e.getMessage());
//            e.printStackTrace();
        }

        System.out.println("[프로그램 종료]");
    }
}
