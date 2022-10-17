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

        List<Attendance> attendances = new ArrayList<>();

        for (int i = 0; i < peopleCount; i++) {
            String name = scanner.next();
            Double score = scanner.nextDouble();
            attendances.add(new Attendance(name, score));
        }

        attendances.sort(Comparator.comparing(Attendance::getName).thenComparing(Attendance::getScore));

        for (int i = 0; i < attendances.size(); i++) {
            if (i == (findNum - 1)) {
                System.out.print(attendances.get(i).getName() + " ");
                System.out.printf("%.2f", attendances.get(i).getScore());
            }
        }
    }
}

class Attendance {
    String name;
    Double score;

    public Attendance(String name, Double score) {
        this.name = name;
        this.score = (score);
    }

    public String getName() {
        return name;
    }

    public Double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + ' ' + score;
    }
}
