package backjoon.no12789;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class No12789V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 줄서있는곳에 학생들은 서있는 순서가 있고 가지고 있는 번호표가 있음
        // 한 명씩 서있는 곳 stack


        Deque<Integer> stack = new ArrayDeque<>();

        int n = scanner.nextInt();
        scanner.nextLine(); // \n'=
        String input = scanner.nextLine();

        Deque<Integer> standing = initializeStanding(input);
        // 메모리 낭비 X

        int currentNum = 1;
        // 아이의 번호가 currentNum 과 같으면 제거, 그렇지 않으면 stack 에 넣기
        // standing 의 값을 빼고 나면 stack 과 currentNum 비교
        // currentNum 과 stack 의 값을 비교해서 같으면 빼기
        // stack 이나 standing 에서 == currentNum 이 되어서 pop() 되면 currentNum++
        // 언제까지? currentNum 이 n 을 넘어설 때 까지

        // Sad 의 경우
        // standing 이 isEmpty() 이고 stack 은 !isEmpty() 인데
        // stack.peek() != currentNum 일 때

        extracted(currentNum, n, standing, stack);
    }

    private static void extracted(int currentNum, int n, Deque<Integer> standing, Deque<Integer> stack) {
        while (true) {
            if (currentNum > n) {
                System.out.println("Nice");
                break;
            }
            if (standing.isEmpty() && stack.peek() != currentNum) {
                System.out.println("Sad");
                break;
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
