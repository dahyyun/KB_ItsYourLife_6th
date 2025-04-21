package ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B(); // A에서 상속 받음.
        C c = new C(); // A에서 상속 받음.
        D d = new D(); // (A->)B에서 상속 받음.
        E e = new E(); // (A->)C에서 상속 받음.

//        A a1 = b;
        A a1 = new B(); // 객체 B로 a1 생성
//        A a2 = c;
        A a2 = new C(); // 객체 C로 a2 생성
//        A a3 = d;
        A a3 = new D(); // 객체 D로 a3 생성
//        A a4 = e;
        A a4 = new E(); // 객체 E로 a4 생성

//        B b1 = d;
        B b1 = new D(); // 객체 D로 b1 생성
//        C c1 = e;
        C c1 = new E(); // 객체 E로 c1 생성

//        B b3 = e; // E는 B와 관련이 없다.
//        C c2 = d; // D는 C와 관련이 없다.
    }
}
