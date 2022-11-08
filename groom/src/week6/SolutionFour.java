package week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionFour {
    static int[][] map;
    static int fightCount;
    static int answer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kindCount = scanner.nextInt();
        fightCount = scanner.nextInt();

        map = new int[1001][1001];
        answer = 0;

        for (int i = 0; i < kindCount; i++) {
            int xOne = scanner.nextInt();
            int yOne = scanner.nextInt();
            int xTwo = scanner.nextInt();
            int yTwo = scanner.nextInt();

            ColoredMap(xOne, yOne, xTwo, yTwo);
        }
        for (int i = 1; i < 1001; i++) {
            for (int j = 1; j < 1001; j++) {
                if (map[i][j] == fightCount) {
                    answer += 1;
                }

            }
        }
        System.out.println(answer);

    }

    public static void ColoredMap(int xOne, int yOne, int xTwo, int yTwo) {
        for (int i = yOne; i <= yTwo; i++) {
            for (int j = xOne; j <= xTwo; j++) {
                int cnt = map[i][j];
                map[i][j] = cnt + 1;
            }
        }


    }
}
