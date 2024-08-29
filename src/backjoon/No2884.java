package backjoon;
import java.util.Scanner;
public class No2884 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int h = scanner.nextInt();
       int m = scanner.nextInt();
       int printH = h;
       int printM = m - 45;

       if (printM < 0) {
           printH -= 1;
           if (printH < 0) {
               printH += 24;
           }
           printM = 60 + (printM);
       }

       System.out.printf("%d %d", printH, printM);
    }
}
