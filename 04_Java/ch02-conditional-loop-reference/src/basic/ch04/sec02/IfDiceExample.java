package basic.ch04.sec02;

public class IfDiceExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 10) % 6 + 1;

        System.out.printf("%d번이 나왔습니다.", num);

    }
}
