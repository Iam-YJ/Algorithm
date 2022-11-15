package week7;

import java.util.*;

public class SolutionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();


        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int count = 1;
            int appCount = scanner.nextInt();
            for (int j = 0; j < appCount; j++) {
                int appNum = scanner.nextInt();
                if (countMap.containsKey(appNum)) {
                    count = countMap.get(appNum) + 1;
                }
                countMap.put(appNum, count);
            }
        }
//        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(countMap.entrySet());
//        entryList.sort(Map.Entry.comparingByValue());

        List<Integer> listKeySet = new ArrayList<>(countMap.keySet());
        Collections.sort(listKeySet, (value1, value2) -> (countMap.get(value2).compareTo(countMap.get(value1))));

        int firstCount = 0;
        int index = 0;
        List<Integer> answerList = new ArrayList<>();

        for (Integer key : listKeySet) {
            if (index == 0) {
                firstCount = countMap.get(key);
                answerList.add(key);
            } else {
                if (index > 0 && firstCount == countMap.get(key)) {
                    firstCount = countMap.get(key);
                    answerList.add(key);
                } else {
                    break;
                }
            }
            index++;
        }

        for (int i = answerList.size()-1; i >= 0; i--) {
            System.out.print(answerList.get(i) + " ");
        }
    }
}
