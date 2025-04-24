package advanced.ch04.sec01;

public class NestedForExample {
    public static void main(String[] args) {
        for(int x = 0; x < 11; x++) {
            for(int y = 0; y < 11; y++) {
                if(4 * x + 5 * y == 60) {
                    System.out.printf("(%d, %d)", x, y);
                    System.out.println();
                }
            }
        }
    }
}
