package demo04;

public class Father {
    public Father(){
        System.out.println("fu gouzao");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public  Father(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println(this.getName()+this.getAge());
    }
    public Object show(){
        System.out.println("dadianhua");
        return null;
    }
}
