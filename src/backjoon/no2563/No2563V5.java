package backjoon.no2563;

import java.util.Scanner;

public class No2563V5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = 100;
        int col = 100;
        boolean[][] whitePaper = new boolean[row][col];

        int paperNum = scanner.nextInt();

        for (int i = 0; i < paperNum; i++) {
            int left = scanner.nextInt();
            int bottom = scanner.nextInt();
            attPap(left, bottom, whitePaper);
        }

        int count = 0;
        count = CountPaperArea(row, col, whitePaper, count);

        System.out.println(count);

    }

    private static int CountPaperArea(int row, int col, boolean[][] whitePaper, int count) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (whitePaper[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    private static void attPap(int left, int bottom, boolean[][] whitePaper) {
        for (int j = left; j < left + 10; j++) {
            for (int k = bottom; k < bottom + 10; k++) {
                whitePaper[j][k] = true;
            }
        }
    }
}
