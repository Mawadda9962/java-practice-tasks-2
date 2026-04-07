public class Task25 {
    public static void main(String[] args) {
        System.out.println( answerCell (false, false, false));
    }
    public static  boolean answerCell(boolean isMorning, boolean isMam, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning) {
            if (isMam) {
                return true;
            } else {
                return false;
            }
        }
           return true;
          }

}


