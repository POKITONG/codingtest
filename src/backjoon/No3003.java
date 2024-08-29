package backjoon;
import java.util.Scanner;
public class No3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int height = (2 * n) - 1;
        int lowerI = 0;

        for (int i = 1; i <=height; i++) {
            String stars = "";
            int starWidth = 0;
            int spaceWidth = 0;
            if (i < n) {
                spaceWidth = n - i;
                starWidth = (2 * i) - 1;
            } else {
                lowerI = (2 * n) - i;
                spaceWidth = n - lowerI;
                starWidth = (2 * lowerI) - 1;
            }
            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
    }

}
