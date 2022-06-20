package basicmathtwo;

import java.util.Scanner;

public class Bert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            Decimal(number);
        }
    }

    public static void Decimal(int num) {
        int [] numArray = new int[246912];
        int doubleNum = (num * 2);

        for (int i = 0; i <= doubleNum; i++) {
            numArray[i] = i;
        }

        for (int i = 2; i <= doubleNum ; i++) {
            if(numArray[i] == 0){
                continue;
            }

            for (int j = 2*i; j <=  ; j++) {

            }
        }

    }
}
