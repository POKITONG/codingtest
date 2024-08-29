package backjoon.no3003;

import backjoon.No2438;

import java.util.Scanner;

public class No3003V1 {

    public static void main(String[] args) {
        // 입력: 첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다.
        // 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.

        // 출력: 첫째 줄에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력한다.
        // 만약 수가 양수라면 동혁이는 그 개수 만큼 피스를 더해야 하는 것이고, 음수라면 제거해야 하는 것이다.

        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        int num = 6;


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            int a = scanner.nextInt();
            System.out.println(king - a);
        }

        for (int i = 0; i < 3; i++) {
            int a = scanner.nextInt();
            System.out.println(rook - a);
        }

        int a = scanner.nextInt();
        System.out.println(pawn - a);

    }
}
