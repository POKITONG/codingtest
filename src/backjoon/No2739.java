package backjoon;
import java.util.Scanner;
public class No2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int table = 1;
        while (table <= 9) {
            int answer = n * table;
            System.out.printf("%d * %d = ", n, table);
            System.out.print(answer);
            System.out.println();
            table++;
        }
    }
}
