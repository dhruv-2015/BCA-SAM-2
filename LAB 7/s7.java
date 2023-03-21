import java.util.Scanner;

class Time {
    int hour;
    int minute;

    public static void addObj(Time obj1, Time obj2) {
        int newHours = obj1.hour + obj2.hour;
        int newMinute = obj1.minute + obj2.minute;
        if (newMinute >= 60) {
            newMinute = newMinute - 60;
            newHours = newHours + 1;
        }
        System.out.println("Minutes: " + newMinute);
        System.out.println("Hours: " + newHours);
    }

    public void getHourAndMinute(Scanner sc) {
        System.out.print("Ennter Hours: ");
        hour = sc.nextInt();
        System.out.print("Ennter minute: ");
        minute = sc.nextInt();
        while (minute >= 60) {
            System.out.print("You enter " + minute + " please enter minutes less then 60");
            minute = sc.nextInt();
        }
        System.out.println(hour + " hours and " + minute + " minutes stored");
    }
}


public class s7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time timeobj1 = new Time();
        Time timeobj2 = new Time();
        timeobj1.getHourAndMinute(sc);
        timeobj2.getHourAndMinute(sc);
        Time.addObj(timeobj1, timeobj2);
        

    }
}