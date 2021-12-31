package myPackage;

public class Cat extends Animal {
    // 子類必須實作Override 父類中所有的【抽象】方法，除非子類也是一個抽象類
    public Cat(){
        System.out.println("子類Cat的構造方法");
    }

    @Override
    public void eat() {
        System.out.println("吃魚");
    }
}
