package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        StarPrint(num);

    }

    public static void StarPrint(int num){
        int count = num / 3;
        int blankNum = 0;
        for (int i = 0; i < count ; i++) {
            for (int j = 0; j < count; j++) {
                if(blankNum == 4){
                    Blank(count);
                }
                ThreeStar(num, count);
                blankNum ++;
            }
        }
    }

    public static void ThreeStar(int num, int count){ // 9 3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == 1 && j ==1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void Blank(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
