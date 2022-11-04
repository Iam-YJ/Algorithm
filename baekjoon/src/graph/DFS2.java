package graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DFS2 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] visited;
    static int count;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int r = scanner.nextInt();

        visited = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            graph.get(start).add(end);
            graph.get(end).add(start);
        }

        for (int i = 0; i < graph.size(); i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        count = 1;

        dfs(r);

        for (int i = 1; i < visited.length; i++) {
            System.out.println(visited[i]);
        }
    }

    public static void dfs(int root) {
        visited[root] = count;

        for (int i : graph.get(root)) {
            if (visited[i] == 0) {
                count += 1;
                dfs(i);
            }
        }

    }
}
