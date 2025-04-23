package basic.ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceClmpl impl = new InterfaceClmpl();

        InterfaceClmpl ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceClmpl ib = impl;
        ib.methodB();
        System.out.println();

        InterfaceClmpl ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
