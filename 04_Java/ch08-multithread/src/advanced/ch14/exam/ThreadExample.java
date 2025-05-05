package advanced.ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {

        MovieThread.t1.start();
        MusicRunnable.t2.start();

    }
}
