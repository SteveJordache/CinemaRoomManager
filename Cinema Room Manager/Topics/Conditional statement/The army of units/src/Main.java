import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unitsNumber = scanner.nextInt();
        if (unitsNumber < 1) {
            System.out.println("no army");
        } else if (unitsNumber < 20) {
            System.out.println("pack");
        } else if (unitsNumber < 250) {
            System.out.println("throng");
        } else if (unitsNumber < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}