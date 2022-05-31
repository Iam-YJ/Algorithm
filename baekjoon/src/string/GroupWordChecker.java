package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class GroupWordChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wordCount = scan.nextInt();

        int result = 0;

        for (int i = 0; i < wordCount; i++) {
            String word = scan.next();
            result += wordChecker(word);
        }

        System.out.println(result);
    }

    static int wordChecker(String word) {
        int result = 0;
        char[] wordArray = word.toCharArray();
        HashSet<Character> characterHashSet = new HashSet<>();

        char prev = ' ';

        for (int i = 0; i < wordArray.length; i++) {
            prev = wordArray[i];
            for (int j = 0; j < i; j++) {

            }
        }

        return 0;
    }
}
