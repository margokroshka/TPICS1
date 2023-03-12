package first_laba;

import java.util.Random;
import java.util.Scanner;

public class FourthEx {
    public static void main(String[] args) {
        Random random = new Random();
        int m = random.nextInt(10);
        System.out.println(m);
        System.out.println("угадай число от 0 до 10");
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            n = scanner.nextInt();
            if (n == m) {
                System.out.println("ВЫ УГАДАЛИ УРА!!!!");
                break;
            }
            if (n > m) {
                System.out.println(" загаданное число меньше");
            } else {
                System.out.println(" загаданное число больше");
            }

        } while (n != m);
    }
}
