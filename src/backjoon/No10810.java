package backjoon;

import java.util.Scanner;

public class No10810 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫째줄에 N과 M 입력받기
        int number = scanner.nextInt();
        int count = scanner.nextInt();

        int[] basketArray = new int [number + 1];

        int firstBasket;
        int lastBasket;
        int ballNumber;

        for (int i = 1; i <= count; i++) {
            firstBasket = scanner.nextInt();
            lastBasket = scanner.nextInt();
            ballNumber = scanner.nextInt();
            for (int j = firstBasket; j <= lastBasket; j++) {
                basketArray[j] = ballNumber;
            }
        }

        for (int i = 1; i < number + 1; i++) {
            System.out.printf("%d ", basketArray[i]);
        }

    }
}
