package basic.ch08.sec09;

public class InterfaceClmpl implements InterfaceC {
    @Override
    public void methodA() {
        System.out.println("InterfaceClmpl-methodA() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceClmpl-methodB() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceClmpl-methodC() 실행");
    }
}
