package week2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SolutionThreeRev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = scanner.nextInt();
        int findNum = scanner.nextInt();

        List<week3.Attendance> attendances = new ArrayList<>();

        for (int i = 0; i < peopleCount; i++) {
            attendances.add(new week3.Attendance(scanner.next(), scanner.next()));
        }

        attendances.sort(Comparator.comparing(week3.Attendance::getName).thenComparing(week3.Attendance::getScore));

        for (int i = 0; i < attendances.size(); i++) {
            if (i == (findNum-1)) {
                System.out.println(attendances.get(i).toString());
            }
        }
    }
}

class Attendance {
    String name;
    String scoreStr;
    int score;

    public Attendance(String name, String scoreStr) {
        this.name = name;
        this.scoreStr = (scoreStr);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + ' ' + scoreStr;
    }
}
