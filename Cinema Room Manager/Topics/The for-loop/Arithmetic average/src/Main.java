import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startValue = scanner.nextInt();
        int endValue = scanner.nextInt();
        float average;
        boolean divisible;
        float counter = 0;
        float sum = 0;
        for (int i = startValue; i <= endValue; i++) {
            divisible = i % 3 == 0 ? true : false;
            if (divisible) {
                counter++;
                sum += i;
            }
        }
        average = sum / counter;
        System.out.println(average);
    }
}