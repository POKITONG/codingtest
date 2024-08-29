package backjoon.no12789;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class No12789V4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // \n
        String input = scanner.nextLine();

        Deque<Integer> standing = initializeStanding(input);
        Deque<Integer> stack = new ArrayDeque<>();

        int currentNum = 1;

        boolean result = process(currentNum, n, standing, stack);

        printResult(result);
    }

    private static void printResult(boolean result) {
        if (result) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }

    private static boolean process(int currentNum, int n, Deque<Integer> standing, Deque<Integer> stack) {
        while (true) {
            if (currentNum > n) {
                return true;
            }
            if (standing.isEmpty() && stack.peek() != currentNum) {
                return false;
            }

            if (!standing.isEmpty() && currentNum == standing.peek()) {
                standing.pop();
                currentNum++;
            } else if (!stack.isEmpty() && currentNum == stack.peek()) {
                stack.pop();
                currentNum++;
            } else if (!standing.isEmpty()) {
                stack.push(standing.pop());
            }
        }
    }

    private static Deque<Integer> initializeStanding(String input) {
        Deque<Integer> standing = new ArrayDeque<>();
        String[] split = input.split(" ");
        for (int i = split.length; i > 0; i--) {
            standing.push(Integer.parseInt(split[i - 1]));
        }
        return standing;
    }
}
