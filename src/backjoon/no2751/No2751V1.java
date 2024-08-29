package backjoon.no2751;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class No2751V1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> set = new TreeSet<>();

        int n = scanner.nextInt();
        scanner.nextLine(); // \n

        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }

        set.stream().sorted();
        for (Integer integer : set) {
            System.out.println(integer);
        }

        
    }
}
