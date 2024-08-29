package backjoon.no2164;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class No2164V2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 카드 개수 받기

        int n = scanner.nextInt();

        // 큐에 카드 개수만큼 카드 넣기
        Deque<Integer> cards = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            cards.offer(i);
        }

        while (cards.size() > 1) {
            cards.poll();
            cards.offerLast(cards.poll());
        }

        System.out.println(cards.element());
    }
}
