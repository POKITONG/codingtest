package backjoon;
import java.util.Scanner;
public class No25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        int n = scanner.nextInt();
        int amount = 0;
        long result = 0;

        while (n > 0) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            amount = a * b;
            result = result + amount;
            n--;
        }

        if (result == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
