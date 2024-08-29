package backjoon;

import java.util.Scanner;

public class No10798 {

    // 입력: 총 다섯줄의 입력이 주어진다. 각 줄에는 최소 1개, 최대 15개의 글자들이 빈칸 없이 연속으로 주어진다.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 5줄의 입력 = 5행, 열은 랜덤
        // 글자는 최대 15글자가 입력된다.

        int row = 5;
        int col = 15;

        char[][] input = new char[row][col];

        // row 가 0부터 4가 될 때까지 입력
        // row 는 \n (엔터) 를 칠 때마다 1씩 카운트된다.
        // col 은 row 가 1 늘어나면 0으로 돌아가야 된다.

        // ㅈ같다 전부 공백을 넣자

        insertBlank(row, col, input);

        // 입력받기
        input(row, scanner, input);

        // input 배열을 문제에 맞춰서 출력
        // input[0][0] . [1][0], [2][0]

        print(col, row, input);

    }

    private static void insertBlank(int row, int col, char[][] input) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                input[i][j] = ' ';
            }
        }
    }

    private static void print(int col, int row, char[][] input) {
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (input[j][i] != ' ') {
                    System.out.print(input[j][i]);
                }
            }
        }
    }

    private static void input(int row, Scanner scanner, char[][] input) {
        for (int i = 0; i < row; i++) {
            String str = scanner.nextLine();
            int max = str.length();
            for (int j = 0; j < max; j++) {
                input[i][j] = str.charAt(j);
            }
        }
    }

}
