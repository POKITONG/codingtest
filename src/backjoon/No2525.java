package backjoon;
import java.util.Scanner;
public class No2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentHour = scanner.nextInt(), currentMinute = scanner.nextInt();
        int needMinute = scanner.nextInt();
        int printHour = currentHour;
        int printMinute = currentMinute + needMinute;

        while (printMinute >= 60) {
            printHour += 1;
            if (printHour >= 24) {
                printHour -= 24;
            }
            printMinute = printMinute - 60;
        }

        System.out.printf("%d %d", printHour, printMinute);
    }
}
