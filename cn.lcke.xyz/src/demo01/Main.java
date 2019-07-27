package demo01;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person person = new Person();
        person.setName("高圆圆");
        person.show();
        System.out.println("=============");
        new Person().setName("hell");
    }
}
