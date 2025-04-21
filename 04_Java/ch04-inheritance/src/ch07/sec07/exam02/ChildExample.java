package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        parent.method1();
        parent.method2();
//        parent.method3(); // Parent 타입에는 method3() 정의되어 있지 않음.
    }
}
