package week4;

import java.util.Scanner;

public class SolutionTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();

        int[][] park = new int[len+2][len+2];

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 ; j++) {
                park[i][j] = scanner.nextInt();
            }
        }

        int answer = 0;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 ; j++) {
                if(park[i][j] != 0){

                }
            }
        }


    }
}
