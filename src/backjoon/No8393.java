package backjoon;
import java.util.Scanner;
public class No8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = 1;
        int result = 0;

        while (m <= n) {
            result = result + m;
            m++;
        }

        System.out.println(result);
    }
}
