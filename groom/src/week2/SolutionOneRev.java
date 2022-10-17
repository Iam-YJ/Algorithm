package week2;

import java.util.Scanner;

public class SolutionOneRev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCount = scanner.nextInt();

        for (int i = 0; i < testCount; i++) {
            int peopleCount = scanner.nextInt();
            int[] scoreArr = new int[peopleCount];
            for (int j = 0; j < scoreArr.length; j++) {
                scoreArr[j] = scanner.nextInt();
            }
            calculate(peopleCount, scoreArr);
        }
    }

    public static void calculate(int peopleCount, int[] scoreArr) {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum += (scoreArr[i]);
        }
        avg = sum / peopleCount;

        int answer = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            if ((scoreArr[i]) >= avg) {
                answer += 1;
            }
        }
        System.out.println(answer + "/" + peopleCount);
    }
}
