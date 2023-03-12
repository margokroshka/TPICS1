package first_laba;

import java.util.Random;
import java.util.Scanner;

public class LastEx {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        int minPos = 0;
        int maxPos = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            int max = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    minPos = j;
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxPos = j;
                }
            }
            arr[i][minPos] = arr[i][0];
            arr[i][0] = min;
            arr[i][maxPos] = arr[i][arr[i].length - 1];
            arr[i][arr[i].length - 1] = max;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
