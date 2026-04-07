public class Task21 {
    public static void main(String[] args) {
        System.out.println(squirrelPlay(70, false));
    }


        public static boolean squirrelPlay(int temp, boolean isSummer) {
            if (isSummer == false) {
                if (temp >= 60 && temp <= 90) {
                    return true;
                } else {
                    return false;
                }
            } else { // isSummer == true
                if (temp >= 60 && temp <= 100) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }