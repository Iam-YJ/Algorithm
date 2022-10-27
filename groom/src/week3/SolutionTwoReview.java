package week3;

import java.util.HashMap;
import java.util.Scanner;

public class SolutionTwoReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strLen = scanner.nextInt();
        String str = scanner.next();

        HashMap<Integer, String> keyPad = new HashMap<>();
        keyPad.put(1, "1.,?!");
        keyPad.put(2, "2ABC");
        keyPad.put(3, "3DEF");
        keyPad.put(4, "4GHI");
        keyPad.put(5, "5JKL");
        keyPad.put(6, "6MNO");
        keyPad.put(7, "7PQRS");
        keyPad.put(8, "8TUV");
        keyPad.put(9, "9WXYZ");


        String answer = "";
        int count = 0;
        char c = str.charAt(0);
        for (int i = 1; i < strLen; i++) {
            if (i == strLen - 1) {
                count += 1;
                if (count >= (keyPad.get(Integer.parseInt(String.valueOf(c))).length())) {
                    count = (count % (keyPad.get(Integer.parseInt(String.valueOf(c))).length())) + 1;
                }
                answer += String.valueOf(keyPad.get(Integer.parseInt(String.valueOf(c))).charAt(count));
            } else {
                if (c == str.charAt(i)) {
                    count++;
                    if (count >= (keyPad.get(Integer.parseInt(String.valueOf(c))).length())) {
                        count %= ((keyPad.get(Integer.parseInt(String.valueOf(c))).length())) + 1;
                    }
                } else {
                    answer += String.valueOf(keyPad.get(Integer.parseInt(String.valueOf(c))).charAt(count));
                    count = 0;
                }
                c = str.charAt(i);
            }
        }

        System.out.println(answer);
    }
}
