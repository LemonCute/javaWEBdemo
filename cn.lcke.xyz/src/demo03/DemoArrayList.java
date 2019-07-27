package demo03;

import java.util.ArrayList;

public class DemoArrayList {


    public static void main(String[] args) {
        DemoArrayList list = new DemoArrayList();
        ArrayList<String> testlist = list.test();
        //list.test02();
        list.printList(testlist);
    }

    public void printList(ArrayList<String> resList) {
        System.out.print("{");
        for (int i = 0; i < resList.size()-1; i++) {
            System.out.print(resList.get(i) + "@");
        }
        System.out.println(resList.get(resList.size()-1)+"}");
    }

    public void test02() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
    }


    public ArrayList<String> test() {
        // 创建 String ArrayList，从JDK1.7开始 右侧可以不写，但必须有
        ArrayList<String> list = new ArrayList<>(2);
        list.add("小明");
        list.add("小明");
        //返回一个 bool 型
        list.add("小明");
        //打印 List 可以得到内用
        System.out.println(list);
        return list;
    }
}