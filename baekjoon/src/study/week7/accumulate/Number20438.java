package study.week7.accumulate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number20438 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 학생 수
        int K = Integer.parseInt(st.nextToken()); // 조는 학생 수
        int Q = Integer.parseInt(st.nextToken()); // 출석 보낼 학생 수
        int M = Integer.parseInt(st.nextToken()); // 주어질 구간 수

        int[] students = new int[N + 3];

        boolean[] sleepStudents = new boolean[5005];
        boolean[] checkStudents = new boolean[5005];

        // 자는 사람들 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            if (!st.hasMoreTokens()) {
                break;
            }
            int sleepStudent = Integer.parseInt(st.nextToken());
            sleepStudents[sleepStudent] = true;
        }

        // 큐알 받은 사람들 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < Q; i++) {
            if (!st.hasMoreTokens()) {
                break;
            }
            int checkedStudent = Integer.parseInt(st.nextToken());
            if (sleepStudents[checkedStudent]) {
                continue;
            }
            int add = checkedStudent;
            while (checkedStudent <= (N + 2)) {
                if (!sleepStudents[checkedStudent]) {
                    checkStudents[checkedStudent] = true;
                }
                checkedStudent += add;
            }
        }

        for (int i = 3; i < (N + 3); i++) {
            int notAnswerStudent = 0;
            if (checkStudents[i]) {
                notAnswerStudent = 0;
            } else {
                notAnswerStudent = 1;
            }
            students[i] = students[i - 1] + notAnswerStudent;
        }

        // 구간만큼 학생 수 세기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            System.out.println(students[end] - students[start - 1]);
        }
    }
}
