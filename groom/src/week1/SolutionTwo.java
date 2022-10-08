package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SolutionTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(st.nextToken());
        String name = st.nextToken();

        ArrayList<String> nameList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            nameList.add(br.readLine());
        }

        int answer = 0;
        for (int i = 0; i < count; i++) {
            if (OneEditApart(name, nameList.get(i))) {
                answer += 1;
            }
        }
        sb.append(answer);
        System.out.println(sb);
    }

    public static boolean OneEditApart(String name1, String name2) {
        ArrayList<Integer> check = new ArrayList<>();
        for (int i = 0; i < name1.length(); i++) {
            for (int j = 0; j < name2.length(); j++) {
                if (name1.charAt(i) == name2.charAt(j)) {
                    check.add(1);
                }
            }
        }
        if(name1.length() == 1){
            if(check.size() >= 1){
                return true;
            }
        }

        if (check.size() >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
