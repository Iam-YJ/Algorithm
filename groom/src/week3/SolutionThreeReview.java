package week3;

import java.util.*;

public class SolutionThreeReview {
    static int n;
    static boolean[] visited;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt(); // 섬 갯수
        int m = scanner.nextInt(); // 다리 갯수
        int k = scanner.nextInt(); // 최대 다리 갯수

        visited = new boolean[n + 1]; // 방문 여부 검사용 배열

        LinkedList<Integer>[] adjList = new LinkedList[n + 1];

        for (int i = 0; i <= n; i++) {
            adjList[i] = new LinkedList<Integer>();
        }

        // 두 정점 사이에 여러 개의 간선이 있을 수 있다
        // 입력으로 주어지는 간선은 양방향
        for (int i = 0; i < m; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            adjList[start].add(end);
            adjList[end].add(start);
        }

        /**
         * BFS 함수 호출
         * int v에 탐색을 시작할 정점의 번호가 들어있고, 이 시작 정점부터 탐색 시작
         *
         * 큐를 생성하고 시작 정점 v의 값을 큐에 넣는다
         *
         * 1. 큐의 front에 있는 정점을 꺼낸다 (poll)
         *    이를 기준으로 간선이 연결되어 있고,
         *    아직 방문되지 않은 정점을 찾는다
         *
         * 2. 조건에 맞는 정점을 찾는다면 해당 정점을 방문했음으로 표시 후 큐에 넣는다
         *
         * 3. 큐가 소진될 때까지 이를 반복하며 BFS 수행
         */
        bfs(1, adjList, visited);
        if (answer <= k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void bfs(int v, LinkedList<Integer>[] adjList, boolean[] visited) {
//        Queue<Integer> queue = new LinkedList<Integer>();
//        visited[v] = true;
//        queue.add(v);
//
//        while (queue.size() != 0) {
//            v = queue.poll();
//            System.out.println(v + " ");
//
//            Iterator<Integer> iter = adjList[v].listIterator();
//            while (iter.hasNext()) {
//                int w = iter.next();
//                if (!visited[w]) {
//                    visited[w] = true;
//                    queue.add(w);
//                }
//            }
//        }

        Queue<Go> queue = new LinkedList<>();
        queue.add(new Go(v, 0));
        visited[1] = true;

        while (!queue.isEmpty()) {
            int now = queue.peek().now;
            int cnt = queue.poll().cnt;

            if (now == n) {
                answer = Math.min(answer, cnt);
                return;
            }

            Iterator<Integer> iter = adjList[now].listIterator();
            while (iter.hasNext()) {
                int i = iter.next();
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(new Go(i, cnt + 1));
                }
            }
        }
    }
}

class Go {
    int now, cnt;

    public Go(int now, int cnt) {
        this.now = now;
        this.cnt = cnt;
    }
}
