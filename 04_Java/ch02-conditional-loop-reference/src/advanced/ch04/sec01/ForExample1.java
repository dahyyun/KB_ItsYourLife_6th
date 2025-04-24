package advanced.ch04.sec01;

public class ForExample1 {
    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0) {
                sum += i;
            } else {
                continue;
            }
        }

        System.out.println("1부터 100까지의 정수 중에서 3의 배수의 총 합은 " + sum + "입니다.");

    }
}
