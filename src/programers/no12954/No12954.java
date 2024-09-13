package programers.no12954;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class No12954 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(1,5)));

    }

    public static Long[] solution(int x, int n) {

        return LongStream.iterate(x, i -> i + x)
                .limit(n)
                .boxed()
                .toArray(Long[]::new);

    }

}
