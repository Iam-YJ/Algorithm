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
        numList = new int[numCount+1];
        permutedList = new int[numCount+1];
        visited = new boolean[numCount + 1];

        for (int i = 0; i < numCount; i++) {
            numList[i] = scanner.nextInt();
        }

        Arrays.sort(numList);
        Permutation(0);
    }

    public static void Permutation(int n) {


    }
}
