package week5;

import java.util.*;

public class SolutionTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        Set<Integer> numSet = new HashSet<>();

        for (int i = 0; i < count; i++) {
            Integer number = scanner.nextInt();
            for (int j = 0; j < 2; j++) {
                numSet.add(Integer.parseInt(String.valueOf(String.valueOf(number).charAt(j))));
            }
        }

        ArrayList<Integer> numList = new ArrayList<>(numSet);
        Collections.sort(numList);

        for (int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));
        }


        for (int i = 0; i < numList.size(); i++) {
            System.out.print(numList.get(i));
        }


    }
}
