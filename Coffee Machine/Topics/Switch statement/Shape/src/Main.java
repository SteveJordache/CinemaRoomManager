import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String input = scanner.next();
        String output0 = "There is no such shape!";
        String output = null;
        switch (input) {
            case "1":
                output = "square";
                break;
            case "2":
                output = "circle";
                break;
            case "3":
                output = "triangle";
                break;
            case "4":
                output = "rhombus";
                break;
            default:
                System.out.println(output0);
                break;

        }
        if (output != null) {
            System.out.printf("You have chosen a %s", output);
        }

    }
}