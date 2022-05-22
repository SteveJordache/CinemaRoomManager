import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        boolean verification = true;
        int nrOfElements = scanner.nextInt();
        int[][] workingArray = new int[nrOfElements][nrOfElements];
        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray[i].length; j++) {
                workingArray[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray[i].length; j++){
                if (workingArray[i][j] != workingArray[j][i]) {
                    verification = false;
                    break;
                }
            }
        }
        if (nrOfElements == 1) {
            result = "YES";
        } else {
            result = verification ? "YES" : "NO";
        }
        System.out.println(result);

    }
}