import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputKeyboard = in.nextLine();
        String[] stringToCompare = inputKeyboard.split(" ");
        boolean ordered = true;
        // System.out.println(Arrays.toString(stringToCompare));
        for (int i = 1; i < stringToCompare.length; i++) {
            // System.out.println("i-1" + stringToCompare[i-1] + " i " + stringToCompare[i]);
            if (stringToCompare[i - 1].compareTo(stringToCompare[i]) > 0) {
                ordered = false;
            }
        }
        System.out.println(ordered);
    }
}