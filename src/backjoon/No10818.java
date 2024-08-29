package backjoon;
import java.util.Scanner;
public class No10818 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        // 최대값, 최소값 변수 선언하기
        int max = -1000000;
        int min = 1000000;
        //정수의 개수 받아서 배열에 저장하기
        int n = scanner.nextInt();

        int[] nNumber = new int[n];

        for (int i = 0; i < nNumber.length; i++){
            nNumber[i] = scanner.nextInt();
        }

        // 배열의 수들끼리 비교해서 최대값, 최소값 구하고 저장하기
        // max 값과 비교해서 더 크다면 대체하기.
        for (int i = 0; i < nNumber.length; i++){
            if(max < nNumber[i]){
                max = nNumber[i];
            }
            if(min > nNumber[i]){
                min = nNumber[i];
            }
        }

        System.out.printf("%d %d", min, max);

    }
}
