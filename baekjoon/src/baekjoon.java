public class baekjoon {
    public static void main(String[] args) {
        baekjoon baekjoon = new baekjoon();
        baekjoon.Star2();
    }


    private void Star2() {
        for (int i = 0; i < 5; i++) {
            if (i < 3) {
                for (int j = 0; j < 3 - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j < j * 2; j++) {
                    System.out.print("&");
                }
//                for (int j = 0; j < 3; j -= 2) {
//                    System.out.print("*");
//                }
            }
            System.out.println();
        }

    }
}
