package backjoon.no2164;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class No2164V3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 카드 개수 받기
        int n = scanner.nextInt();

        // 큐에 카드 개수만큼 카드 넣기
        Deque<Integer> cards = initializeCards(n);

        findLastCard(cards);
        System.out.println(cards.element());
    }

    private static void findLastCard(Deque<Integer> cards) {
        while (cards.size() > 1) {
            cards.poll();
            cards.offerLast(cards.poll());
        }
    }

    private static Deque<Integer> initializeCards(int n) {
        Deque<Integer> cards = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            cards.offer(i);
        }
        return cards;
    }
}
