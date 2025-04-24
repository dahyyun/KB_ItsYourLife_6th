package basic.ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";

        char str = ssn.charAt(6); // 1

        if((str == '1') | (str == '3')) {
            System.out.println("남자입니다.");
        } else {
            System.out.println("여자입니다.");
        }

    }
}
