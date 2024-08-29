package backjoon;
import java.util.Scanner;
public class No2562 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int index = 0;
        int[] array = new int [9];
        for (int i = 0; i < 9; i++){
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < 9; i++){
            if (max < array[i]){
                max = array[i];
                index = i + 1;
            }
        }

        System.out.printf("%d\n%d",max, index);
    }
}
