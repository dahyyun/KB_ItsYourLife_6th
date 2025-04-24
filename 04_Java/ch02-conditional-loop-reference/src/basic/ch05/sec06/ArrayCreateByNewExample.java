package basic.ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {

        int[] arr1 = new int[3];

        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        String[] arr2 = new String[5];

        for(String str : arr2) {
            System.out.print(str + " ");
        }

    }
}
