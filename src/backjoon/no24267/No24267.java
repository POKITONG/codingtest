package backjoon.no24267;

import java.util.Scanner;

public class No24267 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        System.out.println((n * (n - 1) * (n - 2)) / 6);
        System.out.println("3");


    }
}
