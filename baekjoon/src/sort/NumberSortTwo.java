package sort;

import java.util.Scanner;

public class NumberSortTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] numArr = new int[num];

        for (int i = 0; i < num; i++) {
            numArr[i] = scanner.nextInt();
        }

        int temp = 0;

        for (int i = numArr.length-1; i >= 0; i--) {
            int count = 0;
            for (int j = 1; j < numArr.length; j++) {
                if(numArr[j] < numArr[count]){
                    temp = numArr[j];
                    numArr[j] = numArr[count];
                    numArr[count] = temp;
                }
                count ++;
            }
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }
    }
}
