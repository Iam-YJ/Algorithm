package study.week6.divideandconquer;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1074 {
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int size = (int) Math.pow(2, N);

        Divide(size, r, c);

        System.out.println(count);
    }

    public static void Divide(int size, int r, int c) {
        if (size == 1) { // 네모 크기
            return;
        }
        int newSize = (size / 2);
        if (r < newSize && c < newSize) {
            Divide(newSize, r, c);
        } else if (r < newSize && c >= newSize) {
            count += ((size * size) / 4);
            Divide(newSize, r, (c - newSize));
        } else if (r >= newSize && c < newSize) {
            count += ((size * size) / 4) * 2;
            Divide(newSize, (r - newSize), c);
        } else {
            count += ((size * size) / 4) * 3;
            Divide(newSize, (r - newSize), (c - newSize));
        }

    }
}
