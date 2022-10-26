package bonus;

import java.util.Scanner;

public class Confused {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int numCount = 0;
        int iCount = 0;
        int lCount = 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                numCount++;
            } else if (str.charAt(i) == 'I') {
                iCount++;
            } else if (str.charAt(i) == 'l') {
                lCount++;
            } else if (str.charAt(i) == '|') {
                count++;
            }
        }

        System.out.println(numCount);
        System.out.println(iCount);
        System.out.println(lCount);
        System.out.println(count);
    }
}
