import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine().trim();
        firstString = firstString.replaceAll("\\s", "");
        String secondString = scanner.nextLine().trim();
        secondString = secondString.replaceAll("\\s", "");
        System.out.println(firstString.equals(secondString));
    }
}