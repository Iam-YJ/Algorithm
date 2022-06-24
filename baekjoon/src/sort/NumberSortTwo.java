package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSortTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        List<Integer> numArr = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            numArr.add(scanner.nextInt());
        }

        numArr = Quick(numArr);

        for (int i = 0; i < numArr.size(); i++) {
            System.out.println(numArr.get(i));
        }
    }

    public static List<Integer> Quick(List<Integer> list) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> joined = new ArrayList<>();

        if (list.isEmpty()) {
            return joined;
        }
        int pivot = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < pivot) {
                left.add(list.get(i));
            } else if (list.get(i) == pivot) {
                continue;
            } else {
                right.add(list.get(i));
            }
        }

        left = Quick(left);
        right = Quick(right);

        joined.addAll(left);
        joined.add(pivot);
        joined.addAll(right);
        return joined;
    }


}
