package week4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SolutionOneReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bankBalance = scanner.nextInt();
        int count = scanner.nextInt();
        Queue<Integer> reservationQueue = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            String type = scanner.next();
            int balance = scanner.nextInt();
            if (type.equals("deposit")) {
                bankBalance += balance;

                while (!reservationQueue.isEmpty() && reservationQueue.peek() <= bankBalance) {
                    bankBalance -= reservationQueue.poll();
                }
            }

            if (type.equals("pay")) {
                if (bankBalance >= balance) {
                    bankBalance -= balance;
                }
            }

            if (type.equals("reservation")) {
                if (reservationQueue.isEmpty() && bankBalance >= balance) {
                    bankBalance -= balance;
                } else {
                    reservationQueue.add(balance);
                }
            }
        }

        System.out.println(bankBalance);


    }
}
