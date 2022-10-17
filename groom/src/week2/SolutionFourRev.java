package week2;

import java.util.Scanner;

public class SolutionFourRev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squreLen = scanner.nextInt();
        int bombCount = scanner.nextInt();

        int[][] matrix = new int[squreLen + 2][squreLen + 2];
        for (int i = 0; i < bombCount; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            bomb(x, y, matrix);
        }

        int answer = 0;
        for (int i = 1; i <= squreLen; i++) {
            for (int j = 1; j <= squreLen; j++) {
                answer += matrix[i][j];
            }
        }
        System.out.println(answer);
    }

    public static void bomb(int x, int y, int[][] matrix) {
        matrix[x][y] += 1;
        matrix[x - 1][y] += 1;
        matrix[x + 1][y] += 1;
        matrix[x][y - 1] += 1;
        matrix[x][y + 1] += 1;
    }
}
