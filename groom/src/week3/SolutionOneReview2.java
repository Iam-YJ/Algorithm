package week3;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Scanner;

public class SolutionOneReview2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hashtable<Integer, Integer> couples = new Hashtable<>();
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            couples.put(scanner.nextInt(), 1);
        }

        int answer = 0;
        for(Integer key : couples.keySet()){
            int findCouple = key;
            if (couples.containsKey(findCouple * -1)) {
                continue;
            }else{
                answer += findCouple;
            }
        }

        System.out.println(answer);
    }
}
