import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nrOfGrades = scanner.nextInt();
        int aGrades = 0;
        int bGrades = 0;
        int cGrades = 0;
        int dGrades = 0;
        for (int i = 0; i < nrOfGrades; i++) {
            String grade = scanner.next();
            if (Objects.equals(grade, "A")) {
                aGrades++;
            } else if (Objects.equals(grade, "B")) {
                bGrades++;
            } else if (Objects.equals(grade,"C")) {
                cGrades++;
            } else if (Objects.equals(grade, "D")) {
                dGrades++;
            }
        }
        System.out.print(dGrades + " " + cGrades + " " + bGrades + " " + aGrades + "\n");
    }
}