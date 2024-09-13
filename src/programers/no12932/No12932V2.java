package programers.no12932;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class No12932V2 {

    public static void main(String[] args) {

        long n = 12345L;
        System.out.println(Arrays.toString(solution(n)));

    }

    public static int[] solution(long n) {
        var str = new StringBuilder(Long.toString(n))
                .reverse()
                .toString();

        return str.chars()
                .map(c -> c - '0')
                .toArray();
    }
}
