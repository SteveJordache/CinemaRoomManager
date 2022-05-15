import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nrOfElements = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < nrOfElements; i++) {
            int element = scanner.nextInt();
            sum = element % 6 == 0 ? sum + element : sum;
        }
        System.out.println(sum);
    }
}