package programers.no12932;

import java.util.Arrays;
import java.util.Scanner;

public class No12932V1 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var str = new StringBuilder(scanner.next())
                .reverse()
                .toString();

        var array = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i) - '0';
        }

        System.out.println(Arrays.toString(array));
    }
}
