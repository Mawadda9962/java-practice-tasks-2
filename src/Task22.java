public class Task22 {
    public static void main(String[] args) {
        System.out.println(alarmClock(1, false));
    }

    public static String alarmClock(int day, boolean vaction) {
        if (day >= 1 && day <= 5) {
            if (vaction) {
                return "7:00";
            } else {
                return "10:00";
            }

        } else if (day >= 0 && day <= 6) {
            if (vaction) {
                return "off";
            } else {
                return "10;00";
            }
        } else {
            return "Invalid day";
        }
    }

}



