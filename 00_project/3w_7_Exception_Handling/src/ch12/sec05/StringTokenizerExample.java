package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String list[] = data1.split("[&, ,]");

        for(String i : list) {
            System.out.print(i + " ");
        }

        System.out.println();

        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer name = new StringTokenizer(data2, "/");
        while(name.hasMoreTokens()) {
            System.out.print(name.nextToken() + " ");
        }
    }
}
