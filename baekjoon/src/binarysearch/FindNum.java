package binarysearch;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class FindNum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numCount = Integer.parseInt(br.readLine());
        List<Integer> numList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numCount; i++) {
            numList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(numList);

        int findNumCount = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < findNumCount; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (numList.contains(num)) {
                bw.write(1 + "\n");
            } else {
                bw.write(0 + "\n");
            }
        }
        bw.flush();

    }
}
