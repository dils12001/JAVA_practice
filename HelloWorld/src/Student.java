package myPackage;

import javax.swing.text.html.StyleSheet;

// 所有 靜態內容 總是優於 非靜態內容，故 靜態代碼塊 會優先於 構造方法 來執行
public class Student {
    // 成員變量
    // 定義在 方法外，類當中
    private int stdId;
    private String name;
    private int age;

    // 用static修飾，類屬性，所有該類的對象共用此 類屬性
    private static String room;
    private static int counter; // 用來計算stdId

    // 構造方法Constructor
    public Student(String name, int age) {
        this.stdId = counter++;
        this.name = name;
        this.age = age;
    }

    public Student() {
        this.stdId = counter++;
        this.name = "noBody";
        this.age = 18;
    }

    // 成員方法，不加static
    // 定義在 方法外，類當中
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRoom() {
        return this.room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getStdId() {
        return this.stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public void eat() {
        System.out.println(this.name + "吃飯飯");
    }

    public void sleep() {
        System.out.println(this.name + "睡覺覺");
    }

    public void study() {
        System.out.println(this.name + "讀書書");
    }

    // 靜態方法，加static，不屬於對象，屬於類
    // 可通過 對象名稱 或 類名稱 進行調用(不需要創建對象即可調用)
    // 靜態方法 不能訪問 非靜態的成員變數，也不能在其中使用this，因為他不知道對象是誰壓
    public static void staticMethod() {
        System.out.println("這是靜態方法");
    }

    // 靜態代碼塊，第一次創建該類對象時執行(執行唯一一次)
    // 通常用來一次性的對 靜態變量(類屬性) 賦值
    static {
        System.out.println("第一次創建Student對象");
        room = "終極一班";
        counter = 0;
    }

}