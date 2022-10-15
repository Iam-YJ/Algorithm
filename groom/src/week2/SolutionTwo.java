package week2;

import java.util.Scanner;

public class SolutionTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String str = scanner.next();

        String save = "";
        char current = str.charAt(0);
        int currentCount = 0;
        for(int i = 0; i < size; ++i) {
            if(current == str.charAt(i)) {
                ++currentCount;

            }else {
                // 같지 않으면 출력
                save += current;
                save += currentCount;

                if(i + 1 >= size) {
                    current = str.charAt(i);
                }else {
                    current = str.charAt(i+1);
                }
                currentCount = 1;
            }
        }

        save += current;
        save += currentCount;
        // 마지막에 출력
        System.out.println(save);
    }
}
