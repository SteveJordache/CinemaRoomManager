package machine;
import java.util.Scanner;

public class CoffeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        machineState status = machineState.ON;
        CoffeeRobot robot = new CoffeeRobot(400, 540, 120, 9, 550, status);
        while (!robot.getState().name().equals("EXIT")) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String desire = scanner.next();
            switch (desire) {
                case "buy":
                    final int[] ESPRESSO = {250, 0, 16, 4};
                    final int[] LATTE = {350, 75, 20, 7};
                    final int[] CAPPUCCINO = {200, 100, 12, 6};
                    int[] existentResources = robot.machineStatus();
                    int cups = robot.getCupsReserve();
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String coffeeDesired = scanner.next();
                    switch (coffeeDesired) {
                        case "1":
                            if (buy(ESPRESSO, existentResources, cups)) {
                                robot.adjustResources(ESPRESSO);
                            }
                            break;
                        case "2":
                            if (buy(LATTE, existentResources, cups)) {
                                robot.adjustResources(LATTE);
                            }
                            break;
                        case "3":
                            if (buy(CAPPUCCINO, existentResources, cups)) {
                                robot.adjustResources(CAPPUCCINO);
                            }
                            break;
                        default:
                            break;

                    }
                    break;
                case "fill":
                    int[] resources = new int[4];
                    System.out.println("Write how many ml of water you want to add:");
                    resources[0] = scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    resources[1] = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    resources[2] = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    resources[3] = scanner.nextInt();
                    robot.fillMachine(resources);
                    break;
                case "take":
                    System.out.printf("I gave you $%d%n", robot.takeMoney());
                    break;
                case "remaining":
                    int[] values = robot.machineStatus();
                    System.out.println("The coffee machine has:");
                    System.out.printf("%d ml of water%n", values[0]);
                    System.out.printf("%d ml of milk%n", values[1]);
                    System.out.printf("%d g of coffee beans%n", values[2]);
                    System.out.printf("%d disposable cups%n", values[3]);
                    System.out.printf("$%d of money%n", values[4]);
                    System.out.println();
                    break;
                case "exit":
                    robot.setState(machineState.EXIT);
            }
        }
    }

    public static boolean buy(int[] recipe, int[] resources, int cups) {
        int index = Integer.MIN_VALUE;
        boolean isPossible = true;
        String motiv;
        for (int i = 0; i < 3; i++) {
            if (resources[i] - recipe[i] < 0 || cups < 1) {
                isPossible = false;
                index = i;
                break;
            }
        }
        if (isPossible) {
            System.out.println("I have enough resources, making you a coffee!");
            return true;
        } else {
            if (index == 0 && cups > 1) {
                motiv = "water";
            } else if (index == 1 && cups > 1) {
                motiv = "milk";
            } else if (index == 2 && cups > 1) {
                motiv = "coffee beans";
            } else {
                motiv = "cups";
            }
            System.out.printf("Sorry, not enough %s!%n", motiv);
            return false;
        }
    }
}

enum machineState {
    ON, EXIT
}

class CoffeeRobot {
    int waterReserve;
    int milkReserve;
    int beansReserve;
    int cupsReserve;
    int money;
    machineState state;

    public CoffeeRobot(int waterReserve, int milkReserve, int beansReserve, int cupsReserve, int money, machineState state) {
        this.waterReserve = waterReserve;
        this.milkReserve = milkReserve;
        this.beansReserve = beansReserve;
        this.cupsReserve = cupsReserve;
        this.money = money;
        this.state = state;
    }
    public machineState getState() {
        return state;
    }
    public void setState(machineState state) {
        this.state = state;
    }
    public int[] machineStatus(){
        return new int[]{this.waterReserve, this.milkReserve, this.beansReserve, this.cupsReserve, this.money};
    }
    public void fillMachine(int[] resources) {
        this.waterReserve += resources[0];
        this.milkReserve += resources[1];
        this.beansReserve += resources[2];
        this.cupsReserve += resources[3];
    }
    public int takeMoney() {
        int money = this.money;
        this.money = 0;
        return money;
    }

    public int getCupsReserve() {
        return cupsReserve;
    }
    public void adjustResources(int[] recipe) {
        this.waterReserve -= recipe[0];
        this.milkReserve -= recipe[1];
        this.beansReserve -= recipe[2];
        this.cupsReserve--;
        this.money += recipe[3];
    }
}

