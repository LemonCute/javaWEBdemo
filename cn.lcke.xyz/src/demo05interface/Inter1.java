package demo05interface;

/**
 * java7  常量，抽象方法
 * Java8 +默认方法,静态方法
 * java9 +私有方法
 */
public interface Inter1 {

    public  static final int age = 0;

    //这是一个抽象方法
    public abstract void mtthom();

    void methom();


    default void def() {
        System.out.println("111");
    }

    static void defu(){}

}
