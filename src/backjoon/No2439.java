package backjoon;
import java.util.Scanner;
public class No2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        // 프린트가 5번 반복돼야 한다.
        // 공백이 각 줄마다 n - 해당 열 만큼 생겨야 한다.
        // 별이 각 줄마다 해당 열만큼 생겨서 n개까지 생겨야 한다.

        for (int i = 0; i < n; i++) {
            String stars = "";
            for (int j = 1; j < n - i; j++) {
                stars += " ";
            }
            for (int j = 0; j <= i; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }

    }
}
