package study.week6.divideandconquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1780 {
    static int num;
    static int[][] numArr;
    static int minusOne;
    static int zero;
    static int one;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        num = Integer.parseInt(br.readLine());
        numArr = new int[num][num];

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < num; j++) {
                numArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Divide(0, 0, num);

        System.out.println(minusOne);
        System.out.println(zero);
        System.out.println(one);

    }

    public static void Divide(int x, int y, int size) {
        if (Check(x, y, size)) {
            int num = numArr[x][y];

            if (num == -1) {
                minusOne += 1;
            } else if (num == 0) {
                zero += 1;
            } else if (num == 1) {
                one += 1;
            }
            return;
        }

        int newSize = size / 3;
        for (int i = x; i < (x + size); i += newSize) {
            for (int j = y; j < (y + size); j += newSize) {
                Divide(i, j, newSize);
            }
        }

    }

    public static boolean Check(int x, int y, int size) {
        for (int i = x; i < (x + size); i++) {
            for (int j = y; j < (y + size); j++) {
                if (numArr[x][y] != numArr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
