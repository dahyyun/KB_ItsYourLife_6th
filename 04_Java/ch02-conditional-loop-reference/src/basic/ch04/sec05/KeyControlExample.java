package basic.ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        int v = 0;

        while (true) {
            System.out.println("-------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-------------------------");

            Scanner sc = new Scanner(System.in);

            System.out.print("선택: ");

            int selectNum = sc.nextInt();

            if (selectNum == 1) {
                v++;
                System.out.println("현재 속도 : " + v);
            } else if (selectNum == 2) {
                v--;
                System.out.println("현재 속도 : " + v);
            } else if (selectNum == 3) {
                System.out.print("프로그램 종료");
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }

    }
}