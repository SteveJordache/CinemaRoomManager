import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String exitInfo = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String returnInfo;
            int value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            returnInfo = value % 2 == 0 ? "even" : "odd";
            exitInfo += returnInfo + "\n";
        }
        System.out.println(exitInfo);
    }
}