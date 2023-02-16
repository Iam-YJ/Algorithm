package study.week7.accumulate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number16510 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int workCount = Integer.parseInt(st.nextToken());
        int hourWorkCount = Integer.parseInt(st.nextToken());

        int[] workArr = new int[workCount + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < workCount; i++) {
            workArr[i + 1] = workArr[i] + Integer.parseInt(st.nextToken());
        }

        while (hourWorkCount != 0) {
            int possibleHour = Integer.parseInt(br.readLine());

            int left = 1;
            int right = workCount;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (workArr[mid] > possibleHour) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            System.out.println(right);

            hourWorkCount--;
        }
    }
}
