import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        if (inputNumber >= -14 &&  inputNumber !=14 && inputNumber!= 13 && inputNumber != 18
            && inputNumber != 17) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}