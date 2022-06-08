public class Main {

    public static void main(String[] args) {
        int counter = 0;

        // write your code here

        Secret[] temp = Secret.values();
        for (Secret loopVar : temp) {
            String transformedToString = loopVar.name();
            if (transformedToString.startsWith("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
/*

enum Secret {
    STAR, CRASH, START
}
*/
