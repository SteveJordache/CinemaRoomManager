
class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me

        if (minutes >= 0 && minutes < 59) {
            minutes++;
        } else {
            minutes = 0;
            if (hours >= 1 && hours < 12) {
                hours++;
            } else {
                hours = 1;
            }
        }
        /*if (minutes < 10) {
            String minutesView = String.format("0%d", minutes);
            System.out.printf("The time is  %d:%s", hours, minutesView);
        } else {
            System.out.printf("The time is  %d:%d", hours, minutes);
        }*/
    }
}
/*

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.hours = 12;
        clock.minutes = 59;
        clock.next();
    }
}*/
