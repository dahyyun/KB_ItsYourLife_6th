package advanced.ch04.sec02;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        int sum = 0;
        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-----------------------------------");

            System.out.print("선택> ");

            Scanner sc = new Scanner(System.in);
            int snum = sc.nextInt();

            switch (snum) {
                case 1:
                    System.out.print("예금액> ");
                    Scanner sc1 = new Scanner(System.in);
                    sum += sc1.nextInt();
                    System.out.println();
                    break;
                case 2:
                    System.out.print("출금액> ");
                    Scanner sc2 = new Scanner(System.in);
                    sum -= sc2.nextInt();
                    System.out.println();
                    break;
                case 3:
                    System.out.print("잔고> " + sum);
                    System.out.println();
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("프로그램 종료");
                    break;
            }

            if(snum == 4) {
                break;
            }

        }
    }
}
