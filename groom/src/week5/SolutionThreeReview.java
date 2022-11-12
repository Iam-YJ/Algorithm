package week5;

import java.util.*;

public class SolutionThreeReview {
    static int numCount;
    static int[] numList;
    static int[] permutedList;
    static boolean[] visited;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        numCount = scanner.nextInt();
        numList = new int[numCount + 1];
        permutedList = new int[numCount + 1];
        visited = new boolean[numCount + 1];

        for (int i = 0; i < numCount; i++) {
            numList[i] = scanner.nextInt();
        }

        Arrays.sort(numList);
        Permutation(0, numList.length, 4);
    }

    public static void Permutation(int depth, int n, int r) {
        if (depth == r) {
            for (int i = 0; i < permutedList.length; i++) {
                System.out.println(permutedList[i]);
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                permutedList[depth] = numList[i];
                Permutation(depth + 1, n, r);
                permutedList[depth] = 0;
                visited[i] = false;
            }
        }

    }
}
