import java.util.Scanner;

class ManufacturingController {
    public static int totalNumberOfProducts;
    // here you may declare a field

    public static String requestProduct(String product) {
        // write your code here
        totalNumberOfProducts++;
        return String.format("%d. Requested %s", totalNumberOfProducts, product);
    }

    public static int getNumberOfProducts() {
        // write your code here
        return totalNumberOfProducts;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();
            System.out.println(ManufacturingController.requestProduct(product));
            System.out.println(ManufacturingController.getNumberOfProducts());
        }
    }
}