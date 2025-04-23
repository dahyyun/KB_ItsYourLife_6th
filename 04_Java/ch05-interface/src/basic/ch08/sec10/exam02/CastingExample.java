package basic.ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
//        vehicle.checkFare(); // 수정 전 부분
//        ((Bus)vehicle).checkFare(); // 수정 후 부분

        Bus bus = ((Bus)vehicle);
        bus.run();
        bus.checkFare();
    }
}
