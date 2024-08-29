package backjoon;
import java.util.Scanner;
public class No2438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String stars = "";

        for (int i = 1; i <=n; i++) {
            stars += "*";
            System.out.println(stars);
        }
    }
}
