package backjoon;

import java.util.Scanner;

public class No2566 {

    public static void main(String[] args) {

        // 입력: 첫째 줄부터 아홉 번째 줄까지 한 줄에 아홉 개씩 수가 주어진다. 주어지는 수는 100보다 작은 자연수 또는 0이다.
        // 출력: 첫째 줄에 최댓값을 출력하고,
        // 둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다.
        // 최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다.

        Scanner scanner = new Scanner(System.in);
        int row = 9;
        int col = 9;

        //입력
        int[][] array = input(scanner, row, col);

        //비교
        Result result = getResult(array);

        //출력
        System.out.println(result.max());
        System.out.println(result.a() + " " + result.b());
    }

    private static Result getResult(int[][] array) {
        int max = -1;
        int a = 0, b = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    a = i + 1;
                    b = j + 1;
                }
            }
        }
        Result result = new Result(max, a, b);
        return result;
    }

    private record Result(int max, int a, int b) {
    }

    public static int[][] input(Scanner scanner, int row, int col) {
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

}
