package myPackage;

public class Child extends Father {
    private int num = 10;
    public int num2 = 100;
    public int onlyChild = 1000;

    public Child() {
        // 子類構造方法【一定】要調用【唯一一個】父類的構造方法
        // super();     沒寫的話將默認先執行父類的構造方法，或是在這override父類的構造方法
        System.out.println("子類的構造方法");
    }

    public void methodChild() {
        System.out.println("子類的成員方法");
    }

    @Override
    public void method() {
        System.out.println("子類裡的重名方法(Override)");
        int num = 30;

        System.out.println(num); // 局部變量
        System.out.println(this.num); // 自己的成員變量
        System.out.println(super.getNum()); // 父類的成員方法，拿出父類的num

    }

    public int getNum() {
        return this.num;
    }

}
