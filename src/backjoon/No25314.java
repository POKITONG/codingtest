package backjoon;
import java.util.Scanner;
public class No25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = "";

        for (int i = 1; i <= n / 4; i++) {
            str += "long ";
        }
        System.out.println(str + "int");
    }

}
