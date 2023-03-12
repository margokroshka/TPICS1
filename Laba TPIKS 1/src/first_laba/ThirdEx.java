package first_laba;

public class ThirdEx {
    public static void main(String[] args) {
        int n = 0, a = 0, b = 0, c = 0;
        int sum;

        for (int i = 1; i <= 10; i++) {
            n += i;
        }
        for (int i = 1; i <= 100; i++) {
            a += i;
        }
        for (int i = 1; i <= 1000; i++) {
            b += i;
        }
        for (int i = 1; i <= 10000; i++) {
            c += i;
        }
        sum = n + a + c + b;
        System.out.println(sum);
    }
}
