package study.week7.accumulate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number20438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int studentNum = Integer.parseInt(st.nextToken()); // 총 학생 수
        int sleepingStudentNum = Integer.parseInt(st.nextToken()); // 자는 학생 수
        int sendStudentNum = Integer.parseInt(st.nextToken()); // 큐알 받을 학생 수
        int sectionNum = Integer.parseInt(st.nextToken()); // 범위

        boolean[] students = new boolean[5003];

        // 자는 학생 누구냐
        st = new StringTokenizer(br.readLine());
        int[] sleepStudents = new int[sleepingStudentNum];

        for (int i = 0; i < sleepingStudentNum; i++) {
            int sleepStudent = Integer.parseInt(st.nextToken());
            sleepStudents[i] = sleepStudent;
        }

        // 큐알 받을 학생들 누구냐
        int[] sendStudents = new int[sendStudentNum];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < sendStudentNum; i++) {
            int student = Integer.parseInt(st.nextToken());
            sendStudents[i] = student;
            students[student] = true;
        }

        // 숫자 범위
        int[][] numArr = new int[sectionNum][2];
        for (int i = 0; i < sectionNum; i++) {
            st = new StringTokenizer(br.readLine());
            numArr[i][0] = Integer.parseInt(st.nextToken());
            numArr[i][1] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int finalNum = studentNum + 2;
        while (true) {
            count++;

            if (count > finalNum) {
                break;
            }

            for (int i = 0; i < sendStudents.length; i++) {
                int checkOkStudent = (sendStudents[i] * count);
                students[checkOkStudent] = true;
            }
        }

        // 자는 학생 거르기
        for (int i = 0; i < sleepStudents.length; i++) {
            students[sleepStudents[i]] = false;
        }

        // 답 출력
        int answer = 0;

        for (int i = 0; i < sectionNum; i++) {
            int startNum = numArr[i][0];
            int endNum = numArr[i][1];

            for (int j = startNum; j <= endNum; j++) {
                if (!students[j]) {
                    answer += 1;
                }
            }
        }

        System.out.println(answer);
    }
}
