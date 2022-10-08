package week1;

import java.util.Scanner;

public class SolutionFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numArr = new int[count + 1];
        boolean[] indexArr = new boolean[count + 1];

        for (int i = 1; i < numArr.length; i++) {
            numArr[i] = scanner.nextInt();
        }

        int N = count;
        indexArr[0] = indexArr[1] = true;
        for (int i = 2; i * i <= N; i++) {
            if (!indexArr[i]) {
                // prime[j] 소수가 아닌 표시
                for (int j = i * i; j <= N; j += i) indexArr[j] = true;
            }
        }

        int answer = 0;
        for (int i = 1; i < numArr.length; i++) {
            if (!indexArr[i]) {
                answer += numArr[i];
            } else {
                continue;
            }
        }

        System.out.println(answer);
    }
}
