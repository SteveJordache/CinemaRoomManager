import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstHour = scanner.nextInt();
        int firstMinutes = scanner.nextInt();
        int firsSeconds = scanner.nextInt();
        int secondHour = scanner.nextInt();
        int secondMinutes = scanner.nextInt();
        int secondSeconds = scanner.nextInt();
        int hourDif, minDif, secondDif;
        hourDif = secondHour - firstHour;
        minDif  = secondMinutes - firstMinutes;
        secondDif = secondSeconds - firsSeconds;
        System.out.println(hourDif * 3600 + minDif*60 +secondDif);
    }
}