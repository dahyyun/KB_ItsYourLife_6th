package basic.ch04.sec02;

public class IfNestedExample {
    public static void main(String[] args) {

        int score = (int)(Math.random() * 20) + 81;
        System.out.println("점수: " + score);

        String grade;

        if (score >= 81) {
            if (score >= 85) {
                if (score >= 90) {
                    if (score >= 95) {
                        System.out.println("학점: A+");
                    } else {
                        System.out.println("학점: A");
                    }
                } else {
                    System.out.println("학점: B+");
                }
            } else {
                System.out.println("학점: B");
            }
        } else {
            System.out.println("81~100 사이의 점수가 아닙니다.");
        }
    }
}
