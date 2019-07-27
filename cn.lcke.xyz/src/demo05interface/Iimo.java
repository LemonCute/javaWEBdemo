package demo05interface;

public class Iimo implements Inter1{
    @Override
    public void mtthom() {
        System.out.println("1");
    }

    @Override
    public void methom() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        new Iimo().methom();
        new Iimo().def();
    }
}
