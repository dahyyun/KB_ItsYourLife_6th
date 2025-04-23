package advanced.ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run(); // 한국 타이어가 굴러갑니다.

        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();
        myCar.run(); // 금호 타이어가 굴러갑니다.
    }
}
