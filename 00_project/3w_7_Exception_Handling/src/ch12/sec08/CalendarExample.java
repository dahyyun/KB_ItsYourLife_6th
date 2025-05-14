package ch12.sec08;

import java.lang.invoke.CallSite;
import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR); // 2025
        int month = now.get(Calendar.MONTH); // 4
        int day = now.get(Calendar.DAY_OF_MONTH); // 23

        System.out.printf("%d년 %d월 %d일", year, month, day);
        System.out.println();

        int week = now.get(Calendar.DAY_OF_WEEK); // 4

        String weekDay = null;

        switch (week) {
            case 1:
                weekDay = "일요일";
                break;
            case 2:
                weekDay = "월요일";
                break;
            case 3:
                weekDay = "화요일";
                break;
            case 4:
                weekDay = "수요일";
                break;
            case 5:
                weekDay = "목요일";
                break;
            case 6:
                weekDay = "금요일";
                break;
            default:
                weekDay = "토요일";
                break;
        }

        int amPm = now.get(Calendar.AM_PM); // 1

        String amPmDay = null;

        if (amPm == 0) {
            amPmDay = "오전";
        } else {
            amPmDay = "오후";
        }

        System.out.printf("%s %s", weekDay, amPmDay);
        System.out.println();

        int hour = now.get(Calendar.HOUR); // 6
        int minute = now.get(Calendar.MINUTE); // 53
        int second = now.get(Calendar.SECOND); // 43

        System.out.printf("%d시 %d분 %d초", hour, minute, second);

    }
}
