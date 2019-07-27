package demo04;

public class Son01 extends Father {
    public Son01() {
        super(10,"xiaoming");
        System.out.println("===");
    }

    public static void main(String[] args) {
        new Son01().show();
    }

    @Override
    public String show(){
        System.out.println("====");
        return "hello";
    }

}
