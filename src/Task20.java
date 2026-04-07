public class Task20 {
    public static void main(String[] args) {
        System.out.println(shareDigit(12, 23));
    }
    public static boolean shareDigit(int a, int b) {
        if ((a / 10 == b / 10) || (a / 10 == b % 10) || (a % 10 == b / 10) || (a % 10 == b % 10)) {
            return true;
        }
        return false;
    }

    }


