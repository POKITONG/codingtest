package backjoon.no1436;

import java.util.Scanner;

public class No1436V1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // 666이 들어가는 수중에 n 번째로 작은 숫자 구하기

        // 666 1666 2666 3666 ... 6660 6661 6662 ... 10666
        // 초반에는 *666 => 10번째 이후 11번째부터 666* => 20번째 이후 21번째부터 1*666 10666 11666 12666 ... 1666
        // *이 0부터라고 하면
        // 666 / *666 666* / **666 *666* 666** / ***666 **666* *666** 666*** / ****666 ***666* **666** *666*** 666****
        // 1  / 2~10 11~20 / 21~30 31~40 41~50 / 51~60  61~70  71~80  81~90  / 91~ 100 101~110

        // *****666 ****666* ***666** **666*** *666**** 666*****
        // 00000666 00001666 00002666 00003666 00009666 00006660 00006661

        int count = 0;

        String apocalypseNum = "666";

        // 1부터 계속 i 올리기
        // 666 포함되면 카운트 1 올리기
        //

        int i = 0;

        while (true) {
            if (count == n) {
                break;
            }
            String str = String.valueOf(i);
            if (str.contains(apocalypseNum)) {
                count++;
            }
            i++;
        }

        int result = i;
        System.out.println(result - 1);
    }
}
