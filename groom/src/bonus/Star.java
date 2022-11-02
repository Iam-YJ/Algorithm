package bonus;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = 1; i < count + 1; i++) {
            for (int j = count - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = count ; j > i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
