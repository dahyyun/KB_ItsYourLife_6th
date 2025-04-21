package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 5;

        Calculator calculator = new Calculator();
        System.out.println("calculator.areaCircle(5) : " + calculator.areaCircle(r));

        Computer computer = new Computer();
        System.out.println("computer.areaCircle(5) : " + computer.areaCircle(r));
    }
}
