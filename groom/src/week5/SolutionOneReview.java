package week5;

import java.util.Scanner;

public class SolutionOneReview {
    static int[][] map;
    static int answer;
    static int N;
    static int M;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        map = new int[N + (2 * M)][N + (2 * M)];

        for (int i = M; i <= N + 1; i++) {
            for (int j = M; j <= N + 1; j++) {
                int num = scanner.nextInt();
                map[i][j] = num;
            }
        }
        checkAntHouse();
        System.out.println(answer);
    }

    public static void checkAntHouse() {
        for (int i = M; i < map.length - M; i++) {
            for (int j = M; j < map.length - M; j++) {
                if (map[i][j] == 1) {
                    if (checkBugHouse(i, j)) {
                        answer++;
                    }
                }
            }
        }
    }

    public static boolean checkBugHouse(int i, int j) {
        int[] x = {(-1) * M, M, 0, 0};
        int[] y = {0, 0, (-1) * M, M};

        for (int k = 0; k < 4; k++) {
            i += x[k];
            j += y[k];

            if (map[i][j] == 2) {
                return true;
            }
        }

        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (map[k][l] == 2) {
                    return true;
                }
            }
        }

        return false;
    }

}
