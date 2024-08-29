package backjoon;
import java.util.Scanner;
public class No10871 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), x = scanner.nextInt();
        int[] aArray = new int[n];
        for (int i = 0; i < aArray.length; i++){
            aArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < aArray.length; i++){
            if (aArray[i] < x && aArray[i] != 0) {
                System.out.printf("%d ", aArray[i]);
            }
        }
    }
}
