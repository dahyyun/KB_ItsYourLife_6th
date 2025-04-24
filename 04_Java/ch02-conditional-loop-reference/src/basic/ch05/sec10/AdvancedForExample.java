package basic.ch05.sec10;

public class AdvancedForExample {

    public static void main(String[] args) {
        int[] scores = { 95, 71, 84, 93, 87 };

        int sum = 0;

        for (int num : scores) {
            sum += num;
        }

        double avg = sum / (double)scores.length;

        System.out.println("점수 총 합 : " + sum);
        System.out.println("평균 점수 : " + avg);
    }
}
