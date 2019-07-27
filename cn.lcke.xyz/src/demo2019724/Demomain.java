package demo2019724;

public class Demomain {
    public static void main(String[] args) {
        //匿名内部类
        MyInterface myInterface = new MyInterface() {
            @Override
            public void str() {
                System.out.println("匿名");
            }
        };
        myInterface.str();

        MyInterface myInter = new MyinterfaceImpl();
        myInter.str();
    }
}
