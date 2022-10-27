package week3;

import java.util.*;

public class SolutionFourReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 물탱크 수, 수로의 수
        boolean[] visted = new boolean[n+1];

        LinkedList<Integer>[] waterMap = new LinkedList[n+1];

        for (int i = 0; i <= n ; i++) {
            waterMap[i] = new LinkedList<Integer>();
        }

        for (int i = 0; i < n; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            waterMap[start].add(end);
            waterMap[end].add(start);
        }

        for (int i = 0; i <= n; i++) {
            Collections.sort(waterMap[i]);
        }

        bfs(n, waterMap, visted);

    }

    public static void bfs(int n, LinkedList<Integer>[] waterMap, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        visited[n] = true;

        while(!queue.isEmpty()){
            n = queue.poll();
            System.out.print(n + " ");

            Iterator<Integer> iter = waterMap[n].listIterator();
            while(iter.hasNext()){
                int w = iter.next();
                if(!visited[w]){
                    visited[w] = true;
                    queue.add(w);
                }
            }

        }
    }
}
