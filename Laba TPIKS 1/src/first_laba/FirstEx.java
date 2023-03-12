package first_laba;

import java.util.Scanner;

public class FirstEx {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 1; i < 5; i++) {
            System.out.println(Math.pow(n,i));
        }
    }
}
