package basic.ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {

        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1(); // Parent-method1()
        parent.method2(); // Parent-method2()
//        parent.field2 = "data2"; // Parent에는 field2가 정의되어 있지 않음.
//        parent.method3(); // Parent에는 method3()가 정의되어 있지 않음.

        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3(); // Child-method3()
    }
}
