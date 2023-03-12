package first_laba;

import java.util.Random;

public class ElevenEx {
    public static void main(String[] args) {
        int[] arr = new int[12];
        Random ran = new Random();
        for (int i = 0; i < 12; i++) {
            arr[i] = ran.nextInt(31)-15;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int max = arr[0], index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max ) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Самое большое число " + max + " и индекс его последнего вхождения " + (index));
    }
}
