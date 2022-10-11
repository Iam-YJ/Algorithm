package week1;

import java.util.Scanner;

public class SolutionFourReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numArr = new int[count + 1];

        for (int i = 1; i < numArr.length; i++) {
            numArr[i] = scanner.nextInt();
        }

        boolean[] prime = new boolean[count + 1];
        int answer = 0;

        prime[0] = prime[1] = true;

        for (int i = 2; i * i <= count; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= count; j += i) {
                    prime[j] = true;

                }
            }
        }

        for (int i = 1; i <= count; i++) {
            if (!prime[i]) {
                answer += numArr[i];
            }
        }
        System.out.println(answer);
    }
}
