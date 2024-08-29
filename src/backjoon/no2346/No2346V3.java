package backjoon.no2346;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class No2346V3 {
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

        // 풍선 개수 N값 입력받기
        int N = scanner.nextInt();
        scanner.nextLine(); //\n

        Deque<Balloon> balloon = new ArrayDeque<>();

        String num = scanner.nextLine();
        String[] strNum = num.split(" ");
        for (int i = 0; i < N; i++) {
            balloon.offer(new Balloon(Integer.parseInt(strNum[i]), i + 1));
        }


        System.out.println(balloon);


        // 풍선을 터뜨린다 == 풍선의 번호를 구하고, 인덱스를 출력한 후 빼낸다.
        // 그 뒤 번호만큼 인덱스 + 를 하고 터뜨리기 반복
        // 언제까지? 풍선이 다 없어질때까지.

        // 첫번째가 문제가 되는 이유:
        // 반복문에 넣게 되면 무조건 한 번은 반복해야 되므로 첫번째 풍선이 안터진다.
        // 첫 번째 풍선을 먼저 터뜨리고 해당 값을 반복문에 넣어서 돌려야 한다.



        // 풍선 번호만큼 반복
        // 다만 balloonNum 이 양수면 앞에서 빼서 뒤로 보내기,
        // balloonNum 이 음수면 뒤에서 빼서 앞으로 보내기

        // 보낸 다음에 꺼내기


        // 첫 번째 풍선 터뜨리기
        Balloon current = balloon.poll();

        System.out.println(current.getIndex());

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
            System.out.println(current.getIndex());

        }

    }
}
