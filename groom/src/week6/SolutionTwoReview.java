package week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionTwoReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 97 ~ 122 (26)
        int len = scanner.nextInt();
        String str = scanner.next().trim();

        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < len; i += 2) {
            characterList.add(str.charAt(i));
        }

        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i < len; i += 2) {
            int num = (int) Math.pow(Character.getNumericValue(str.charAt(i)), 2);
            integerList.add(num);
        }

        decryption(len, characterList, integerList);
    }

    public static void decryption(int len, List<Character> characterList, List<Integer> integerList) {
        String answer = "";
        char[] alpha = new char[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = (char) (97 + i);
        }

        for (int i = 0; i < len / 2; i++) {
            int index = (characterList.get(i) + integerList.get(i));
            if (index > 122) {
                index -= 122;
                index %= 26;
            }else{
                index -= 96;
            }

            answer += alpha[index-1];
        }

        System.out.println(answer);
    }
}
