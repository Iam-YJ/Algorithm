package week1;

import java.util.Scanner;

public class SolutionTwoReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String name = scanner.next();

        String[] names = new String[count];
        for (int i = 0; i < count; i++) {
            names[i] = scanner.next();
        }

        int answer = 0;

        for (int i = 0; i < names.length; i++) {
            if (names[i].contains(name)) {
                answer += 1;
            }
        }
        System.out.println(answer);

    }
}
