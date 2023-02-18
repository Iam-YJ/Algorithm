package study.week7.accumulate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number20438_origin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int studentNum = Integer.parseInt(st.nextToken()); // 총 학생 수
        int sleepingStudentNum = Integer.parseInt(st.nextToken()); // 자는 학생 수
        int sendStudentNum = Integer.parseInt(st.nextToken()); // 큐알 받을 학생 수
        int sectionNum = Integer.parseInt(st.nextToken()); // 범위

        boolean[] students = new boolean[5005];

        // 자는 학생 누구냐
        st = new StringTokenizer(br.readLine());
        boolean[] sleepStudents = new boolean[5005];
        for (int i = 0; i < sleepingStudentNum; i++) {
            if (!st.hasMoreTokens()) {
                break;
            }
            int sleepStudent = Integer.parseInt(st.nextToken());
            sleepStudents[sleepStudent] = true;
        }

        // 큐알 받을 학생들 누구냐
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < sendStudentNum; i++) {
            if (!st.hasMoreTokens()) {
                break;
            }
            int student = Integer.parseInt(st.nextToken());
            if (sleepStudents[student]) {
                continue;
            }
            int add = student;
            while (student <= (studentNum + 2)) {
                if (!sleepStudents[student]) {
                    students[student] = true;
                }
                student += add;
            }
        }

        // 답 출력
        int answer = 0;

        for (int i = 0; i < sectionNum; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = start; j <= end; j++) {
                if (!students[j]) {
                    answer += 1;
                }
            }
        }
        System.out.println(answer);
    }
}
