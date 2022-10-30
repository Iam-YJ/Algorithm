package week3;

import java.util.*;

public class SolutionFourReview {

    static boolean[] visted; // 방문 여부 기록용
    static ArrayList<Integer> cycle = new ArrayList<>(); //
    static LinkedList<Integer>[] waterMap;

    static int find = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 물탱크 수, 수로의 수
        visted = new boolean[n + 1];
        waterMap = new LinkedList[n + 1];

        for (int i = 0; i <= n; i++) {
            waterMap[i] = new LinkedList<Integer>();
        }

        for (int i = 0; i < n; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            waterMap[start].add(end);
            waterMap[end].add(start);
        }

        dfs(1, 1);


    }

    public static void dfs(int node, int point) {
        if (visted[node]) {
            find = node;
            cycle.add(node);
            return;
        }

        visted[node] = true;


        for (int i : waterMap[node]) {
            if (i == point) {
                continue;
            }
            dfs(i, node);

            if (find == -2) {
                return;
            }

            if (find == node) {
                find = -2;
                return;
            }

            if (find >= 0) {
                return;
            }
        }
    }

}
