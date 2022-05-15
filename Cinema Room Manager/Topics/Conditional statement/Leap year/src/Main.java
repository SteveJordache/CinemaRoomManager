import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearToCheck = scanner.nextInt();
        if (yearToCheck % 4 == 0) {
            if (yearToCheck % 100 == 0) {
                if (yearToCheck % 400 == 0){
                    System.out.println("Leap");
                } else {
                    System.out.println("Regular");
                }
            } else {
                System.out.println("Leap");
            }
        } else {
            System.out.println("Regular");
        }
    }
}