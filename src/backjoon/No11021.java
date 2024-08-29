package backjoon;
import java.util.Scanner;
public class No11021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int a = 0, b = 0;
        int num = 1;

        for (int i = 1; i <= t; i++) {
                a = scanner.nextInt(); b = scanner.nextInt();
                System.out.printf("Case #%d: %d\n", num, a + b);
                num ++;
        }
        /*Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int num = 1;

        while (t > 0) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            System.out.printf("Case #%d : %d\n", num++, a + b);
            t--;
        }*/
    }
}
