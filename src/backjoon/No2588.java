package backjoon;
import java.util.Scanner;

public class No2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aNum = scanner.nextInt();
        int bNum = scanner.nextInt();

        int bNum100 = bNum / 100;
        int bNum10 =  (bNum % 100) / 10;
        int bNum1 = (bNum % 100) % 10;

        int firstLine = aNum * bNum1;
        int secondLine = aNum * bNum10;
        int thirdLine = aNum * bNum100;

        int result = firstLine + (10 * secondLine) + (100 * thirdLine);

        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(thirdLine);
        System.out.println(result);


    }
}
