package backjoon.No2745;

import java.util.Scanner;

public class No2745V1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] strArr = input.split(" ");

        int result = Integer.parseInt(strArr[0], Integer.parseInt(strArr[1]));

        System.out.println(result);
    }

}