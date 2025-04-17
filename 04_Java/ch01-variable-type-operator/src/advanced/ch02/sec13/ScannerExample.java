package advanced.ch02.sec13;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Scanner 객체를 이용하여 아래 그림과 같이 x, y에 입력받고,
        // 그 합을 출력하는 ch02.sec13.ScannerExample.java 클래스를 작성하세요.
//        System.out.print("x값 입력 : ");
//        int x = sc.nextInt();
//        System.out.print("y값 입력 : ");
//        int y = sc.nextInt();
//
//        int result = x + y;
//
//        System.out.println("x + y : " + result);

        // Scanner 객체를 이용하여 아래 그림과 같이 x, y에 입력받고,
        // 그 합을 출력하는 ch02.sec13.ScannerExample.java 클래스를 작성하세요.
        while(true) {
            System.out.print("입력 문자열:");
            String str = sc.nextLine();

            if(str.equals("q")) {
                break;
            }

            System.out.println("출력 문자열:" + str);
            System.out.println();
        }
        // 스캐너 닫기
        System.out.println("종료");
        sc.close();
    }
}
