package firstPractices;

public class calculator {

    public static void calculate(String date)
    {
        int dt= Integer.parseInt(date.substring(0,2));
        int month = Integer.parseInt(date.substring(3,5));
        int year = Integer.parseInt(date.substring(6,10));
        //String day = dt+month+year;
        int day_of_week = 0;
        day_of_week = (dt +(13 * (month+1)/5)+year+(year/4)-(year/100)+(year/400))% 7;
        System.out.println(day_of_week);
        switch (day_of_week) {
            case 1 -> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");

        }
        //System.out.println(day);
        //return day_of_week;
    }
    public static void main(String[] args) {
        String date ="33/02/2024";
        System.out.println("the date is "+ date);
        System.out.println("the day of the week is " );
        calculate(date);
    }

}
