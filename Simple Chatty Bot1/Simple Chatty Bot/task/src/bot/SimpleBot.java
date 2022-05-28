package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");
        String name = scanner.next();
        System.out.printf("What a great name you have, %s!%n",name);
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = scanner.nextInt();
        scanner.nextLine();
        int remainder5 = scanner.nextInt();
        scanner.nextLine();
        int remainder7 = scanner.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.printf("Your age is %d; that's a good time to start programming!%n", age);
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int upperNumber = scanner.nextInt();
        for (int i = 0; i <= upperNumber; i++) {
            System.out.printf("%d!%n", i);
        }
        System.out.println("Let's test your programming knowledge.\nWhy do we use methods?");
        System.out.println("1. To repeat a statement multiple times.\n" +
                        "2. To decompose a program into several small subroutines.\n" +
                        "3. To determine the execution time of a program.\n" +
                        "4. To interrupt the execution of a program.");
        int response = 0;
        int counter = 0;
        while  (response != 2) {
            response = scanner.nextInt();
            scanner.nextLine();
            if (counter != 0) {
                System.out.println("Please, try again.");
            }
            counter++;
        }
        System.out.println("Congratulations, have a nice day!");
    }
}
