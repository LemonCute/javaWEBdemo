package demo01;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String name;

    public void show(){
        System.out.println("你的名字 ： "+name);
    }
}
