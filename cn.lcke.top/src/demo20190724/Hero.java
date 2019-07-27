package demo20190724;

public class Hero {
    private String name;
    private int age;

    private Woan woan;

    void methom() {
        System.out.println("我是" + name + "age" + age + "wuqi" + woan.getName() + woan.getZhaung());
    }

    public Hero() {

    }

    public Hero(String name, int age, Woan woan) {
        this.woan = woan;
        this.name = name;
        this.age = age;
    }
}
