import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int totalNumberOfDesk = 0;
        for (int i = 0; i < 3; i++) {
            int numberOfStudents = scanner.nextInt();
            totalNumberOfDesk = totalNumberOfDesk + (numberOfStudents / 2 + numberOfStudents % 2);
        }
        System.out.println(totalNumberOfDesk);
    }
}