package week2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SolutionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int findNum = scanner.nextInt();

        String[][] nameArr = new String[count][2];
        int[][] heightArr = new int[count][2];

        for (int i = 0; i < count; i++) {
            nameArr[i][1] = scanner.next();
            heightArr[i][1] = scanner.nextInt();

            nameArr[i][0] = String.valueOf(i);
            heightArr[i][0] = i;


        }

        String name = nameArr[0][0];
        for (int i = 1; i < nameArr.length; i++) {
            if(name.equals(nameArr[i][0])){
                Arrays.sort(nameArr[1]);
            }
        }

        System.out.println(arrays[findNum-1][0] + " " + arrays[findNum-1][1]);

    }
}
