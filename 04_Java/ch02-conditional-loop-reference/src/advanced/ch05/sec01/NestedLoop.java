package advanced.ch05.sec01;

public class NestedLoop {
    public static void main(String[] args) {
        int[][] array = {
                { 95, 86 },
                { 83, 92, 96 },
                { 78, 83, 93, 87, 88 }
        };

        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            for(int num : array[i]) {
                sum += num;
            }
        }

        double avg = sum / (double)array.length;

        System.out.println("전체 합 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
