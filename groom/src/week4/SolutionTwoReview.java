package week4;

import java.util.Scanner;

public class SolutionTwoReview {
    static int[][] map;
    static int[][] newMap;
    static int count;

    static int[] x = {-1, 1, 0, 0};
    static int[] y = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();

        map = new int[count + 1][count + 1];
        newMap = new int[count + 1][count + 1];

        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        if (isColored()) {
            System.out.println(0);
        }

        int answer = 1;
        while (true) {
            for (int i = 1; i < count + 1; i++) {
                for (int j = 1; j < count + 1; j++) {
                    for (int k = 0; k < 4; k++) {
                        int newX = i + x[i];
                        int newY = i + y[i];

                        if (newX < 1 || newY < 1 || newX > count || newY > count) {
                            continue;
                        } else if (map[newX][newY] != 0) {
                            newMap[newX][newY] += 1;
                        }
                    }
                }
            }

            for (int i = 1; i <= count; i++) {
                for (int j = 1; j <= count; j++) {
                    map[i][j] = Math.max(0, map[i][j] - newMap[i][j]);
                }
            }

            if (isColored()) {
                break;
            }

            answer += 1;

            for (int i = 1; i <= count; i++) {
                for (int j = 1; j <= count; j++) {
                    map[i][j] = 0;
                }
            }
            System.out.println(answer);
        }
    }

    public static boolean isColored() {
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count; j++) {
                if (map[i][j] != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
