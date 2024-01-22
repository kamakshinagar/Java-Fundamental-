package firstPractices.classstuff;

public class Date {

    // is this a leap year
    // do these numbers form a plausible date?
    // what is the name of this month (enum? int?)
    // how many days are there in this month
    // what day of the week is this day, month, and year
    public static boolean leapyear(int year)
    {
        return ((year % 4) == 0 || (year % 400) == 0) && (year % 100) != 0;
    }
    public static void showDate(int day, int month, int year) {
        String[] names = {
                "January", "February","March","April","May","June","July","August","September","October","November","December"
        };
        System.out.println(day + "/" + names[month-1] + "/" + year);
    }
    public static void showMonth(int month) {
        String[] names = {
                "January", "February","March","April","May","June","July","August","September","October","November","December"
        };
        if (month > 0 && month <= 12)  System.out.println(names[month-1]);
        else throw new IllegalArgumentException("not a valid month");
    }
    public static boolean validDate(int day, int month, int year) {
        return (day > 0 && day <= 31) && (month > 0 && month <= 12) && (year > 0);
    }
    public static int daysinmonth(int month) {
        if ((month<1) || (month>12)) {
            throw new IllegalArgumentException("invalid number");
        }
        if (month == 2) return 28;
        if (month % 2==0)
            return 30;
        else
            return 31;

    }
    public static void main(String[] args) {
        System.out.println("is 2023 a leap year? "+leapyear(2023));
        System.out.println("How many days in January = "+daysinmonth(1));
        System.out.println("is this a valid date (09/21/2022)? "+ validDate(9,21,2022));
        System.out.println("what month is 3?");
        showMonth(3);
    }

}
