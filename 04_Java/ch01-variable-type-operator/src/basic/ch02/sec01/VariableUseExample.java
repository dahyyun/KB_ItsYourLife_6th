package basic.ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;
        int second = 60;
        
        int totalMinute = hour * second + minute;
        System.out.println(hour + "시간 " + minute + "분\n" + "총 " + totalMinute + "분");
    }
}
