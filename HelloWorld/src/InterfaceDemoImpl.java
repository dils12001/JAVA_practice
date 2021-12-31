package myPackage;

public class InterfaceDemoImpl implements InterfaceDemo {
    // 必須實作所有接口類中的抽象方法，除非他自己是抽象類
    @Override
    public void interfaceMethod1() {
        System.out.println("first method");
    }

    @Override
    public void interfaceMethod2() {
        System.out.println("second method");
    }

    @Override
    public void interfaceMethod3() {
        System.out.println("third method");
    }

    @Override
    public void interfaceMethod4() {
        System.out.println("forth method");
    }
}
