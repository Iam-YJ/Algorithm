package week6;

import java.util.Scanner;

public class SolutionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        String str = scanner.next();

        String answer = "";
        for (int i = 1; i < str.length(); i += 2) {
            int num = (int) Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))),2);
            char c = (char) (str.charAt(i - 1) + num);
            if(c > 122){
                c -= 26;
            }
            answer += c;
        }

        System.out.println(answer);


    }
}
