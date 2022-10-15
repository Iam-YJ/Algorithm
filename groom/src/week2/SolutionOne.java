package week2;

import java.util.Scanner;

public class SolutionOne {
//    시험의 개수 t - 시험 정보는 t개 주어짐
//    첫째 줄에는 응시 인원 수 n
//    둘째 줄에는 시험 성적이 공백을 두고 주어짐
//    시험 합격자의 수(평균 이상이여야함) / 응시자의 수

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] scores = new int[n];
            for (int j = 0; j < scores.length; j++) {
                scores[j] = scanner.nextInt();
            }

            calcutale(n, scores);
        }
    }

    public static void calcutale(int n, int[] scores) {
        int a = 0;
        int b = n;
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double avg = sum/b;

        System.out.println("Avg " + avg);

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= avg) {
                a += 1;
            }
        }

        System.out.println(a + "/" + b);
    }
}
