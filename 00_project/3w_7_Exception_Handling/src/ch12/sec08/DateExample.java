package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {

        Date now = new Date();

        SimpleDateFormat formatNow = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        System.out.println(formatNow.format(now));

    }
}
