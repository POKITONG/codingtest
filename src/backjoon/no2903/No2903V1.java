package backjoon.no2903;

import java.util.Scanner;

public class No2903V1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사각형의 개수를 구해서 풀게되면 중복되는 점이 생긴다.
        // 사각형의 개수가 아닌 추가되는 점의 개수를 세면 중복이 되지 않는다.
        // 초기 = 점 4개, 1번 반복 = 5개가 늘어남
        // 2번 = 14개가 늘어남.
        // 사각형이 늘어나게 되면 사각형끼리 맞닿는 면의 점은 중복이 된다.
        // 사각형끼리 맞닿는 변의 개수는 초기 0, 1번째 4, 2번째 24
        // 사각형 개수는 초기 1, 1번 4, 2번 16

        // 총 점의 개수 = 외곽 변의 개수 + 내부 점의 개수
        // 사각형의 총 개수는 이전 사각형 개수 * 4의 개수만큼 늘어난다.

        // 0 = 2 * 2 = 4
        // 1 = 3 * 3 = 9
        // 2 = 5 * 5 = 25
        // 3 = 9 * 9 = 81
        // 4 = 17 * 17 = 289
        // 5 = 33 * 33 = 1089

        // 점의 개수는 한 변의 수 - 1만큼 늘어난다.

        int N = scanner.nextInt();

        int initialSideDots = 2;
        int result = calculateTotalDots(N, initialSideDots);

        System.out.println(result);
    }

    private static int calculateTotalDots(int iterations, int initialSideDots) {
        int sideDots = initialSideDots;
        for (int i = 0; i < iterations; i++) {
            sideDots = sideDots + (sideDots - 1);
        }
        return sideDots * sideDots;
    }
}
