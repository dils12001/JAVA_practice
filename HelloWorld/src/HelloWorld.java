/*     
1.  byte short char 在運算時，會自動被提升為int，再進行運算
2.  byte short char 再賦值時，若右邊的值沒有超過該數字型態範圍，則編譯器隱含的自動強制轉型 byte a = 100; byte a = (byte)100;
3.  boolean 是不能作任何類型轉換的，與C/C++不一樣
4.  function裡不能嵌套另一個funtion
5.  對於 基本類型 來說：    == 是進行 【數值】 的比較
6.  對於 引用類型 來說：    == 是進行 【地址】 的比較   只要不是基本類型，就是引用類行
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import myPackage.*;

// class名稱 需與 該檔案名稱 相同 
public class HelloWorld {
    public static void main(String[] args) {
        // 強制類型轉換 數字範圍大 轉 數字範圍小 時，可能發生溢出(結果不正確)
        // int num1 = (int) 100L;
        // System.out.println(num1);

        // 作 複合賦值運算時，自動會作 強制類型轉換
        // num2 => byte
        // num2 = num2 + 5 ===> byte = (byte)(int(自動提升為int) + int)
        // byte num2 = 30;
        // num2 += 5;
        // System.out.println(num2);

        // getMax(10, 20);
        // forLoop_whileLoop_if_Example();
        // switch_Example(27);
        // array_Example();
        // object_Example();
        // scanner_Example();
        // arrayList_Example();
        // string_Example();
        // math_Example();
        // extend_Example();
        // interface_Example();
        // polymorphism_Example();
        Outer_Inner_Class();
    }

    // 兩數取大者，示範 三元運算子(ternary operator)用法
    public static void getMax(int a, int b) {
        int max = a > b ? a : b;
        System.out.println(max);
    }

    // Example： forLoop, whileLoop, if
    public static void forLoop_whileLoop_if_Example() {
        // forLoop
        for (int i = 1; i < 15; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " 為5的倍數");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i + " 為6的倍數");
            } else {
                System.out.println(i + " 不是5和6的倍數");
            }
        }

        System.out.println("=====這是分割線=====");

        // whileLoop
        int i = 1;
        while (i < 15) {
            if (i % 5 == 0) {
                System.out.println(i + " 為5的倍數");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i + " 為6的倍數");
            } else {
                System.out.println(i + " 不是5和6的倍數");
            }
            i++;
        }
        // do{
        // statements
        // }while(condiction);
    }

    // Example： switch
    public static void switch_Example(int a) {
        // a只能為 byte, short, char, int, String, enum 類型
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            // case後面的常數不能重複
            case 2:
                System.out.println("a = 2");
                break;
            default:
                System.out.println("a不是1也不是2, a = " + a);
                break;
        }
    }

    // Example： array
    // array作為參數在 方法間 傳遞時，雖然傳遞的只是array地址，但不用額外傳遞array長度(與C不同)
    public static void array_Example() {
        int[] arr1 = new int[10];
        String[] arr2 = { "1", "asd", "dks" };

        char[] arr3;
        arr3 = new char[5];
        arr3 = new char[] { 'd', 'f' };
        // 錯誤語法
        // arr3 = {'a', 'd'};

        System.out.println(arr1[0]);
        // 獲取array長度
        System.out.println("arr2長度為: " + arr2.length);
        // 變成[ , , ,...]的字串格式
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = { 15, 64, 87, 21, 6, 58, 78, 4, 19 };
        // 將array從小到大排列，無返回值，排列原array
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));

    }

    // Example： 物件
    public static void object_Example() {
        Student std1 = new Student();
        Student std2 = new Student("Dennis", 20);

        System.out.println(std1.getName() + "'s id is " + std1.getStdId() + ", 班級為 " + std1.getRoom());
        System.out.println(std2.getName() + "'s id is " + std2.getStdId() + ", 班級為 " + std2.getRoom());

        std1.setAge(25);
        System.out.println(std1.getName() + "'s age is " + std1.getAge());
        std1.setRoom("天才菁英班");
        System.out.println(std2.getName() + "'s id is " + std2.getStdId() + ", 班級為 " + std2.getRoom());
        std2.eat();

        Student.staticMethod();
    }

    // Example： 輸入_Scanner
    public static void scanner_Example() {
        Scanner sc = new Scanner(System.in); // System.in 表示鍵盤輸入
        System.out.print("輸入數字：");
        int num = sc.nextInt();
        System.out.print("輸入字符串：");
        String str = sc.next();

        System.out.println("鍵盤輸入數字： " + num);
        System.out.println("鍵盤輸入字符串： " + str);
        
        sc.close();
    }

    // Example： ArrayList
    public static void arrayList_Example() {
        // ArrayList只能是引用類行，不能是基本類型，因為ArrayList保存的是地址值，基本類型沒有地址值
        ArrayList<String> arrList = new ArrayList<>();
        // 若想使用基本類型的ArrayList，要使用基本類型的包裝類
        ArrayList<Integer> arrList2 = new ArrayList<>();

        // ArrayList添加元素一定會成功，否則編譯器直接報錯，返回值一定是true
        arrList.add("小明");
        arrList.add("小美");
        arrList.add("小王");
        System.out.println(arrList);

        // 取元素值，索引從0開始算
        System.out.println("取得索引值為1的元素" + arrList.get(1));

        // 刪除元素，返回值為 被刪除的那個元素
        System.out.println("被刪除的是： " + arrList.remove(0));
        System.out.println(arrList);

        // 獲取ArrayList長度
        System.out.println("arrList長度是： " + arrList.size());
    }

    // Example： String
    public static void string_Example() {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArr = { 'H', 'e', 'l', 'l', 'o' };
        String str3 = new String(charArr);

        // 判斷字符串的內容(值)是否一樣
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));
        // 建議用上面這種寫法，因下面這種寫法，在str1 = null，時會報錯
        System.out.println(str1.equals("Hello"));

        // 判斷字符串的內容(值)是否一樣，而且呼略大小寫
        System.out.println("hello".equalsIgnoreCase(str1));

        // 獲取字串長度
        System.out.println("dsfsdf".length());

        // 合併字符串，返回新的String，原本的不動
        System.out.println(str1.concat(" World!!"));

        // 獲取字符串中，指定索引的字元
        System.out.println(str1.charAt(1));

        // 獲取某段字符串("orl")在另一字符串("HelloWorldHelloWorld")中第一次出現的索引位置，若無匹配回傳-1
        System.out.println("HelloWorldHelloWorld".indexOf("orl"));

        // 擷取， 返回新的String，原本的不動
        System.out.println("HelloWorldHelloWorld".substring(3)); // 從該索引到尾
        System.out.println("HelloWorldHelloWorld".substring(3, 7)); // 包頭不包尾 [3,7)

        // 將該字串轉成 char[]，返回一個新的 char[]
        System.out.println("HelloWorld".toCharArray()[5]);

        // 將該字串的成 byte[]，返回一個新的 byte[]
        byte[] strByte = "abc".getBytes();
        for (int i = 0; i < strByte.length; i++) {
            System.out.println(strByte[i]);
        }

        // 取代
        String str4 = "HelloWorld".replace("o", "*");
        System.out.println(str4);

    }

    // Example： math function
    public static void math_Example() {
        // 絕對值
        System.out.println(Math.abs(-2.8));

        // 向上取整
        System.out.println(Math.ceil(3.17));

        // 向下取整
        System.out.println(Math.floor(6.9));

        // 四捨五入
        System.out.println(Math.round(45.4));
        System.out.println(Math.round(45.5));

        // 近似圓周率的靜態變量
        System.out.println(Math.PI);
    }

    // Example： 繼承 extends
    // Java是【單繼承】，一個子類的【直接父類】是唯一的
    public static void extend_Example() {
        Father father = new Father();
        Child child = new Child();

        // 若子類中找不到該名稱的成員變量或方法，才向上找父類有沒有
        child.methodFather(); // 子類沒有該方法，向上調用父類的
        child.methodChild(); // 子類有該方法，用自己的
        child.method(); // 雖然與父類方法重名，但子類已有該方法，用自己的

        System.out.println(child.getNum());
        System.out.println(father.getNum());

        // 抽象類範例
        // Animal animal = new Animal(); // 不能被直接創建 抽象類的對象(Animal)
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        cat.eat();

    }

    public static void interface_Example() {
        // 不能直接創建接口類的對象
        // InterfaceDemo interf = new InterfaceDemo(); // 錯誤寫法
        InterfaceDemoImpl impl = new InterfaceDemoImpl();
        impl.interfaceMethod1();
        impl.interfaceMethod2();
        impl.interfaceMethod3();
        impl.interfaceMethod4();

        impl.updateMethod1();
        impl.updateMethod2();
        // impl.staticMethod(); //錯誤寫法，接口靜態方法需直接用【接口名】調用
        InterfaceDemo.staticMethod1();
        InterfaceDemo.staticMethod2();

        // 使用接口常量
        System.out.println(InterfaceDemo.MY_NUM);
    }

    // Example： polymorphism 多態
    public static void polymorphism_Example() {
        // 父類引用 指向 子類對象
        Father person = new Child();

        // 成員方法
        // 口訣：編譯看左邊(能不能編譯成功)，運行看右邊(運行時調用誰)
        // 右邊new什麼，就從哪個型態(Child)開始【向上】找該【方法】，所以 person.method(); 是調用Child的方法
        person.method();
        // person.methodChild(); // 編譯看左邊，Father person，Father類中沒有methodChild()方法 故錯誤

        // 成員變量
        // 口訣：編譯看左邊(能不能編譯成功)，運行看左邊(運行時調用誰)
        // 直接查找， = 左邊是哪個型態，就是從哪個型態(Father)【向上】查找該成員變量
        // System.out.println(person.onlyChild); // 錯誤寫法，因只會從Father【向上】找
        System.out.println(person.num2); // (Father的num2)

        // 多態的轉型
        // 子類 往上轉成 父類 沒問題，但注意 轉成父類後，調用子類特有方法會編譯錯誤(參考口訣)
        Animal animal = new Cat();

        // 父類 往下【還原】回 子類
        // Dog dog = (Dog) animal; // 因為Dog與Cat都繼承自Animal，所以編譯時沒問題，但執行時報錯，原本是Cat故無法轉成Dog
        Cat cat = (Cat) animal;

        // 判斷是否能轉成 該類對象
        Animal animal2 = new Cat();
        if (animal2 instanceof Dog) {
            Dog dog2 = (Dog) animal2;
            dog2.eat();
        }
        if (animal2 instanceof Cat) {
            Cat cat2 = (Cat) animal2;
            cat2.eat();
        }

    }

    public static void Outer_Inner_Class() {
        // 創建【成員內部類】的對象 外部類.內部類
        OuterDemo.InnerDemo inner = new OuterDemo().new InnerDemo();
        inner.innerMethod();

        OuterDemo outer = new OuterDemo();
        // 使用【局部內部類】
        outer.outerMethod();

        // 匿名內部類，只能new唯一一次
        InterfaceDemo obj = new InterfaceDemo (){
            @Override
            public void interfaceMethod1(){
                System.out.println("匿名內部類實現方法1");
            }
            @Override
            public void interfaceMethod2(){
                System.out.println("匿名內部類實現方法2");
            }
            @Override
            public void interfaceMethod3(){
                System.out.println("匿名內部類實現方法3");
            }
            @Override
            public void interfaceMethod4(){
                System.out.println("匿名內部類實現方法4");
            }
        };
        obj.interfaceMethod1();
        obj.interfaceMethod4();


        // 匿名內部類，而且也是匿名對象，只能new唯一一次，並且也只能調用唯一一次
        new InterfaceDemo (){
            @Override
            public void interfaceMethod1(){
                System.out.println("匿名內部類實現方法1");
            }
            @Override
            public void interfaceMethod2(){
                System.out.println("匿名內部類實現方法2");
            }
            @Override
            public void interfaceMethod3(){
                System.out.println("匿名內部類實現方法3");
            }
            @Override
            public void interfaceMethod4(){
                System.out.println("匿名內部類實現方法4");
            }
        }.interfaceMethod2();
        
    }
}