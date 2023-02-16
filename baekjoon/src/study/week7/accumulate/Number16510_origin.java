package study.week7.accumulate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number16510_origin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int workCount = Integer.parseInt(st.nextToken());
        int hourWorkCount = Integer.parseInt(st.nextToken());

        int[] workArr = new int[workCount];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < workCount; i++) {
            workArr[i] = Integer.parseInt(st.nextToken());
        }

        int[] possibleWorkHours = new int[hourWorkCount];
        for (int i = 0; i < hourWorkCount; i++) {
            possibleWorkHours[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        for (int i = 0; i < hourWorkCount; i++) {
            int workHourSum = 0;
            int answer = 0;

            for (int j = 0; j < workCount; j++) {
                workHourSum += workArr[j];

                if (workHourSum > possibleWorkHours[i]) {
                    break;
                } else {
                    answer += 1;
                }
            }
            System.out.println(answer);
        }
    }

}
