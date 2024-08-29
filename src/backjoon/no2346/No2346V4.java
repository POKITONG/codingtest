package backjoon.no2346;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class No2346V4 {
    public static void main(String[] args) {

        class Balloon {
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

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); //\n

        Deque<Balloon> balloon = new ArrayDeque<>();

        String num = scanner.nextLine();
        String[] strNum = num.split(" ");
        for (int i = 0; i < N; i++) {
            balloon.offer(new Balloon(Integer.parseInt(strNum[i]), i + 1));
        }


        // 출력 예쁘게
        StringBuilder result = new StringBuilder();

        Balloon current = balloon.poll();

        result.append(current.getIndex());

        while (!balloon.isEmpty()) {
            int steps = current.getNumber();
            if (steps > 0) {
                for (int i = 0; i < steps - 1; i++) {
                    balloon.offerLast(balloon.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(steps); i++) {
                    balloon.offerFirst(balloon.pollLast());
                }
            }
            current = balloon.poll();
            result.append(current.getIndex());

            System.out.println(result);
        }

    }
}
