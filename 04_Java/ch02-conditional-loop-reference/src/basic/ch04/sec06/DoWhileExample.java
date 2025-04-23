package basic.ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = null;

        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        do {
            System.out.print(">");
            str = sc.nextLine();
            System.out.println(str);
        } while(!"q".equals(str));

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
