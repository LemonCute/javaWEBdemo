package demo2242;

public class mysystem {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();;
        System.out.println(l);
        demo();
    }


    private static void demo(){
        int[] src ={1,2,3};

        int[] dest = {2,3,4};
        System.arraycopy(src,1,dest,1,2);
        System.out.println(dest.getClass());
        System.out.println(src);
    }
}
