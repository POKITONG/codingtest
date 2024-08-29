package backjoon.no12789;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class No12789V1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 줄서있는곳에 학생들은 서있는 순서가 있고 가지고 있는 번호표가 있음
        // 한 명씩 서있는 곳 stack


        // 한명씩 서 있는곳 만들기
        Deque<Integer> stack = new ArrayDeque<>();

        int n = scanner.nextInt();

        // 줄 서있는곳에 학생 수만큼 번호 넣기
        Deque<Integer> standing = new ArrayDeque<>();
        String g = scanner.nextLine();
        String input = scanner.nextLine();
        String[] split = input.split(" ");

        // 받은 번호 standing 에 넣기

        for (int i = split.length; i > 0; i--) {
            standing.push(Integer.parseInt(split[i - 1]));
        }

        int currentNum = 1;
        // 아이의 번호가 currentNum 과 같으면 제거, 그렇지 않으면 stack 에 넣기
        // standing 의 값을 빼고 나면 stack 과 currentNum 비교
        // currentNum 과 stack 의 값을 비교해서 같으면 빼기
        // stack 이나 standing 에서 == currentNum 이 되어서 pop() 되면 currentNum++
        // 언제까지? currentNum 이 n 을 넘어설 때 까지

        // Sad 의 경우
        // standing 이 isEmpty() 이고 stack 은 !isEmpty() 인데
        // stack.peek() != currentNum 일 때

        while (true) {
            // currentNum == n 이면 전부 빠져나간것, 그래서 그 상태에서 currentNum++ 이 되면 끝
            if (currentNum > n) {
                System.out.println("Nice");
                break;
            }

            // 줄이 비어있는데 stack 의 다음번이 currentNum 과 같지 않으면 실패
            if (standing.isEmpty() && stack.peek() != currentNum) {
                System.out.println("Sad");
                break;
            }

            // currentNum 과 줄의 학생이 가진 번호가 같으면 빼기
            if (!standing.isEmpty() && currentNum == standing.peek()) {
                // 널
                standing.pop();
                currentNum++;
            } else if (!stack.isEmpty() && currentNum == stack.peek()) {
                // 원래 이게 else if 가 아니고 내부의 if였음.
                // 그랬더니 stack 이 null 값 오류가 떠서 else if로 밖으로 빼고 currentNum 과 같은지 확인
                stack.pop();
                currentNum++;
            } else {
                // standing != currentNum 인데 stack != currentNum 이면 standing stack 으로 옮기기
                if (!standing.isEmpty()) {
                    stack.push(standing.peek());
                    standing.pop();
                }
            }
        }
    }
}
