package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static final  int WATER_ML_PER_COUP = 200;
    public static final int MILK_ML_PER_COUP = 50;
    public static final int COFFEE_BEANS_G_PER_COUP = 15;

    public static int  howManyCups( int waterReserve, int milkReserve, int coffeeReserve) {
        int cupsToBeMade = -1;
        for (int i = 0; true; i++ ) {
            if ((waterReserve / WATER_ML_PER_COUP) >= i && (milkReserve / MILK_ML_PER_COUP) >= i &&
                    (coffeeReserve / COFFEE_BEANS_G_PER_COUP >= i) ) {
                cupsToBeMade++;
            } else {
                break;
            }
        } return cupsToBeMade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        System.out.println("Write how many cups of coffee you will need:");
        int nrOfCoups = scanner.nextInt();
        int totalWater = nrOfCoups * WATER_ML_PER_COUP;
        int totalMilk = nrOfCoups * MILK_ML_PER_COUP;
        int totalCoffee = nrOfCoups * COFFEE_BEANS_G_PER_COUP;
        System.out.printf("For %d cups of coffee you will need:%n%d ml of water%n%d ml of milk%n%d g of coffee beans ",
                nrOfCoups, totalWater, totalMilk, totalCoffee ); */
        System.out.println("Write how many ml of water the coffee machine has: ");
        int waterReserve = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkReserve = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int coffeeReserve = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cupsWanted = scanner.nextInt();
        String canBeDone = "Yes, I can make that amount of coffee ";
        String cannotBeDone = String.format("No, I can make only %d cup(s) of coffee", howManyCups(waterReserve,
                milkReserve,coffeeReserve) );
        if (waterReserve / WATER_ML_PER_COUP >= cupsWanted && milkReserve / MILK_ML_PER_COUP >= cupsWanted &&
                coffeeReserve / COFFEE_BEANS_G_PER_COUP >= cupsWanted ) {
            if (howManyCups(waterReserve, milkReserve, coffeeReserve) > cupsWanted) {
                System.out.println(canBeDone+ "(and even " + (howManyCups(waterReserve,
                        milkReserve, coffeeReserve)-cupsWanted) +  " more than that)");
            } else if (howManyCups(waterReserve, milkReserve, coffeeReserve) == cupsWanted) {
                System.out.println(canBeDone);
            }
         } else {
            System.out.println(cannotBeDone);
        }
    }
}
