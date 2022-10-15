package week2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SolutionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int findNum = scanner.nextInt();

        String[][] arrays = new String[count][2];

        for (int i = 0; i < count; i++) {
            arrays[i][0] = scanner.next();
            arrays[i][1] = scanner.next();
        }

        String name = arrays[0][0];
        for (int i = 1; i < arrays.length; i++) {
            if(name.equals(arrays[i][0])){
                Arrays.sort(arrays[1]);
            }
        }

        System.out.println(arrays[findNum-1][0] + " " + arrays[findNum-1][1]);

    }
}
