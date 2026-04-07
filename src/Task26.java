public class Task26 {
    public static void main(String[] args) {
        System.out.println(izzString2(1));
    }

    public static String izzString2(int n) {
        if ((n % 3 == 0) && (n % 5 == 0)) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        } else {
            return n + "!";
        }
    }
}
