package week1;


import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionOne {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(scanner.nextLong());
        }

        long answer = 1;
        for (int i = 0; i < list.size(); i++) {
            answer *= list.get(i);
        }

        System.out.println(answer);
    }
}
