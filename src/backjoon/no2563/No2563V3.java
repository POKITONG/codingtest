package backjoon.no2563;

import java.util.Scanner;

public class No2563V3 {

    public static void main(String[] args) {

        // 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다.
        // 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다.
        // 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.


        //입력: 첫째 줄에 색종이의 수가 주어진다. 이어 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다.
        // 색종이를 붙인 위치는 두 개의 자연수로 주어지는데 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고,
        // 두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다.
        // 색종이의 수는 100 이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다

        Scanner scanner = new Scanner(System.in);

        // 흰 도화지 넓이 = 100 * 100 = 10000
        int row = 100;
        int col = 100;
        boolean[][] whitePaper = new boolean[row][col];

        // 도화지 0으로 채우기

        initializePaper(row, col, whitePaper);

        // 색종이 개수 입력받기
        int paperNum = scanner.nextInt();

        // 색종이 위치 입력받기
        // 색종이 위치를 whitePaper 배열에서 1로 바꾸기


        for (int i = 0; i < paperNum; i++) {
            int left = scanner.nextInt();
            int bottom = scanner.nextInt();
            attPap(left, bottom, whitePaper);
        }

        // 배열에서 1의 개수 구하기
        int count = 0;
        count = CountPaperArea(row, col, whitePaper, count);

        System.out.println(count);

    }

    private static int CountPaperArea(int row, int col, boolean[][] whitePaper, int count) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (whitePaper[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    private static void initializePaper(int row, int col, boolean[][] whitePaper) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                whitePaper[i][j] = false;
            }
        }
    }

    private static void attPap(int left, int bottom, boolean[][] whitePaper) {
        for (int j = left; j < left + 10; j++) {
            for (int k = bottom; k < bottom + 10; k++) {
                whitePaper[j][k] = true;
            }
        }
    }
}
