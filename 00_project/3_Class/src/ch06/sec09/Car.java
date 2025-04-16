package ch06.sec09;

public class Car {
    // 필드 선언
    String model;
    int speed;

    Car(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        System.out.printf("%s가 달립니다. (시속: %dkm/h)", model, speed);
    }
}
