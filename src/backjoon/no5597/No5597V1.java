package backjoon.no5597;

import java.util.Scanner;

public class No5597V1 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var students = new boolean[30];

        for (var i = 0; i < 28; i++) {
            students[scanner.nextInt() - 1] = true;
        }

        for (var i = 0; i < 30; i++) {
            if (!students[i]) {
                System.out.println(i + 1);
            }
        }
    }
}
