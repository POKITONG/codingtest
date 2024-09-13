package backjoon.no10811;

import java.util.Scanner;

public class No10811V1 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var n = scanner.nextInt();
        var m = scanner.nextInt();

        var basket = new int[n];
        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }

        for (int k = 0; k < m; k++) {
            var i = scanner.nextInt() - 1;
            var j = scanner.nextInt() - 1;

            while (i < j) {
                var temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;
                i++;
                j--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
