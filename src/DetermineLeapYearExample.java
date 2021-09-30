public class DetermineLeapYearExample {
    public static final int FOUR = 4;
    public static final int FOUR_HUNDRED = 400;
    public static final int HUNDRED = 100;
    public static final int YEAR_TO_CHECK = 2014;
    public static void main(String[] args) {

        //year we want to check
        int year = YEAR_TO_CHECK;

        //if year is divisible by 4, it is a leap year
        do {
            if ((year % FOUR_HUNDRED == 0) || ((year % FOUR == 0) && (year % HUNDRED != 0))) {
                System.out.println("Year " + year + " is a leap year");
            } else {
                System.out.println("Year " + year + " is not a leap year");
            }
            year--;
        } while (year > 0);
    }
}