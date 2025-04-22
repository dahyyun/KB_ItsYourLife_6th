package basic.ch07.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus); // 버스가 달립니다.

        Taxi taxi = new Taxi();
        driver.drive(taxi); // 택시가 달립니다.
    }
}
