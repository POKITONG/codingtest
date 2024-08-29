package backjoon.no2346;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class No2346V5 {

    static class Balloon {
    int number;
    int index = 0;

    public Balloon(int number, int index) {
        this.number = number;
        this.index = index;
    }

    public int getNumber() {
        return number;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Balloon{" +
                "number=" + number +
                ", index=" + index +
                '}';
    }
}
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); //\n

        Deque<Balloon> balloons = initializBalloon(scanner, N);

        // 출력 예쁘게
        StringBuilder result = getResult(balloons);

        System.out.println(result);

    }

    private static StringBuilder getResult(Deque<Balloon> balloons) {
        StringBuilder result = new StringBuilder();

        Balloon current = balloons.poll();

        result.append(current.getIndex() + " ");

        while (!balloons.isEmpty()) {
            int steps = current.getNumber();
            if (steps > 0) {
                for (int i = 0; i < steps - 1; i++) {
                    balloons.offerLast(balloons.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(steps); i++) {
                    balloons.offerFirst(balloons.pollLast());
                }
            }
            current = balloons.poll();
            result.append(current.getIndex() + " ");

        }

        return result;
    }

    private static Deque<Balloon> initializBalloon(Scanner scanner, int N) {
        Deque<Balloon> balloons = new ArrayDeque<>();

        String num = scanner.nextLine();
        String[] strNum = num.split(" ");
        for (int i = 0; i < N; i++) {
            balloons.offer(new Balloon(Integer.parseInt(strNum[i]), i + 1));
        }

        return balloons;
    }

}
