package myPackage;

// 抽象類，不能被直接創建該對象
public abstract class Animal {
    // 在子類對象被創建時調用
    public Animal() {
        System.out.println("抽象父類Animal的構造方法");
    }

    // 抽象方法，方法體留給子類實作
    public abstract void eat();

    public static void nomalMethod() {
        System.out.println("每隻動物都會的方法");
    }
}
