package first_laba;

public class ThirteenthEx {
    public static void main(String[] args) {
        int[][] Mas = new int[15][3];
        for (int i = 0; i < Mas.length; i++) {
            for (int j = 0; j < Mas[i].length; j++) {
                Mas[i][j] = (int) (Math.random() * 8) + 2;

                if (j == Mas[i].length - 1) {
                    Mas[i][j] = Mas[i][j - 2] * Mas[i][j - 1];
                    for (int q = 0; q < i; q++) {
                        if (Mas[i][j] == Mas[q][j] && i > 0) {
                            if (Mas[i][j - 1] == Mas[q][j - 1] || Mas[i][j - 2] == Mas[q][j - 2])
                                --i;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < Mas.length; i++) {
            System.out.print("Задание №" + (i + 1 + " Умножить "));
            for (int h = 0; h < Mas[i].length; h++) {
                if (h == 0)
                    System.out.print(Mas[i][h] + " на ");
                if (h == 1)
                    System.out.println(Mas[i][h]);
            }
        }
    }
}
