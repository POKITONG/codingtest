package backjoon.no1427;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class No1427V1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        Character[] arr = new Character[num.length()];

        for (int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (char c : arr) {
            System.out.print(c);
        }
    }
}
