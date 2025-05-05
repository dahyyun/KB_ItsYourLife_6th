package advanced.ch14.exam;

public class MusicRunnable {

    static Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 6; i++) {
                System.out.println("음악을 재생합니다.");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {

                }
            }
        }
    });
}
