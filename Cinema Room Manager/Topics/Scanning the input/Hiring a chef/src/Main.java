import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String yearsOfExperience = scanner.nextLine();
        String cuisinePreference = scanner.nextLine();
        System.out.println("The form for " + name + " is completed. We will contact you if we need a chef who cooks " +
                cuisinePreference + " dishes and has " + yearsOfExperience + " years of experience.");
    }
}