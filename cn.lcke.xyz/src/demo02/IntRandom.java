package demo02;

import java.util.Random;
import java.util.Scanner;

public class IntRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int result = scanner.nextInt(random.nextInt(100));

        while (true) {
            if (result == random.nextInt())
                break;
        }
        System.out.println("==="+result);
    }
}
