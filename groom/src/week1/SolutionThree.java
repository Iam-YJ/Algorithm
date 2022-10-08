package week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SolutionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            numList.add(scanner.nextInt());
        }

        int answer = 0;

        int max = Collections.max(numList);
        numList.remove(numList.indexOf(max));
        int min = Collections.min(numList);
        numList.remove(numList.indexOf(min));

        answer += Math.abs(max - min);
        answer += Math.abs(numList.get(0) - numList.get(1));

        System.out.println(answer);

    }
}
