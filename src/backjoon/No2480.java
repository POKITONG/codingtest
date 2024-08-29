package backjoon;
import java.util.Scanner;
public class No2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int reward = 0;

        if (a == b && b == c) {
            reward = 10000 + (a * 1000);
        } else if (a == b || a == c) {
            reward = 1000 + (a * 100);
        } else if (b == c) {
            reward = 1000 + (b * 100);
        } else {
            if (a > b && a > c) {
                reward = a *100;
            }
            if ( b > a && b > c) {
                reward = b *100;
            }
            if ( c > a && c > b) {
                reward = c *100;
            }
        }

        System.out.print(reward);
    }
}
