import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int durationDays = scanner.nextInt();
        int foodCostDay = scanner.nextInt();
        int oneWayFlight = scanner.nextInt();
        int nightHotel = scanner.nextInt();
        System.out.println((durationDays - 1) * nightHotel + oneWayFlight * 2 + foodCostDay * durationDays);
    }
}