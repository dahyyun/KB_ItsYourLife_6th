package basic.ch04.sec07;

import java.util.Random;

public class BreakExample {
    public static void main(String[] args) throws Exception {
        Random r = new Random();

        int num;

        while(true) {
            num = r.nextInt(6) + 1;
            System.out.println(num);
            if(num == 6) {
                System.out.println("프로그램 종료");
                break;
            }
        }

    }
}
