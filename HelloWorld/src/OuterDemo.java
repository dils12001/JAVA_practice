package myPackage;

public class OuterDemo {
    int num = 10;

    // 成員內部類
    public class InnerDemo {
        int num = 20;

        public void innerMethod() {
            int num = 30;
            System.out.println(num); // 30
            System.out.println(this.num); // 20
            System.out.println(OuterDemo.this.num); // 10
        }
    }

    public void outerMethod() {
        int num = 100;
        // 局部內部類 寫在成員方法裡的內部類，只有這個成員方法(outerMethod)能用它
        class InnerDemo2 {

            public void innerMethod2() {
                // 要想使用該函數的局部變量，該局部變量需是final特性，創建後不能再作第二次賦值
                // 局部變量 生命週期 隨該方法的開始與結束(stack)，但對象卻是在堆區(Heap)，故需要final特性
                System.out.println(num);
            }
        }
        InnerDemo2 inner2 = new InnerDemo2();
        inner2.innerMethod2();
    }
}
