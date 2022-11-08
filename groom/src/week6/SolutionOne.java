package week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionOne {
    static List<Integer> answerList;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        answerList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            SevenGame(num);
        }

        for (int i = 0; i < answerList.size(); i++) {
            System.out.println(answerList.get(i));
        }
    }

    public static void SevenGame(int num) {
        String numStr = String.valueOf(num);
        int a = 0;

        a += Integer.parseInt(String.valueOf(numStr.charAt(0)));
        a += Integer.parseInt(String.valueOf(numStr.charAt(2)));
        a += Integer.parseInt(String.valueOf(numStr.charAt(4)));
        a += Integer.parseInt(String.valueOf(numStr.charAt(6)));

        for (int i = 1; i < numStr.length(); i += 2) {
            int numChar = Integer.parseInt(String.valueOf(numStr.charAt(i)));
            if (numChar != 0) {
                a *= numChar;
            }
        }
        a %= 10;
        answerList.add(a);
    }
}
