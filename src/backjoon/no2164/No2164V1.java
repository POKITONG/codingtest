package backjoon.no2164;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class No2164V1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 카드 개수 받기

        int n = scanner.nextInt();

        Deque<Integer> cards = new ArrayDeque<>();

        // 큐에 카드 개수만큼 카드 넣기
        for (int i = 1; i <= n; i++) {
            cards.offer(i);
        }

        while (true) {
            cards.poll();
            if (cards.size() == 1) {
                break;
            }
            cards.offerLast(cards.poll());
        }


        System.out.println(cards.element());
    }
}
