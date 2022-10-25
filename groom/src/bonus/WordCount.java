package bonus;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] strArr = str.split("\\s+");

        System.out.println(strArr.length);
    }
}
