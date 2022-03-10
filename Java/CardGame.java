import java.util.Random;

public class CardGame {
    public static void main(String[] args) {
        CardGame cardGame = new CardGame();
        cardGame.cardGame();
    }

    private void cardGame() {
        //무작위로 카드를 2장을 뽑아서 숫자가 큰 사람이 이김.
        // 단 조커를 뽑으면 그 사람이 무조건 이김
        //
        //배열로 카드를 만들어서 사용해보기
        //가로: 하트 < 스페이스 < 클로버 < 다이아몬드
        //세로: A < 2~10 < J < Q < K
        //조커 2개가 존재.
        //무승부가 있을 수 있음(ex: 둘 다 조커)

        Random random = new Random();

        String[] row = {"하트", "스페이스", "클로버", "다이아몬드", ""}; // 가로
        String[] column = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; // 세로

        String[][] card = new String[row.length][column.length];

        // 카드 생성
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[i].length; j++) {
                card[i][j] = row[i] + column[j];
            }
        }

        // 조커 넣기
        for (int i = 1; i < 3; i++) {
            int joker = random.nextInt(12) + 1;
            card[4][joker] = "조커";
        }

        int[] userCard = new int[2];

        // 유저 각 1장씩 뽑기
        for (int i = 0; i < userCard.length; i++) {
            int rowRandom = random.nextInt(row.length) + 1;
            int colRandom = random.nextInt(column.length) + 1;
//            userCard[i] = card[rowRandom][colRandom];
            userCard[i] = (rowRandom * 10) + colRandom;
        }


        // 유저 카드 확인 출력
        for (int i = 0; i < userCard.length; i++) {
            System.out.print(userCard[i] + " ");
            System.out.println();

            for (int j = 0; j < i; j++) {
                if (userCard[i] / 10 > userCard[j] / 10) {
                    System.out.println("유저" + (i+1) + "의 승리입니다.");
                } else if (userCard[i] / 10 < userCard[j] / 10) {
                    System.out.println("유저" + (j+1) + "의 승리입니다.");
                } else if (userCard[i] / 10 == userCard[j] / 10) {
                    if (userCard[i] % 10 > userCard[j] % 10) {
                        System.out.println("유저" + (i+1) + "의 승리입니다.");
                    } else if (userCard[i] % 10 ==  userCard[j] % 10){
                        System.out.println("무승부 입니다");
                    }else{
                        System.out.println("유저" + (j+1) + "의 승리입니다.");
                    }
                }
            }

        }

    }
}
