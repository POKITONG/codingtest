package backjoon.no2720;

import java.util.Scanner;

public class No2720V4 {

    public static void main(String[] args) {
        // 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
        // 각 테스트 케이스는 거스름돈 C를 나타내는 정수 하나로 이루어져 있다. C의 단위는 센트이다.
        // (1달러 = 100센트) (1<=C<=500)

        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스 개수 입력받기
        int T = scanner.nextInt();

        // 거스름돈 입력받기
        getChanges(scanner, T);

    }

    private static void getChanges(Scanner scanner, int T) {
        for (int i = 0; i < T; i++) {
            int change = scanner.nextInt();
            int quarter = change / 25;
            int dime = (change % 25) / 10;
            int nickel = ((change % 25) % 10) / 5;
            int penny = ((change % 25) % 10) % 5;

            printChanges(quarter, dime, nickel, penny);
        }
    }

    private static void printChanges(int quarter, int dime, int nickel, int penny) {
        System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
    }
}
