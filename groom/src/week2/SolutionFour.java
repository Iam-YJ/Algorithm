package week2;

import java.util.Scanner;

public class SolutionFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squreLen = scanner.nextInt();
        int bombNum = scanner.nextInt();

        int[][] map = new int[squreLen + 2][squreLen + 2];

        for (int i = 0; i < bombNum; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            bombCount(x, y, map);
        }

        int answer = 0;
        for (int i = 1; i <= squreLen; i++) {
            for (int j = 1; j <= squreLen; j++) {
                answer += map[i][j];
            }
        }
        System.out.println(answer);
    }

    public static void bombCount(int x, int y, int[][] map) {
        map[x][y] += 1;
        map[x + 1][y] += 1;
        map[x - 1][y] += 1;
        map[x][y + 1] += 1;
        map[x][y - 1] += 1;
    }
}
