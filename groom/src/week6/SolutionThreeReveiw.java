package week6;

import java.util.Scanner;

public class SolutionThreeReveiw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            String str = scanner.nextLine();
            String key = scanner.next();
            letter(str, key);
        }

    }

    public static void letter(String str, String key) {
        System.out.println(str);
        System.out.println(key);
    }
}
