package backjoon;
import java.util.Scanner;

public class No10813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int basketNumber = scanner.nextInt();
        int[] basket = new int [basketNumber + 1];

        for(int i = 1; i <= basketNumber; i++) {
            basket[i] = i;
        }

        int changeNumber = scanner.nextInt();

        int firstBasket = 0;
        int secondBasket = 0;

        for(int i = 0; i < changeNumber; i++) {
            firstBasket = scanner.nextInt();
            secondBasket = scanner.nextInt();
            int temp = 0;
            temp = basket[firstBasket];
            basket[firstBasket] = basket[secondBasket];
            basket[secondBasket] = temp;
        }

        for (int i = 1; i <= basketNumber; i++) {
            System.out.println(basket[i]);
        }
    }
}
