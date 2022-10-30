package graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class DFS1 {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int r = scanner.nextInt();

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            graph[start].add(end);
            graph[end].add(start);
        }

        for (int i = 0; i <= n; i++) {
            Collections.sort(graph[i]);
        }

        dfs(r);
        System.out.println(0);

    }

    public static void dfs(int r){
        visited[r] = true;
        System.out.println(r);

        for(int i : graph[r]){
            if(!visited[i]){
                dfs(i);
            }

        }
    }
}
