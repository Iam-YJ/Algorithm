package week6;

import java.util.Scanner;

public class SolutionOneReveiw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            sevenGame(num);
        }
    }

    public static void sevenGame(int num) {
        int a = 0;
        for (int i = 0; i < String.valueOf(num).length(); i += 2) {
            a += Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i)));
        }

        for (int i = 1; i < String.valueOf(num).length(); i += 2) {
            if (Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i))) != 0) {
                a *= Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i)));
            }
        }


        System.out.println((String.valueOf(a).charAt(String.valueOf(a).length() - 1)));
    }
}

