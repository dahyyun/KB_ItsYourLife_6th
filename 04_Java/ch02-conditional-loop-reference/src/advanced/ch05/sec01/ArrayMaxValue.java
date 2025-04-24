package advanced.ch05.sec01;

public class ArrayMaxValue {
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 8, 2 };

        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maxValue <= array[i]) {
                maxValue = array[i];
            }
        }

        System.out.println("배열 항목에서 최대값은 " + maxValue + "입니다.");
    }
}
