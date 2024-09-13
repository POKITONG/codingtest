package backjoon.no5597;

import java.util.Scanner;
import java.util.stream.IntStream;

public class No5597V2 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var students = new boolean[30];

        IntStream.range(0, 28)
                .map(i -> scanner.nextInt() - 1)
                .forEach(i -> students[i] = true);

        IntStream.range(0, 30)
                .filter(i -> !students[i])
                .map(i -> i + 1)
                .forEach(System.out::println);
    }
}
