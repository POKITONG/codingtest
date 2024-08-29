package backjoon.no2346;

import java.util.*;

public class No2346V1 {
    public static void main(String[] args) {

        // 입력 :
        // 첫째 줄에 자연수 N(1 ≤ N ≤ 1,000)이 주어진다.
        // 다음 줄에는 차례로 각 풍선 안의 종이에 적혀 있는 수가 주어진다. 종이에 0은 적혀있지 않다.

        // 출력: 첫째 줄에 터진 풍선의 번호를 차례로 나열한다.

        // 필요한 것 : 풍선의 번호 (인덱스)

        // 풍선에 있는 숫자대로 오른쪽으로 이동
        // 음수면 왼쪽으로 이동
        // 오른쪽으로 이동할 곳이 없으면 처음으로 이동, 왼쪽으로 이동할 곳이 없으면 맨 끝으로 이동

        // 풍선 개수 저장
        // 터뜨리지 않는 풍선은 터진 풍선이 나올때까지 빼서 뒤로 넣는다.
        // 번호값이 양수면 뒤로 넣고, 번호값이 음수면 앞으로 넣는다.

        Scanner scanner = new Scanner(System.in);

        // 풍선 개수 N값 입력받기
        int N = scanner.nextInt();
        scanner.nextLine(); //\n

        Deque<Integer> balloon = new ArrayDeque<>();

        String num = scanner.nextLine();
        String[] strNum = num.split(" ");
        for (int i = 0; i < N; i++) {
            balloon.offer(Integer.parseInt(strNum[i]));
        }

        System.out.println(balloon);

        // 첫 번째 풍선 터뜨리기


        // 풍선 번호만큼 반복
        // 다만 balloonNum 이 양수면 앞에서 빼서 뒤로 보내기,
        // balloonNum 이 음수면 뒤에서 빼서 앞으로 보내기


        int index = 1;
        Integer balloonNum = balloon.peek();
        System.out.println(balloonNum);
        System.out.println(balloon);

        for (int i = 0; i < Math.abs(balloonNum); i++) {
            if (balloonNum > 0) {
                balloon.offerLast(balloon.pollFirst());
            } else if (balloonNum < 0) {
                balloon.offerFirst(balloon.pollLast());
            }
        }
        System.out.println(balloon.peek());
        System.out.println(balloon);
        balloonNum = balloon.peek();

        for (int i = 0; i < Math.abs(balloonNum); i++) {
            if (balloonNum > 0) {
                balloon.offerLast(balloon.pollFirst());
            } else if (balloonNum < 0) {
                balloon.offerFirst(balloon.pollLast());
            }
        }

        System.out.println(balloon.peek());
        System.out.println(balloon);
        balloonNum = balloon.peek();

    }
}
