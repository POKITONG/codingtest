package backjoon.no10811;

import java.util.Scanner;
import java.util.stream.IntStream;

public class No10811V2 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var n = scanner.nextInt();
        var m = scanner.nextInt();

        var baskets = IntStream.rangeClosed(1, n).toArray();

        IntStream.range(0, m)
                .forEach(k -> {
                    var i = scanner.nextInt() - 1;
                    var j = scanner.nextInt() - 1;

                    while (i < j) {
                        var temp = baskets[i];
                        baskets[i] = baskets[j];
                        baskets[j] = temp;
                        i++;
                        j--;
                    }
                });


        IntStream.of(baskets).forEach(basket -> System.out.print(basket + " "));
    }
}
