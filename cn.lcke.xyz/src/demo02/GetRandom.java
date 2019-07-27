package demo02;

import java.util.Random;

public class GetRandom {
    public static void main(String[] args) {

        for (int i1 = 0; i1 < 100; i1++) {
            Random random =new Random();
            int i =random.nextInt(10);
            System.out.println(i);
        }
    }


}
