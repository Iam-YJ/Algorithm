package week3;

import java.util.*;

public class SolutionThreeReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 섬의 갯수
        int m = scanner.nextInt(); // 다리의 갯수
        int k = scanner.nextInt(); // 최대 다리의 갯수

        boolean visited[] = new boolean[n + 1];

        LinkedList<Integer>[] adList = new LinkedList<>[n + 1];

        for (int i = 0; i <= n; i++) {
            adList[i] = new LinkedList<Integer>();
        }

        // 양방향 노드 만들기
        for (int i = 0; i < m; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            adList[start].add(end);
            adList[end].add(start);
        }

    }

    public static void bfs(int v, LinkedList<Integer>[] adList, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[v] = true;
        queue.add(v);

        while (queue.size() != 0) {
            v = queue.poll();
            System.out.print(v + " ");

            Iterator<Integer> iter = adList[v].listIterator();
            while (iter.hasNext()) {
                int w = iter.next();
                if (!visited[w]) {
                    visited[w] = true;
                    queue.add(w);
                }
            }
        }
    }
}


