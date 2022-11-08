package bonus;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Ground {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int c = x * 2;
        double ab = y * 2 * (3.141592);

        System.out.printf("%.6f", (c + ab));

    }
}
