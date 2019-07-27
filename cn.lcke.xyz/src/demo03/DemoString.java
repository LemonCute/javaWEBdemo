package demo03;

public class DemoString {
    public static void main(String[] args) {
        DemoString demoClass=new DemoString();
        //System.out.println(demoClass.testString());
        demoClass.test2String();
    }
    public String test2String(){
        String str1="abc";
        String str2="aaa";

        System.out.println(str1==str2);
        return null;
    }
    public String testString(){
        String string= new String();
        char[] array={'1','2'};
        String string1=new String(array);
        byte[] bytes={12,23,56};
        String string2=new String(bytes);
        String str="123";
        str="456";
        return str+string2;
    }
}
