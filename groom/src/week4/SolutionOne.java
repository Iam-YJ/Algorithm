package week4;

import java.util.*;

public class SolutionOne {
    public static void main(String[] args) {
        // deposit : 주어진 금액 k만큼 계좌에 돈 입금
        // pay : 주어진 금액 k만큼 계좌에서 돈 결제
        //          (단 계좌의 현재 잔액이 k보다 적으면 결제 안됨)
        // reservation : 주어진 금액 k만큼 계좌에서 돈 결제
        //          (단 계좌의 현재 잔액이 k보다 적거나
        //              대기 목록에 다른 거래가 결제 대기 중이면 결제 안되고 대기 맨 뒤 추가)
        // 대기 목록에 있떤 거래들은 순서대로 결제 + 금액 차감 후 삭제
        Scanner scanner = new Scanner(System.in);
        int bankBalance = scanner.nextInt();
        int payCount = scanner.nextInt();

        List<Pay> payList = new ArrayList<>();
        List<Integer> reservationList = new ArrayList<>();

        for (int i = 0; i < payCount; i++) {
            String type = scanner.next();
            int money = scanner.nextInt();

            payList.add(new Pay(type, money));
        }

        for (Pay pay : payList) {
            if (pay.getType().equals("deposit")) {
                bankBalance += pay.getMoney();
            } else if (pay.getType().equals("pay")) {
                if (bankBalance >= pay.getMoney()) {
                    bankBalance -= pay.getMoney();
                }
            } else if (pay.getType().equals("reservation")) {
                if (reservationList.size() != 0) {
                    reservationList.add(pay.getMoney());
                } else {
                    if (bankBalance >= pay.getMoney()) {
                        bankBalance -= pay.getMoney();
                    } else {
                        reservationList.add(pay.getMoney());
                    }
                }
            }
        }

        for (Integer reservationMoney : reservationList) {
            if (bankBalance >= reservationMoney) {
                bankBalance -= reservationMoney;
            } else {
                break;
            }
        }

        System.out.println(bankBalance);
    }
}

class Pay {
    String type;
    int money;

    public Pay(String type, int money) {
        this.type = type;
        this.money = money;
    }

    public String getType() {
        return type;
    }

    public int getMoney() {
        return money;
    }
}
