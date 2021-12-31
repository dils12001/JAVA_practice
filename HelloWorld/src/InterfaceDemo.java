package myPackage;

// 接口不能有【靜態代碼塊】和【構造方法】
// 一個類 只有 一個【直接父類】，但可以實作 多個【接口】    public class A implements B, C {...}
// 一個類 可以實作 多個【接口】
// 接口語接口之間是多繼承的 public interface MyInterface extends InterFaceA, InterFaceB {...}
// 實作的implement 中，有默認方法衝突，必須重寫(Override)該方法，否則報錯
// 繼承的父類 或 實作的implement 中，有方法衝突，優先使用父類方法
public interface InterfaceDemo {
    // 抽象方法
    public abstract void interfaceMethod1();

    // public 和 abstrsct 皆可省略(如下三種寫法)
    public void interfaceMethod2();

    abstract void interfaceMethod3();

    void interfaceMethod4();

    // 默認方法，使用情境通常為接口升級時，此默認方法能被 實作該接口的所有類對象 直接使用
    // public 可省略 變成 default void updateMethod(){...}
    // 此方法也可被 實作類重寫Override
    public default void updateMethod1() {
        System.out.println("第一次接口升級");
        privateMethod();
    }

    public default void updateMethod2() {
        System.out.println("第二次接口升級");
        privateMethod();
    }

    // 接口的靜態方法，直接用【接口名】調用，而不是用【對象】調用
    public static void staticMethod1() {
        System.out.println("這是第一個接口的靜態方法");
        privateStaticMethod();
    }

    public static void staticMethod2() {
        System.out.println("這是第二個接口的靜態方法");
        privateStaticMethod();
    }

    // 私有方法
    // 若接口中的【默認方法】或【靜態方法】重複代碼太多，可將重複部分抽取出來，形成另一方法，再調用其即可
    // 但此方法應只能在【該接口中才能被調用】，外面的實作類對象不應該能存取到，所以需要【private】屬性

    // 默認方法用的
    private void privateMethod() {
        System.out.println("私有默認方法的重複部分");
    }

    // 靜態方法用的
    private static void privateStaticMethod() {
        System.out.println("私有靜態方法的重複部分");
    }

    // 接口中的成員變量，其實就是【常量】
    // 一旦賦值，不可修改，且【必須被賦值】
    // 名稱推薦【全部大寫】，下劃線分隔
    // public static final 皆可省略，變為 int num = 123;
    public static final int MY_NUM = 123;
}
