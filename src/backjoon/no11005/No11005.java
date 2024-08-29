package backjoon.no11005;

import java.util.Scanner;

public class No11005 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] strArr = input.split(" ");


        // strArr[0]을 strArr[1]진법으로 바꾸기

        int N = Integer.parseInt(strArr[0]);
        int B = Integer.parseInt(strArr[1].trim());


        String result = Integer.toString(N, B);

        System.out.println(result.toUpperCase());



    }
}
