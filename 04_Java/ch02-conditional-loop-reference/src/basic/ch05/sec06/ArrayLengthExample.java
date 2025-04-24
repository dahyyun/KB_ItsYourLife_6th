package basic.ch05.sec06;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] arr = { 84, 90, 96 };

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double avg = sum / (double)arr.length;

        System.out.println("총 합 : " + sum);
        System.out.println("평균 : " + avg);

    }
}
