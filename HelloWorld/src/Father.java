package myPackage;

public class Father {
    private int num = 20;
    public int num2 = 200;

    public Father() {
        System.out.println("父類的構造方法");
    }

    public void methodFather() {
        System.out.println("父類的成員方法");
    }

    public void method() {
        System.out.println("父類裡的重名方法");
    }

    public int getNum() {
        return this.num;
    }

}
