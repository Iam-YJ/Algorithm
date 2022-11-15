package week7;

import java.util.*;

public class SolutionOne2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] appCount = new int[102][2];
        for (int i = 0; i < N; i++) {
            int count = 1;
            int appUseCount = scanner.nextInt();
            for (int j = 0; j < appUseCount; j++) {
                int appNum = scanner.nextInt();
                appCount[appNum][0] = appNum;
                if (appCount[appNum][1] > 0) {
                    count = appCount[appNum][1] + 1;
                }
                appCount[appNum][1] = count;
            }
        }

        Arrays.sort(appCount, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                return o2[1] - o1[1];
            }
        });

        List<Integer> answer = new ArrayList<>();
        int maxCount = appCount[0][1];
        for (int i = 0; i < appCount.length; i++) {
            if (appCount[i][1] == maxCount) {
                answer.add(appCount[i][0]);
            } else {
                break;
            }
        }
        for (int i = answer.size() - 1; i >= 0; i--) {
            System.out.print(answer.get(i) + " ");
        }
    }
}
