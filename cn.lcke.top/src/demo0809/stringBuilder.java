package demo0809;

/**
 *
 * 引用类型 比较地址
 */
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder("aaaaa");

        stringBuilder.append(stringBuilder2);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder2);
        System.out.println(stringBuilder==stringBuilder2);
    }

}
