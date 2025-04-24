package advanced.ch04.sec01;

public class ForExample3 {
    public static void main(String[] args) {
        for(int i = 5; i > 0; i--) {
            for(int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
