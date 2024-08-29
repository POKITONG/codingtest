package backjoon;

import java.util.Scanner;

public class No2738 {
    //문제 : N*M 크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

    //입력 : 첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
    //이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다.
    //N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

    //출력: 첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

    public static void main(String[] args) {
        //입력: N과 M
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        //입력: N개의 줄에 행렬 A의 원소 M개가 차례대로 주어짐
        insert(scanner, N, M, A);

        //입력: N개의 줄에 행렬 B의 원소 M개가 차례대로 주어짐.
        insert(scanner, N, M, B);

        // 합체
        int[][] result = sum(N, M, A, B);

        //N개의 줄에 행렬 A와 B를 더한 행렬을 출력
        printArray(N, M, result);
    }

    public static void insert(Scanner scanner, int N, int M, int[][] array) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] sum(int N, int M, int[][] array1, int[][] array2) {
        int[][] array = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return array;
    }

    public static void printArray(int N, int M, int[][] array) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
