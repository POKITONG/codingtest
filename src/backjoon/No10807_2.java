package backjoon;
import java.util.Scanner;
public class No10807_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nArray = new int[n];
        int count = 0;

        for(int i = 0; i < nArray.length; i++) {
            nArray[i] = scanner.nextInt();
        }
        int v = scanner.nextInt();

        for(int i = 0; i < nArray.length; i++) {
            if(nArray[i] == v) {
                count++;
            }
        }

        System.out.print(count);
    }
}
