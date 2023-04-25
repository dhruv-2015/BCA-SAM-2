import java.util.Scanner;

class Time2 {
    int hour;
    int minute;

    Time2(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void addObj(int hour, int minute) {
        this.hour += hour;
        this.minute += minute;
        while (this.minute >= 60) {
            this.minute -= 60;
            this.hour++;
        }
        System.out.println("Minutes: " + this.minute);
        System.out.println("Hours: " + this.hour);
    }
}

public class s7_new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ennter Hours: ");
        int hour = sc.nextInt();
        System.out.print("Ennter minute: ");
        int minute = sc.nextInt();
        Time2 timeobj1 = new Time2(hour, minute);
        
        timeobj1.addObj(1, 20);
    }
}