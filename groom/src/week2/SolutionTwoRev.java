package week2;

import java.util.Scanner;

public class SolutionTwoRev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strLen = scanner.nextInt();
        String str = scanner.next();

        int answer = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i+1) != str.charAt(i)){
                answer += 1;
            }
            if(i+1 == str.length()-1){
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
