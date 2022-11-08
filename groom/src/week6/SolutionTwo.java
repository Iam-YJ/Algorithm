package week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<String> answerList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            answerList.add(a);
        }

        for (int i = 0; i < answerList.size(); i++) {
            System.out.println(answerList.get(i));
        }


    }
}
