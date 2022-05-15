import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nrOfParts = 0;
        int status = 0;
        int toBeShipped = 0;
        int toBeRepaired = 0;
        int rejects = 0;
        nrOfParts = scanner.nextInt();
        for (int i = 0; i < nrOfParts; i++) {
            status = scanner.nextInt();
            if (status == 0) {
                toBeShipped++;
            } else if (status == 1) {
                toBeRepaired++;
            } else if (status == -1) {
                rejects++;
            }
        }
        System.out.println(toBeShipped + " " + toBeRepaired + " " + rejects);
    }
}