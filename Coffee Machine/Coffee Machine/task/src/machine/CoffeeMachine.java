package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static int waterReserveMl = 400;
    public static int milkReserveMl = 540;
    public static int coffeeBeansReserveG = 120;
    public static int nrOfDisposableCups = 9;
    public  static int dollarsAmount =550;
    public static Scanner scanner = new Scanner(System.in);
    public static final int[] ESPRESSO_RECIPE = {250, 0, 16, 4};
    public static final int [] LATTE_RECIPE = {350, 75, 20, 7 };
    public static final int[] CAPUCCINO_RECIPE = {200, 100, 12, 6};
    public static String coffeeType= "";

    public static boolean checkResources(int[] recipe) {
        return waterReserveMl - recipe[0] >= 0 && milkReserveMl - recipe[1] >= 0 && coffeeBeansReserveG - recipe[2] >= 0
                && nrOfDisposableCups > 1;
    }
    public static String insufficientResources (int[] recipe, String coffeeType) {
        int value = 0;
        String output = "";
        int[] toCompare = new int[0];
        switch (coffeeType) {
            case "ESPRESSO":
                toCompare = ESPRESSO_RECIPE;
                break;
            case "LATTE":
                toCompare = LATTE_RECIPE;
                break;
            case "CAPUCCINO":
                toCompare = CAPUCCINO_RECIPE;
                break;
        }
        if (!checkResources(recipe)){
            for (int i=0; i < 3; i++ ) {
                if (recipe[i] - toCompare[i] < 0) {
                    value = i;
                    break;
                }
            }
            if (value == 0) {
                output ="water";
            } else if ( value == 1){
                output ="milk";
            } else {
                output ="coffee";
            }

            return String.format("Sorry, not enough %s!", output);
        }
        return "I have enough resources, making you a coffee!";
    }

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String inputBuy = scanner.nextLine();
        switch (inputBuy) {
            case "1":
                coffeeType = "ESPRESSO";
                if (checkResources(ESPRESSO_RECIPE)) {
                    System.out.println("I have enough resources, making you a coffee!");
                    waterReserveMl -= ESPRESSO_RECIPE[0];
                    milkReserveMl -= ESPRESSO_RECIPE[1];
                    coffeeBeansReserveG -= ESPRESSO_RECIPE[2];
                    nrOfDisposableCups--;
                    dollarsAmount += ESPRESSO_RECIPE[3];
            } else {
                    System.out.println(insufficientResources(ESPRESSO_RECIPE, "ESPRESSO"));
                }

                break;
            case "2":
                coffeeType = "LATE";
                if (checkResources(LATTE_RECIPE)) {
                    System.out.println("I have enough resources, making you a coffee!");
                    waterReserveMl -= LATTE_RECIPE[0];
                    milkReserveMl -= LATTE_RECIPE[1];
                    coffeeBeansReserveG -= LATTE_RECIPE[2];
                    nrOfDisposableCups--;
                    dollarsAmount += LATTE_RECIPE[3];
                }
                else {
                    System.out.println(insufficientResources(LATTE_RECIPE, "LATTE"));
                }

                break;
            case "3":
                coffeeType = "CAPUCCINO";
                if (checkResources(CAPUCCINO_RECIPE)) {
                    System.out.println("I have enough resources, making you a coffee!");
                    waterReserveMl -= CAPUCCINO_RECIPE[0];
                    milkReserveMl -= CAPUCCINO_RECIPE[1];
                    coffeeBeansReserveG -= CAPUCCINO_RECIPE[2];
                    nrOfDisposableCups--;
                    dollarsAmount += CAPUCCINO_RECIPE[3];
                } else {
                    System.out.println(insufficientResources(CAPUCCINO_RECIPE, "CAPUCCINO"));
                }

                break;
            case "back":
                break;
        }


    }
    public static void fill() {
        System.out.println("Write how many ml of water you want to add: ");
        waterReserveMl += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milkReserveMl += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        coffeeBeansReserveG += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        nrOfDisposableCups += scanner.nextInt();
    }
    public static void take() {
        System.out.println();
        System.out.printf("I gave you $%d", dollarsAmount);
        dollarsAmount = 0;

    }
    public static void machineStatus() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water%n",waterReserveMl);
        System.out.printf("%d ml of milk%n", milkReserveMl);
        System.out.printf("%d g of coffee beans%n", coffeeBeansReserveG);
        System.out.printf("%d disposable cups%n", nrOfDisposableCups);
        System.out.printf("$%d of money%n", dollarsAmount);
        System.out.println();
    }

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String input = scanner.nextLine();
            switch (input) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    machineStatus();
                    break;
                case "exit":
                    flag = false;
                    break;
            }
        }
    }
}