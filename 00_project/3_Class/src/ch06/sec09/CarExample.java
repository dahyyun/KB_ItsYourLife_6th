package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car("자동차");

        car1.setSpeed(50);
        int car1Speed = car1.getSpeed();
        System.out.println(car1Speed);

        car1.run();
    }
}
