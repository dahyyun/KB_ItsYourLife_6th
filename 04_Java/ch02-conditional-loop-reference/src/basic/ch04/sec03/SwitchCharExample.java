package basic.ch04.sec03;

public class SwitchCharExample {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A', 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B', 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
                break;
        }
    }
}
