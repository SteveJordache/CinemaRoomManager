import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startValue = scanner.nextInt();
        int endValue = scanner.nextInt();
        String out;
        for (int i = startValue; i <= endValue; i++) {
            out = i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : String.valueOf(i);
            System.out.println(out);
        }
    }
}