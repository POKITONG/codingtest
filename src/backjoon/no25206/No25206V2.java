package backjoon.no25206;

import java.util.Scanner;
import java.util.function.Function;

public class No25206V2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var totalScore = 0.0;
        var totalCredit = 0.0;
        var subjectNum = 20;

        for (int i = 0; i < subjectNum; i++) {
            String subject = scanner.next();
            double credit = scanner.nextDouble();
            String grade = scanner.next();

            Function<String, Double> getScore = String -> switch (grade) {
                case "A+" -> 4.5;
                case "A0" -> 4.0;
                case "B+" -> 3.5;
                case "B0" -> 3.0;
                case "C+" -> 2.5;
                case "C0" -> 2.0;
                case "D+" -> 1.5;
                case "D0" -> 1.0;
                case "F" -> 0.0;
                default -> 0.0;
            };

            if (!grade.equals("P")) {
                double score = getScore.apply(grade);
                totalCredit += credit;
                totalScore += credit * score;
            }

        }

        double average = totalScore / totalCredit;
        System.out.printf("%.6f", average);

    }

}
