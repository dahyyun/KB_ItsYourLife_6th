package advanced.ch05.sec01;

public class ArrayLength {
    public static void main(String[] args) {
        int[][] array = {
                { 95, 86 },
                { 83, 92, 96 },
                { 78, 83, 93, 87, 88 }
        };

        System.out.println(array.length); // 3
        System.out.println(array[2].length); // 5
    }
}
